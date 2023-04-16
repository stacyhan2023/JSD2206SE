package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**数组转换为集合*/
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array={"one","two","three","four","five"};
        System.out.println("array: "+ Arrays.toString(array));

        List<String> list=Arrays.asList(array);
        System.out.println("list:"+list);

        list.set(1,"six");
        System.out.println("list:"+list);
        System.out.println("array:"+Arrays.toString(array));

        array[2]="seven";
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("list:"+list);

//        list.add("!!!!");
//        System.out.println("array:"+Arrays.toString(array));
//        System.out.println("list:"+list);

        /**如果我们需要增删元素，可以另外创建一个集合*/
//        List<String> list2 = new ArrayList<>();
//        list2.addAll(list);
        List<String> list2 = new ArrayList<>(list);

        System.out.println("list2: "+list2);
        list2.add("!!!");
        System.out.println("list2: "+list2);




    }
}
