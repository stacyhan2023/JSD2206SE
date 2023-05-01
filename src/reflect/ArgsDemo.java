package reflect;
/**JDK5之后退出了一个新特性： 可变长参数*/
public class ArgsDemo {
    public static void main(String[] args) {
//        test();
//        test("a");
//        test("a","b");
//        test("a","b","c","d");
        test(new String[]{});
        test(new String[]{"a"});
        test(new String[]{"a","b","c","d"});
/**变长参数要求必须是一个方法的最后一个参数，所以一个方法里只能有一个变长参*/
    }
//    public  static  void test(String... arg){
public  static  void test(String[] arg){
        System.out.println(arg.length);
    }

}
