package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**list接口，继承自collection，可以存放重复元素且有序的集合*/
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // List<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list: " + list);

        /*list 接口中提供了一套可以通过下标操作元素的方法*/
        String e = list.get(2);
        System.out.println(e);

        for (int i = 0; i < list.size(); i++) {
            e = list.get(i);
            System.out.println(e);
        }

        String old = list.set(2, "six");
        System.out.println(list);
        System.out.println(old);

        //将集合反转
        for (int i = 0; i < list.size() / 2; i++) {
//           String str=list.get(i);
//           str=list.set(list.size()-1-i, str);//正数换到倒数
//            list.set(i,str);
            //    or  list.set(i,list.set(list.size() -1-i,list.get(i)));
//        }
            Collections.reverse(list);


            System.out.println(list);


        }
    }
}
