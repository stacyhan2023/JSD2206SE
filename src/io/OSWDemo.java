package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**字符流 ，转换流*/
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //new文本，高级转换流，赋值，写出，关闭
        FileOutputStream fos= new FileOutputStream("osw.txt");
        OutputStreamWriter osw= new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        String line="i love dog;";
        osw.write(line);
        osw.write("i also like cat.");
        System.out.println("over");
        osw.close();



    }
}
