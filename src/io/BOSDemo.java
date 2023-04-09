package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**缓冲输出流的缓冲区问题*/
public class BOSDemo {
    public static void main(String[] args) throws IOException {
        //定义file，缓冲流，写字符串，放入data数组，写出数组，先过去，关闭
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String line ="小懒猫";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);

        bos.write(data);
        bos.flush();
        System.out.println("输出完毕");
        bos.close();





    }
}
