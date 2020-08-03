package chen.study.day12网络编程.TCP协议;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP通信的服务器端，接收客户端的请求，读取客户端发送的数据，给客户端回写数据
    表示服务器的类：
            java.net.Sever:此类实现服务器套接字

    构造方法：
            SeverSocket(int port);创建绑定到特定端口的服务器套接字

    服务器端必须明确，必须得知道是哪个客户端连接的服务器，所以可以通过accept()方法获取到请求的客户端对象Socket

    成员方法：Socket accept();侦听并接收到此套接字的连接2.使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream
            3.使用网络字节输出流OutputStream的对象中的write()方法，给服务器发送数据

    服务器的实现步骤：
            1.创建服务器SeverSocket对象
            2.使用SeverSocket对象的方法accept()获取到请求的客户端对象
            3.用Socket对象的getInputStream()获取网络字节输入流InputStream对象
            4.使用网络字节输入流InputStream的对象的read()方法，获取客户端发送的数据
            5.使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream
            6.使用网络字节输出流OutputStream的对象中的write()方法，给客户端回写数据
            7.释放资源（Socket，SeverSocket）
 */
public class Demo03TCPSever {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));


        OutputStream os = socket.getOutputStream();
        os.write("你好，我已收到".getBytes());
        socket.close();
        server.close();
    }
}
