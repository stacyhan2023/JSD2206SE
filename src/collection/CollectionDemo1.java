package collection;

import java.util.ArrayList;
import java.util.Collection;

/**java集合框架
 * collection接口
 * 对于元素的操作全部封装成了方法*/
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c= new ArrayList();

        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

        int size=c.size();
        System.out.println("size:"+size);

        boolean isEmpty=c.isEmpty();//c==null
        //是否为空集（size=0，没有元素，但是集合本身存在）
        System.out.println("是否为空集?:"+isEmpty);

        System.out.println("=============");
        c.clear();
        System.out.println("集合已经清空");
        System.out.println(c);
        System.out.println("size: "+size);
        System.out.println("是否为空集?:"+isEmpty);






    }
}
