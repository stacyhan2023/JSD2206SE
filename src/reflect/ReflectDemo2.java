package reflect;

import java.util.Scanner;

/**利用反射机制实例化一个对象*/

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person p=new Person();
        System.out.println(p);

        /**反射机制实例化对象
         * 1加载要实例化对象的类的类对象
         * 2利用类对象来实例化*/
        //1
//        Class cls=Class.forName("reflect.Person");

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个类名");
        String className= scanner.nextLine();
        Class cls= Class.forName(className);

        //2
        Object obj= cls.newInstance();//利用公开的无参构造器new对象，相当于new person
        System.out.println(obj);

    }
}
