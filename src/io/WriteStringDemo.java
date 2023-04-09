package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**向文件fos.txt中写入文本数据（字符串）*/
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //new 加boolean true就不是覆盖模式，成了追加模式
        FileOutputStream fos=new FileOutputStream("fos.txt",true);
        //赋值string
        String line ="小小小蓝帽";
       //字符串砖换为字符集
        byte[] data=line.getBytes(StandardCharsets.UTF_8);
       //写
        fos.write(data);
        line="桃子嘤嘤怪";
        data =line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        System.out.println("写出完毕");
        //关闭
        fos.close();



    }
}
