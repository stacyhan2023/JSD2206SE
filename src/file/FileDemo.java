package file;

import java.io.File;

/**
 * java.io.File
 * File可以表示硬盘上的一个文件或目录（本质保存的是一个抽象路径）
 * file可以：
 * 1 访问其表示的文件或目录的属性
 * 2 创建删除问津或空目录
 * 3 访问一个目录中的子项
 * file不可以：
 * 访问文件数据
 */
public class FileDemo {
    public static void main(String[] args) {
        // ./当前目录 当前项目的目录,不建议绝对路径
        File file = new File("./demo.txt");
        //file.getAbsoluteFile()

        String name =file.getName();
        System.out.println(name);

        //获取档案file表示的文件的大小，单位是字节
        long len = file.length();
        System.out.println(len+"字节");

        //判断文件是否可读可写
        boolean cr = file.canRead();
        boolean cw = file.canWrite();
        System.out.println("是否可读:"+cr);
        System.out.println("是否可写:"+cw);

    }
}
