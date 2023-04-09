package file;

import java.io.File;

// make directory 创建目录/文件夹
public class MkDirDemo {
    public static void main(String[] args) {
        File dir = new File("./a/b/c/d/e/f");
        if(dir.exists()){
            System.out.println("该目录已经存在");

        }else{
            dir.mkdirs();
            System.out.println("该目录已创建");
        }

       /* File dir = new File("./demo");
        if(dir.exists()){
            System.out.println("该目录已经存在");

        }else{
            dir.mkdir();
            System.out.println("该目录已创建");
        }

        */

    }
}
