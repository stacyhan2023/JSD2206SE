package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**聊天室服务端*/
public class Server {
    private ServerSocket serverSocket;

    public Server(){
        try {
            System.out.println("正在启动服务端。。。");
            serverSocket =new ServerSocket(8088);
            System.out.println("服务端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start(){//完成交互动作
        try {
            System.out.println("等待客户端链接。。。");
            Socket socket= serverSocket.accept();//阻塞方法
            System.out.println("一个客户端连接了！");

            //通过刚接受连接的socket，获取输入流来读取该客户端发送过来的消息
            InputStream in =socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
            BufferedReader br= new BufferedReader(isr);

            String line=br.readLine();
            System.out.println("客户端说；"+line);




        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server =new Server();
        server.start();

    }
}
