package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**自动调用与当前类test2同一个包中那些类的所有的无参方法*/
public class Test2 {
    public static void main(String[] args) throws Exception {
        //1确定与test2在同一个包中有多少类
        //定位test2所在的目录（包）
        File dir=new File(
        Test2.class.getResource(".").toURI()//定位test2所在的目录（包）固定模式
        );
        System.out.println(dir);
        //获取该目录中所有。class文件
        File[] subs=dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub: subs){
            String fileName=sub.getName();
            System.out.println(fileName);
         //2根据.class文件获取类名，Person.class
            String className=fileName.substring(0,fileName.indexOf("."));
            //substring截取字符串从指定位置到制定位置
            //加载类对象
            Class cls=Class.forName(
                    Test2.class.getPackage().getName()+"."+className
            );

        //3跟据类对象定义所有类方法
            System.out.println("实例化对象"+cls.getSimpleName());
            Object obj=cls.newInstance();

        //2跟据类对象定义所有类方法
        Method[] methods =cls.getDeclaredMethods();

            //4遍历每个方法是调用getparametercount看看是否无参，无参,公开，里面含有s的方法
        for(Method method:methods){
            if(
                    method.getParameterCount()==0//判断是否无参
                            &&
                            method.getModifiers()== Modifier.PUBLIC//常量值一样
                            &&
                            method.getName().contains("s")

            ){
                System.out.println("自动调用： "+method.getName()+"()");
//                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }


    }
}
