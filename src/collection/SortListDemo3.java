package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**排序字符串
 * 当元素的比较规则不符合自己想要的比较规则时*/
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("jack");
//        list.add("rose");
//        list.add("jerry");
//        list.add("tom");
//        list.add("black");
//        list.add("ada");
//        list.add("kobe");
//        list.add("bill");
//        list.add("Jackson");
//        list.add("Hanmeimei");
//        list.add("Lilei");

        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");
        System.out.println(list);
//        Collections.sort(list);
        //实现字少的在前，字多的在后

//        Comparator<String > c=new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String olen1=o1.lengh
//                return 0;
//            }
//        };

       // Collections.sort(list, Comparator.comparingInt(String::length));
        //Collections.sort(list,(o1,o2)->o1.length()-o2.length());
       //JDK8之后，list集合自身提供了sort方法进行排序
        list.sort((o1,o2)->o1.length()-o2.length());

        System.out.println(list);



    }
}
