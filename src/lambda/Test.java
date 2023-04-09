package lambda;

import java.io.File;
import java.io.FileFilter;

/**用lambda表达式创建文件过滤器
 *
 * 获取当前目项目录下名字中含有字母o的所有子项*/
public class Test {
    public static void main(String[] args) {
        //先new个对象
        File dir = new File(".");
        //把文件名全部存入数组里，存的时候加个过滤器
        File[] subs=dir.listFiles(file-> file.getName().contains("o"));
        //循环输出数组里的文件名字
        for(int i=0;i< subs.length;i++){
            System.out.println(subs[i].getName());
        }

//        FileFilter filter=new FileFilter() {
//            @Override
//            public boolean accept(File file) {
//                return file.getName().contains("o");
//            }
//        };
//        File dir = new File("./src/lambda");
//        File[] subs=dir.listFiles(filter);
//        for(int i=0;i< subs.length;i++){
//            System.out.println(subs[i].getName());
//        }
    }
}
