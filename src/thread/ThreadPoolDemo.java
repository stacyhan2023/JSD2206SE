package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 1控制线程数量
 * 2重复使用线程*/
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //1
        ExecutorService threadPool= Executors.newFixedThreadPool(2);
        //2指派任务
        for(int i=0;i<5;i++){
            Runnable r=new Runnable() {
                @Override
                public void run() {
                    Thread t=Thread.currentThread();
                    System.out.println(t.getName()+":正在执行任务...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println(t.getName()+"：任务执行完毕!!!");
                }
            };
            threadPool.execute(r);
            System.out.println("指派了一个任务给线程池");
        }
//        threadPool.shutdown();
        threadPool.shutdownNow();
        System.out.println("线程池关闭了");

    }
}
