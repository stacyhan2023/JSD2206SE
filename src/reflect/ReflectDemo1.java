package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**java反射机制*/
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
         /*
            使用反射机制的第一步:获取要操作的类的类对象,即:Class的实例
            JVM中被加载的类都有且只有一个Class的实例与之对应,该实例就称为
            被加载的这个类的类对象.
            类对象上会记录这其表示的类的一切信息(类名,方法信息,属性信息等)
            获取一个类的类对象方式:
            1:类名.class:
            Class cls = String.class;
            Class cls = int.class;
            2:Class.forName(String className)
            Class cls = Class.forName("java.lang.String")
            参数要求是要加载的类的完全限定名:包名+类名
            3:类加载器ClassLoader形式加载
        */
        //获取String的类对象
//        Class cls = String.class;
//        Class cls = ArrayList.class;

//        Class cls = Class.forName("java.lang.String");

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

        System.out.println("=======");
        Class cls1 = Class.forName("java.lang.String");
        System.out.println(cls1);




    }
}
