package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**元素的equals方法影响的集合操作*/
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c= new ArrayList();
        //Collection c= new HashSet();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,4));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        c.add(new Point(1,2));
        System.out.println(c);

        Point p=new Point(1,2);
        Boolean contains =c.contains(p);
        System.out.println("是否包含： "+contains);

        c.remove(p);
        System.out.println(c);





    }
}
