package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**jdk7之后推出了一个新特性：自动关闭特性
 * 等价于finally demo2的东西*/
public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("fos.dat");
                ) {
            fos.write(1);
        }catch(IOException e){
            System.out.println("error");
        }

    }
}
