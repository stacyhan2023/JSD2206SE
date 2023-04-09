package io;

import java.io.Serializable;
import java.util.Arrays;

/**使用当前类测试对象流的序列化和反序列化*/
/*java bean定义规范
 * 1属性私有化
 * 为属性提供公开的get set方法
 * 定义无参构造
 * 实现序列化接口*/

public class Person implements Serializable {
    public static final long serialVersionUID = 1L;//序列化版本号
    private String name;
    private int age;
    private String gender;
    private transient String[] otherInfo;

    public Person(){
    }


    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }

}
