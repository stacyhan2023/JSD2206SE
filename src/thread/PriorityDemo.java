package thread;
/**线程的优先级，默认为5*/
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread() {

            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("min");
                }
            }
        };


        Thread norm = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("nor");
                }
            }
        };


        Thread max = new Thread() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("max");
                }
            }
        };

        min.setPriority(Thread.MIN_PRIORITY);
        // nor.setPriority(Thread.NORM_PRIORITY);默认
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        norm.start();
        max.start();


    }
}



