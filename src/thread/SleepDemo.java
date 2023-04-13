package thread;

import java.util.Scanner;

/**线程的静态方法
 * 该方法可以让运行这个方法的线程处于阻塞状态指定毫秒*/
public class SleepDemo {
    public static void main(String[] args) {

        /*建议倒计时程序，
        程序开始后输入一个数字，从该书记开始每秒递减，
        到0时候输出时间到
        * */

        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个数字：");

        for(int num=scanner.nextInt();num>0;num--) {
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("程序结束了");
    }

}
