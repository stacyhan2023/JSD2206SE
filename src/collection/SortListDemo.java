package collection;

import java.util.*;

/**集合的排序
 * 静态方法sort*/
public class SortListDemo {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<10;i++){
            list.add(random.nextInt(100));

        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
