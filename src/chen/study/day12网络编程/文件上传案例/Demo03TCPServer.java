package chen.study.day12网络编程.文件上传案例;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    文件上传案例服务器端：读取客户端上传的文件，将文件保存服务器的硬盘上，给服务器回写上传成功

    实现步骤：
        1.创建一个SeverSocket对象，和系统要指定的端口号
        2.使用ServerSocket里的accept方法，获取到请求的Socket对象
        3.使用Socket对象中的方法getInputStream，获取到网络字节输入流对象
        4.判断硬盘中有没有这个文件夹，如果没有，创建一个
        5.创建一个本地字节输出流对象FileOutputStream
        6.使用网络字节输入流的方法read读取上传的文件
        7.使用本地字节输出流对象中的方法write把读取到的文件保存到服务器的硬盘上
        8.使用Socket对象中的方法getOutputStream
        9.使用网络字节输出流对象的write方法，回写上传成功
        10.释放资源

    注意：
        为什么会程序已经读写完毕，但是不停止呢，
        因为is.read(bytes)在while循环里是-1就会结束，while循环里是不会出现-1的，所以服务器接收不到-1，就会一直死循环等待接收结束标记
        所以不会回写上传成功，8，9，10步骤被卡住
        客户端读取不到回写数据也会进入阻塞状态，陷入死循环

        那么如何结束呢，只需要上传完文件，给服务器一个结束标记即可
 */
public class Demo03TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个SeverSocket对象，和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.使用ServerSocket里的accept方法，获取到请求的Socket对象
        Socket socket = serverSocket.accept();
        //3.使用Socket对象中的方法getInputStream，获取到网络字节输入流对象
        InputStream is = socket.getInputStream();
        //4.判断硬盘中有没有这个文件夹，如果没有，创建一个
        File file = new File("/Users/chen/Desktop/IO流的小栗子/a");
        if (!file.exists()){
            file.mkdirs();
        }
        //5.创建一个本地字节输出流对象FileOutputStream
        FileOutputStream fos = new FileOutputStream(file+"/信管1701陈凯博的职业生涯规划书.docx");
        //6.使用网络字节输入流的方法read读取上传的文件
        byte[] bytes = new byte[1024];
        int len;
        while((len = is.read(bytes))!=-1){
            //7.使用本地字节输出流对象中的方法write把读取到的文件保存到服务器的硬盘上
            fos.write(bytes,0,len);
        }
        //8.使用Socket对象中的方法getOutputStream
        OutputStream os = socket.getOutputStream();
        //9.使用网络字节输出流对象的write方法，回写上传成功
        os.write("上传成功".getBytes());
        //10.释放资源
        serverSocket.close();
        socket.close();
        fos.close();
    }
}
