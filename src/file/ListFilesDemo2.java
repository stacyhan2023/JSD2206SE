package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 重载的listfiles
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        /**
         * 获取./src/file目录中所有名字中含有t的文件*/
        File dir = new File("./src/file");
        if(dir.isDirectory()){
            //使用匿名内部类创建一个文件过滤器
            FileFilter filter =new FileFilter() {

                public boolean accept(File file) {
                    String name = file.getName();
                    //return name.indexOf("t")!=-1;
                    return name.contains("t");
                }
            };


            File[] subs =dir.listFiles(filter);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }

    }
}
