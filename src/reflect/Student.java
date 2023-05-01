package reflect;

@AutoRunClass
public class Student {

   @AutoRunMethod
    public void study(){
        System.out.println("学生:good good study,day day up!");
    }

    @AutoRunMethod
    public void playGame(){
        System.out.println("学生:打游戏!");
    }
    public void sleepOnClass(){
        System.out.println("学生:上课睡觉!");
    }
}
