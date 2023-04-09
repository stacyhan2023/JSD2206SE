package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**缓冲字符流是一个高级流*/
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //向文件pw.txt中写入文本数据
        PrintWriter pw= new PrintWriter("pw.txt");
        pw.println("i love dog");
        pw.println("i also love cat");
        System.out.println("over");
        pw.close();

    }
}
