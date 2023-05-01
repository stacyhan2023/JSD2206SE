package reflect;

import java.lang.reflect.Method;

/**调用有参方法*/
public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Class cls=Class.forName("reflect.Person");
        Object obj=cls.newInstance();
        //say(String info)
        Method m1 =cls.getMethod("say", String.class);
        m1.invoke(obj,"你好");

        //say
        Method m2=cls.getMethod("say",String.class,int.class);
        m2.invoke(obj,"你好",18);
    }
}
