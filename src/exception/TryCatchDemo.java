package exception;
/**java异常处理机制*/
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");

        try {

        //    String str = null;
         //   System.out.println(str.length());
             String str="";
            System.out.println(str.charAt(0));
            System.out.println("！！！！！！");/**try语句块中，如果某一句代码出现错误，后面的语句都不走了*/

//        }catch(NullPointerException e){
//            System.out.println("出现了空指针，并解决了");
//        }catch(StringIndexOutOfBoundsException e){
//            System.out.println("出现了字符串下标越界并解决了");
        }catch(NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现了空指针异常或字符串下标越界并解决了");
        }catch(Exception e) {
            //当一类异常都适用相同解决方式时候，我们可以采取捕获这一类异常的超类
            //当异常有继承关系的时候，子类在上面，超类在下

            System.out.println("通用解决办法");
        }

        System.out.println("程序结束了");

    }
}
