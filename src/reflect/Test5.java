package reflect;

import java.io.File;
import java.lang.reflect.Method;

/**自动调用与test5在同一个包中被@autorunclass标注的类中被@automethod
 * 标注的方法指定次数，
 * 次数由参数决定*/
public class Test5 {
    public static void main(String[] args) throws Exception {
        File dir = new File(
                Test5.class.getResource(".").toURI()//定位test5所在的目录（包）固定模式
        );
        System.out.println(dir);
        //获取该目录中所有。class文件
        File[] subs = dir.listFiles(f -> f.getName().endsWith(".class"));
        for (File sub : subs) {
            String fileName = sub.getName();
//            System.out.println(fileName);
            //2根据.class文件获取类名，Person.class
            String className = fileName.substring(0, fileName.indexOf("."));
            //substring截取字符串从指定位置到制定位置
            //加载类对象
            Class cls = Class.forName(
                    Test2.class.getPackage().getName() + "." + className
            );

            if( cls.isAnnotationPresent(AutoRunClass.class)){
                System.out.println("正在实例化"+ cls.getName());
                Object obj=cls.newInstance();
                System.out.println(obj);
                // //2跟据类对象定义所有类方法
                Method[] methods=cls.getDeclaredMethods();
                for(Method method:methods){
                    if(method.isAnnotationPresent(AutoRunMethod.class)){
                      AutoRunMethod arm=method.getAnnotation(AutoRunMethod.class);
                      int num=arm.value();
                        System.out.println("自动调用"+method.getName()+"()"+num+"次");
                       for(int i=0;i<num;i++){
                           method.invoke(obj);

                       }
                    }
                }

            }
        }
    }

}
