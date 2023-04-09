package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**对象流 对象序列化和反序列化*/
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        //讲一个person对象写入文件person.obj中
        String name="stacy";
        int age=27;
        String gender ="female";
        String[] otherInfo={"live in japan","like dog"};
        Person p= new Person(name,age,gender,otherInfo);

        //文件流，对象流。写对象，关闭
        FileOutputStream fos=new FileOutputStream("person.obj");
        ObjectOutputStream oos =new ObjectOutputStream(fos);

        oos.writeObject(p);
        System.out.println("over");
        oos.close();




    }
}
