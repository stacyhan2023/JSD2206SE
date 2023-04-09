package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");

        try{
            String str="null";
            System.out.println(str.length());
            return;
        }catch(Exception e){
            System.out.println("error");
        }finally{
            System.out.println("finally中的代码执行了");
        }
        System.out.println("over");

    }
}
