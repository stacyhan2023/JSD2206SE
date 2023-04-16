package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**集合之间的操作*/
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1= new ArrayList();
        //Collection c1=new HashSet();
        c1.add("java");
        c1.add("c++");
        c1.add("net");
        System.out.println("c1: "+c1);

        Collection c2= new ArrayList();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2: "+c2);

        c1.addAll(c2);
        System.out.println("c1: "+c1);
        System.out.println("c2: "+c2);

        Collection c3=new ArrayList();
        c3.add("c++");
        c3.add("android");
       // c3.add("php");
        System.out.println("c3: "+c3);

        boolean contains=c1.containsAll(c3);//判断是否包含参数集合中的所有元素
        System.out.println("包含所有？"+contains);

        System.out.println("c1: "+c1);
        System.out.println("c3: "+c3);
        /**取交集，仅保留成c1中与c3的共有元素*/
       // c1.retainAll(c3);
       /**删交集，将c1中与c3的共有元素删除*/
        c1.removeAll(c3);
        System.out.println("c1: "+c1);
        System.out.println("c3: "+c3);



    }
}
