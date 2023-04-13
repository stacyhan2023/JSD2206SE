package thread;
/**互斥性
 * 做你不能做我，做我不能做你*/
public class SyncDemo4 {
    public static void main(String[] args) {
        Boo boo= new Boo();
        Thread t1= new Thread(){
            public void run(){
                boo.methodA();
            }
        };
        Thread t2= new Thread(){
            public void run(){
                boo.methodB();
            }
        };
        t1.start();
        t2.start();

    }
}


class Boo{
    public synchronized void methodA(){//this
        Thread t=Thread.currentThread();
        System.out.println(t.getName()+":正在执行a方法。。。");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println(t.getName()+":a方法执行完毕！");
    }

    public void methodB(){
        synchronized (this) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行b方法。。。");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
            System.out.println(t.getName() + ":b方法执行完毕！");
        }
    }

}