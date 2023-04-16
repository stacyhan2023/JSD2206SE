package socket;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket; //套接字，插座
    /**socket 实例化时候需要传入两个参数
     * 1服务端的地址信息
     * 2服务端打开的服务端口
     * */

    public Client(){
        try {
            System.out.println("正在连接服务端。。。");
            socket =new Socket("localhost",8088);//实例化的过程就是连接的过程
            System.out.println("与服务端建立连接！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        //将读取来自服务器消息的线程启动起来
        ServerHandle serveHandler = new ServerHandle();
        Thread t=new Thread(serveHandler);
        t.setDaemon(true);
        t.start();


        //客户端向服务端发送数据，则需要使用socket获取输出流，
        try {
            //网络流低级流
            OutputStream out = socket.getOutputStream();
            //转换流，字符转成字节
            OutputStreamWriter osw=new OutputStreamWriter(out,StandardCharsets.UTF_8);
            //缓冲流
            BufferedWriter bw =new BufferedWriter(osw);
            //高级流pw按行写
            PrintWriter pw= new PrintWriter(bw,true);


            Scanner scanner=new Scanner(System.in);
            while(true){
                String line= scanner.nextLine();//阻塞
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                /**socket的 close方法里封装了与服务器4次挥手操作，与服务器断开连接
                 * 并且该close还会在内部将通过socket获取的输入流与输出流关闭
                 * */
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();

    }

    private class ServerHandle implements  Runnable{
        public void run() {
            try {
            //通过socket获取输入流，用于读取服务端发送过来的消息
            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String line;

                while((line=br.readLine())!=null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

