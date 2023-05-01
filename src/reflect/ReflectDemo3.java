package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**使用指定构造器实例化对象*/
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person p=new Person("李四",22);
        System.out.println(p);

        Class cls=Class.forName("reflect.Person");
//        cls.getConstructor();//不传参时候获取无参构造器
         Constructor c =cls.getConstructor(String.class,int.class);//传类对象，表示参数的类型
        Object obj=c.newInstance("王武",33);//new person
        System.out.println(obj);

    }
}
