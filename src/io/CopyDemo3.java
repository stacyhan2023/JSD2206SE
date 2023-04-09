package io;

import java.io.*;

/**使用缓冲流完成文件的复制操作*/
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        //new流，new缓冲流，赋值，时间，循环写出，关闭
        FileInputStream fis= new FileInputStream("naruto.jpeg");
        BufferedInputStream bis=new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("naruto_copy.jpeg");
        BufferedOutputStream bos= new BufferedOutputStream(fos);

        int d;//记录每次读取的字节内容
        long start=System.currentTimeMillis();
        while((d= bis.read())!=-1){
            bos.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"ms");

        bis.close();
        bos.close();

    }
}
