package collection;

import java.util.ArrayList;
import java.util.List;

/**list提供了获取子集的操作 sublist（int start, int end）*/
public class ListDemo3 {
    public static void main(String[] args) {
        //泛型只能写引用类型
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10;i++){
            list.add(i);

        }
        System.out.println(list);
        //获取3-7
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);

        //将子集每个元素扩大10倍
        for(int i=0;i<subList.size();i++){
            int num=subList.get(i);
            num = num*10;
            subList.set(i,num);
        }
        System.out.println(subList);
        System.out.println(list);

        //删除list集合中2-8
//        List<Integer> list1=list.subList(2,9);
//        list.removeAll(list1);
//        System.out.println(list);

        list.subList(2,9).clear();
        System.out.println(list);


    }
}
