package lambda;

import java.io.File;
import java.io.FileFilter;

/**JDK8之后推出的lambda表达式
 * 面向函数式编程
 * 可以用更简洁的语法去创建匿名内部类
 * 当要实现的接口中只有一个抽象方法时候，才可以使用这个去替换原始内部类匿名表达式*/
public class LambdaDemo {
    public static void main(String[] args) {
//        FileFilter filter = new FileFilter() {
//
//            public boolean accept(File file) {
//                return file.getName().contains("t");
//            }
//        };
        //参数类型可以忽略不写
        FileFilter filter=(File file)->{
            return file.getName().contains("t");
        };

        //如果方法体中只有一句代码，方法体可以忽略不屑，如果有return，return也删掉
        FileFilter filter3=(File file) ->file.getName().contains("t");

        //如果参数列表中只有一个参数时候，原括号可以不写
        FileFilter filter4 =file ->file.getName().contains("t");

        File dir= new File("./scr/file");
        File[] sub=dir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.getName().contains("t");
            }
        });
        File[]subs =dir.listFiles((f->f.getName().contains("t")));
    }
}
