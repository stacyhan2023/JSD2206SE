package thread;
/**第二种创建县城的方式
 * 实现runnable接口单独定义线程任务*/
public class ThreadDemo2 {
    public static void main(String[] args) {
        //1实例化任务
        Runnable r1 =new MyRunnable1();
        Runnable r2 =new MyRunnable2();
        //2创建线程
        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);

        t1.start();
        t2.start();

    }

    //创建类实现runnable任务接口输出你是谁
    static class MyRunnable1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("who are you");

            }
        }
    }


    //创建类实现runnable任务接口输出stacy
    static class MyRunnable2 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("stacy");

            }
        }
    }
}

