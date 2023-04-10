package thread;
<<<<<<< HEAD
/**多线程
 * 1继承thread
 * 2重写run方法*/
public class ThreadDemo1 {
    public static void main(String[] args) {

        Thread t1=new MyThread1();
        Thread t2=new MyThread2();
//线程的启动要调用start方法
        t1.start();
        t2.start();


    }

static class MyThread1 extends Thread {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("who are you?");
                }
            }

        }
    }

class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("stacy");
        }
    }

}


=======
/**多线程*/
public class ThreadDemo1 {
    public static void main(String[] args) {

    }
}
>>>>>>> origin/master
