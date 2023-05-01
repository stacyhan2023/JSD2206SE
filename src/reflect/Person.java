package reflect;

public class Person {
    private String name="stacy";
    private int age=18;
    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void sayHello(){
        System.out.println(name+"说：hello！");
    }

    public void watchTV(){
        System.out.println(name+": 正在看电视");
    }
    public  void sing(){
        System.out.println(name+"正在唱歌");
    }
    public  void playGame(){
        System.out.println(name+"正在打游戏");
    }

}
