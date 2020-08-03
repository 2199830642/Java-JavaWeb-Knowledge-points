package chen.study.day12网络编程.TCP协议;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP通信的客户端向服务器发送连接请求
    给服务器发送数据，读取服务器回写的数据
    表示客户端的类：
            java.net.Socket:此类实现了客户端套接字，套接字是两个机器间通信的端点
            套接字：包含了IP地址和端口号的网络单位

    构造方法：
            Socket(String host,int port);创建一个流套接字，并将其连接到指定主机上的指定端口号
            参数：
                host：代表服务器主机的名称，也可以传递服务器的IP地址
                port：服务器端口号

    成员方法：OutputStream getOutputStream()返回此套接字的输出流
             InputStream getInputStream()返回此套接字的输入流
             close()关闭此套接字

    实现步骤：
            1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
            2.使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream
            3.使用网络字节输出流OutputStream的对象中的write()方法，给服务器发送数据
            4.使用Socket对象中的getInputStream()获取网络字节输入流对象InputStream
            5.使用网络字节输入流InputStream的对象的read()方法，获取服务器回写的数据
            6.释放资源(Socket)

    注意事项：1.客户端和服务器端进行交互，必须使用Socket中提供的网络流，不能使用自己创建的流对象
             2.当我们创建客户端对象Socket的时候，就回去请求服务器，和服务器进行"三次握手"，和服务器建立连接通路
               如果服务器没有启动，那么会抛出异常
 */
public class Demo02TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();
    }
}
