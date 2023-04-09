package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**从文件中读取字符串*/
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        //new file，new 输入流，创建数组，读数组，转换成字符串类型，打印，滚逼
        File file = new File("fos.txt");
        FileInputStream fis= new FileInputStream(file);
        byte[] data= new byte[(int)file.length()];
        fis.read(data);

        String line= new String(data, StandardCharsets.UTF_8);
        System.out.println(line);

        fis.close();

    }
}
