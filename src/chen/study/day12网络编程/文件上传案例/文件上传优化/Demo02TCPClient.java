package chen.study.day12网络编程.文件上传案例.文件上传优化;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    文件上传案例的客户端：读取本地文件，上传到服务器，读取服务器的回写的数据

    实现步骤：
    1.创建本地的字节输入流FileInputStream,构造方法中绑定要读取的数据源
    2.创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
    3.使用Socket中的方法getOutputStream，获得网络字节输出流的对象
    4.使用本地字节输入流，读取文件
    5.使用网络字节输出流，把文件上传到服务器
    5.创建Socket种方法getInputStream对象
    7.读取服务器回写的数据
    8.资源释放
 */
public class Demo02TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建本地的字节输入流FileInputStream,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("/Users/chen/Desktop/信管1701陈凯博职业生涯规划书.docx");
        //2.创建一个客户端Socket对象，构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",9999);
        //3.使用Socket中的方法getOutputStream，获得网络字节输出流的对象
        OutputStream os = socket.getOutputStream();
        //4.使用本地字节输入流，读取文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            //5.使用网络字节输出流，把文件上传到服务器
            os.write(bytes,0,len);
        }
        /*
        解决阻塞：
         上传完文件后，给服务器一个结束标记
         void shutdownOutput();禁用此套接字的输出流
         对于TCP套接字，任何以前写入的数据都将被发送，并且后跟TCP的正常序列
         */
        socket.shutdownOutput();

        //5.创建Socket种方法getInputStream对象
        InputStream is = socket.getInputStream();
        //7.读取服务器回写的数据
        while((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //8.资源释放
        fis.close();
        socket.close();
    }
}
