package file;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        for(int i=1;i<=100;i++){
            File file =new File("./test"+i+".txt");
            file.delete();
        }
        System.out.println("删除完毕");



    }
}
