package exception;
/**异常地抛出 throw关键字；2种情况：1不归我管；2满足语法不满足业务
 * 演示第二种*/
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0||age>100){
          //throw new RuntimeException("年龄不合法");
           //throw new Exception("年龄不合法");
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}
