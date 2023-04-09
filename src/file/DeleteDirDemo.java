package file;

import java.io.File;

/**删除一个目录*/
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir= new File("./demo");
        if(dir.exists()){
            dir.delete();
            System.out.println("该目录已经删除");

        }else{
            System.out.println("该目录不存在");
        }
    }
}
