package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**自动调用person中所有的公开无参方法
 * 通过类对象扫描person中所有的方法，并自动调用他们，需要添加分支，
 * 判断是无参方法时候才调用
 * */
public class Test {
    public static void main(String[] args) throws Exception {

        //1加载类对象
        Class cls=Class.forName("reflect.Person");
         Object obj=cls.newInstance();

        //2跟据类对象定义所有类方法
        Method[] methods =cls.getDeclaredMethods();

        //3遍历每个方法是调用getparametercount看看是否无参，无参pass有参过
        for(Method method:methods){
            if(
                    method.getParameterCount()==0//判断是否无参
                    &&
                            method.getModifiers()== Modifier.PUBLIC//常量值一样
            ){
                System.out.println("自动调用： "+method.getName()+"()");
//                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }
}
