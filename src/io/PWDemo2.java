package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**自行完成流连接的创建*/
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //向文件中按行写入文本数据
        //创建文件流
        FileOutputStream fos= new FileOutputStream("pw2.txt");
        //转换流
        OutputStreamWriter osw= new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //缓冲流
        BufferedWriter bw=new BufferedWriter(osw);
        //高级流pw
        PrintWriter pw=new PrintWriter(bw,true);
        /***
         * 实现建议记事本功能
         * 将控制台输入的每一行字符串都按行写入到文件里
         * 如果在控制台上单独输入exit则程序退出
         */
        Scanner scanner=new Scanner(System.in);

        while(true){
            String line= scanner.nextLine();//获取字符串
            if("exit".equals(line)){
                break;//如果用户输入的是退出，则停止循环
            }
            pw.println(line);
           // pw.flush();有autoflush true了就不用了
        }

        System.out.println("over");
        pw.close();

    }
}
