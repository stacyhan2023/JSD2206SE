package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**使用文件流完成复制文件*/
public class CopyDemo {
    public static void main(String[] args) throws IOException {
       //1 new 输入输出流
        FileInputStream fis = new FileInputStream("image.jpg");
        FileOutputStream fos =new FileOutputStream("image_copy.jpg");

        //2 赋值，记录每次读取的字节内容
        int d;
        //3 判断，循环
        long start =System.currentTimeMillis();
        while((d= fis.read())!= -1){
            fos.write(d);
        }
        long end=System.currentTimeMillis();
        //4 关闭流
        System.out.println("复制完毕,耗时："+(end-start)+"ms");
        fis.close();
        fos.close();

    }
}
