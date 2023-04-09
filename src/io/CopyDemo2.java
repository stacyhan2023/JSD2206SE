package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**提高每次读写的数据量减少每次读写的数据提高读写效率
 * 块读写*/
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        //new 赋值 判断 关闭流
        FileInputStream fis = new FileInputStream("naruto.jpeg");
        FileOutputStream fos = new FileOutputStream("naruto_copy.jpeg");

        byte[] data=new byte[1024*10];//赋值数值大小
        int len =0;//记录每次实际读取的字节数
        //判断
        long start= System.currentTimeMillis();
        while((len= fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        long end=System.currentTimeMillis();
        System.out.println("输出完毕，耗时："+(end-start)+"ms");

       //关闭
        fis.close();
        fos.close();

    }
}
