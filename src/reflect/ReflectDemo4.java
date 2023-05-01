package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**使用反射机制调用方法*/
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p =new Person();
        p.sayHello();

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入类名：");
        String className=scanner.nextLine();
        System.out.println();
        System.out.println("请输入方法名： ");
        String methodName =scanner.nextLine();

        //实例化一个类对象
        //class cls=Person.class
//        Class cls=Class.forName("reflect.Person");
        Class cls=Class.forName(className);
        Object obj=cls.newInstance();//new person();

        //调方法，先获取要调用的方法
//          Method method=cls.getMethod("sayHello");
        //Method method=cls.getMethod("sayHello");
        Method method=cls.getMethod(methodName);
        method.invoke(obj);//执行


    }
}
