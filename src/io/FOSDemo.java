package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**java IO input and output*/
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向当前项目目录中的文件fos.dat中写入字节数据
        FileOutputStream fos =new FileOutputStream("./fos.dat");
        fos.write(1);
        fos.write(3);
        System.out.println("写出完毕");
        fos.close();
    }
}
