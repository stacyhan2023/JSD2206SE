package reflect;

import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
//        Person p=new Person();
//        p.heihei();

        Class cls=Class.forName("reflect.Person");
        Object obj= cls.newInstance();

       Method method = cls.getDeclaredMethod("heihei");
       method.setAccessible(true);
       method.invoke(obj);

    }
}
