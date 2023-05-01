package reflect;

import java.lang.reflect.Method;

/**获取一个注解上的参数*/
public class ReflectDemo8 {
    public static void main(String[] args) throws Exception {
        Class cls=Class.forName("reflect.Person");
        Object obj=cls.newInstance();

        Method method =cls.getMethod("sayHello");
        if(method.isAnnotationPresent(AutoRunMethod.class)){

            /*获取注解上的参数分2不
            1获取该方法上的注解autorunmethod
            2再通过注解对象获取参数信息
             */
            AutoRunMethod arm=method.getAnnotation(AutoRunMethod.class);

            int d=arm.value();
            System.out.println("参数值:"+d);

        }

    }
}
