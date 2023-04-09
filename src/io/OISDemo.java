package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**使用对象输入流完成对象的反序列化操作*/
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //将person.obj文件中的对象反序列化
        //new file，new对象  读出来，强转成person类型。输出person
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Object obj =ois.readObject();
        Person person=(Person)obj;
        System.out.println(person);
        ois.close();

    }
}
