package reflect;

import java.io.File;

/**自动实例化与当前类test3在同一个包中被@autorunclass标注的类，并将该对象输出*/
public class Test3 {
    public static void main(String[] args) throws Exception {
        File dir = new File(
                Test2.class.getResource(".").toURI()//定位test2所在的目录（包）固定模式
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

            if(cls.isAnnotationPresent(AutoRunClass.class)){
                System.out.println("正在实例化"+ cls.getName());
                Object obj=cls.newInstance();
                System.out.println(obj);

            }

        }
    }
}
