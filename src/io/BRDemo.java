package io;

import java.io.*;

/**缓冲字符输入流
 * 快读文本数据加速，可以直接按行读取字符串*/
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前源程序输出到控制台上
        //文件输入流
        FileInputStream fis =new FileInputStream("./src/io/BRDemo.java");
        //转换流，字节转字符
        InputStreamReader isr= new InputStreamReader(fis);
        //缓冲流
        BufferedReader br = new BufferedReader(isr);

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
       

    }
}
