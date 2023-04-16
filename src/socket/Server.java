package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**聊天室服务端*/
public class Server {
    /**
     * 运行在服务端的ServerSocket,主要作用有2个
     * 1：开启服务端口，客户端就是通过这个端口与服务端建立联系（ServerSocket构造方法）
     * 2:监听该端口，一旦一个客户端连接时，就会返回一个socket实例与其通讯（accept方法的作用）*/

    private ServerSocket serverSocket;

    //保存所有客户端的输出流用于广播消息
    //private PrintWriter[] allOut={};
    private Collection<PrintWriter> allOut= new ArrayList<>();

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
            while(true) {
                System.out.println("等待客户端链接。。。");
                Socket socket = serverSocket.accept();//阻塞方法
                System.out.println("一个客户端连接了！");
                //启动一个线程负责处理该客户端交互
                ClientHandler handler =new ClientHandler(socket);
                Thread t=new Thread(handler);
                t.start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server =new Server();
        server.start();

    }
    /**该线程任务负责与制定客户端进行交互*/
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//记录当前对应客户端的ip地址

        public ClientHandler(Socket socket){
            this.socket=socket;
            //通过socket获取远端计算机ip地址
            host= socket.getInetAddress().getHostAddress();

        }
        public void run() {
            PrintWriter pw=null;
            try {
                //通过刚接受连接的socket，获取输入流来读取该客户端发送过来的消息
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                //通过socket获取输出流类客户端发送消息
                OutputStream out = socket.getOutputStream();
                //转换流，字符转成字节
                OutputStreamWriter osw=new OutputStreamWriter(out,StandardCharsets.UTF_8);
                //缓冲流
                BufferedWriter bw =new BufferedWriter(osw);
                //高级流pw按行写
                 pw= new PrintWriter(bw,true);

                //处理并发安全问题 将该输出流存入到共享数组allout中
               // synchronized (this)不同线程看到的不同
                  //  synchronized (allOut)扩容是copy了新数组

 //               synchronized (Server.this) {
                    //将该输出流存入到共享数组allOut中。现将数组扩容，再将当前pw存入数组最后一个位置
//                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
//                    allOut[allOut.length - 1] = pw;
                    synchronized (allOut) {
                    allOut.add(pw);
                }
//                sendMessage(host+"上线了，当前在线人数："+allOut.length);
                sendMessage(host+"上线了，当前在线人数："+allOut.size());


                String line;
                while ((line = br.readLine()) != null) {
                   sendMessage(host+"说：" + line);
                    //将消息发送给所有客户端
                }
            } catch (IOException e) {
 //               e.printStackTrace();
            }finally {
                {
                    //处理客户端断开连接后的操作
                    //将pw从数组allOut中删除
 //                   synchronized (Server.this) {
//                        for (int i = 0; i < allOut.length; i++) {
//                            if (allOut[i] == pw) {
//                                allOut[i] = allOut[allOut.length - 1];
//                                allOut = Arrays.copyOf(allOut, allOut.length - 1);
//                                break;
//                            }
//                        }
                        synchronized (allOut) {
                        allOut.remove(pw);
                    }
 //                   System.out.println(host+"下线了。当前在线人数： "+allOut.length);
                    System.out.println(host+"下线了。当前在线人数： "+allOut.size());

                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        private void sendMessage(String message){
            System.out.println(message);
            //将消息发送给所有客户端
  //         synchronized (Server.this){
//            for(int i=0;i<allOut.length;i++) {
//                allOut[i].println(message);
//            }
            synchronized (allOut){
               for(PrintWriter pw:allOut){
                   pw.println(message);
               }


           }

        }
    }


}
