package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**java反射机制*/
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
       /**使用反射机制的第一步：获取要操作的类的类对象，即：class的实例*/
       //获取string的类对象
//        Class cls=String.class;
//        Class cls=ArrayList.class;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个类名");
        String className=scanner.nextLine();
        Class cls=Class.forName(className);

        //通过类对象获取string的一切信息。etc：查看类名
        String name=cls.getName();
        System.out.println(name);
        name=cls.getSimpleName();
        System.out.println(name);

        Package p=cls.getPackage();
        System.out.println("包名： "+  p.getName());


        /**method成为方法对象，其每个实例用于表示一个方法的信息*/
        Method[] methods= cls.getMethods();//获取string的所有方法
        for(Method method:methods){
            System.out.println(method.getName());
        }




    }
}
