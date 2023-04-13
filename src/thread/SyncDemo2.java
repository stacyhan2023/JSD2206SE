package thread;

/**Sync同步块*/
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop=new Shop();


        Thread t1= new Thread("帆传奇"){
            public void run(){
                shop.buy();
            }
        };

        Thread t2= new Thread("王克晶"){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();

    }
}


class Shop{
    public  void buy(){

        try {
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+"：正在挑选衣服。。。");
            Thread.sleep(5000);

            synchronized (this) {//new Object, t都不行，要指代同一个对象；""空字符串也可以，因为空字符串里存的事常量池
                //但是不推荐，因为空字符串就算在两家店也要排队。
                System.out.println(t.getName() + "：正在试穿衣服。。。");
                Thread.sleep(5000);
            }

            System.out.println(t.getName()+"结账离开");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
