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
        //客户端向服务端发送数据，则需要使用socket获取输出流，
        try {
            //网络流低级流
            OutputStream out = socket.getOutputStream();
            //转换流，字符转成字节
            OutputStreamWriter osw=new OutputStreamWriter(out, StandardCharsets.UTF_8);
            //缓冲流
            BufferedWriter bw =new BufferedWriter(osw);
            //高级流pw按行写
            PrintWriter pw= new PrintWriter(bw,true);

            Scanner scanner=new Scanner(System.in);
            while(true){
                String line= scanner.nextLine();
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Client client =new Client();
        client.start();

    }

}
