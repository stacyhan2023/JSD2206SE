package file;

import java.io.File;
import java.io.IOException;

/**创建一个新文件*/
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./test.txt");
        if(file.exists()){
            System.out.println("该文件已经存在");

        }else{
            file.createNewFile();
        }
        System.out.println("文件已创建");


    }
}
