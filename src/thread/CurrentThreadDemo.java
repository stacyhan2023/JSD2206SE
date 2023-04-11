package thread;
/**java中所有的代码都是考线程执行的，main方法也不例外，运行main方法的线程是jvm创建的，
 * 并且取名叫main
 * 我们称它为主线程
 *
 * 线程提供了一个静态方法
 * static thread currentthread()
 * 该方法可以获取运行这个方法的线程*/
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main= Thread.currentThread();
        System.out.println("主线程"+main);//Thread-7
        dosome();


    }

    public static void dosome(){
        Thread t=Thread.currentThread();
        System.out.println("运行dosome方法的线程是："+t);
    }
}
