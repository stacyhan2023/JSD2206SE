package thread;
/**获取线程相关信息的一组方法*/
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread t= Thread.currentThread();//获取主线程
        String name=t.getName();
        System.out.println("name"+name);

        long id=t.getId();//获取唯一标识
        System.out.println("id:"+id);

        int priority=t.getPriority();//获取优先级
        System.out.println("优先级为："+priority);

        boolean isAlive =t.isAlive();
        boolean isDaemon=t.isDaemon();//是否为守护线程
        boolean isInterrupted =t.isInterrupted();//是否被中断
        System.out.println("isAlive："+isAlive);
        System.out.println("isDaemon："+isDaemon);
        System.out.println("isInterrupted："+isInterrupted);

    }
}
