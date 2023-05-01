package reflect;
/**反射机制使用注解*/
public class ReflectDemo7 {
    public static void main(String[] args) throws Exception {
//        Class cls= Class.forName("reflect.Person");
        Class cls= Class.forName("reflect.ReflectDemo7");
        boolean mark=cls.isAnnotationPresent(AutoRunClass.class);
        System.out.println("是否被标注了？："+mark);

    }
}
