package thread;
/**守护线程
 * 守护线程是通过普通线程调用setDaemon（true）方法设置转变而来的*/
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose= new Thread("rose"){

            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println(getName()+" :let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("aaa");
                System.out.println("扑通");
            }
        };

        Thread jack=new Thread("jack"){
            public void run(){
               while(true){
                   System.out.println(getName()+" :you jump, i jump!");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }

        };

        rose.start();
        jack.setDaemon(true);
        jack.start();

        //while(true);

    }
}
