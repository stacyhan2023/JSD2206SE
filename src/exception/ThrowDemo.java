package exception;
/**异常的抛出  活到1000岁满足于发不满足业务*/
public class ThrowDemo {
    public static void main(String[] args) {
        Person p=new Person();

        try {
            p.setAge(1000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

        System.out.println("此人的年龄"+p.getAge()+"岁。");
    }
}
