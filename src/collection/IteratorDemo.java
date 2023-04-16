package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**集合的遍历，获取遍历当前集合元素的迭代器（迭代器接口）
 * 问- 取- 删*/
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c= new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");

        System.out.println(c);

        Iterator it =c.iterator();

        while(it.hasNext()){
            String str=(String)it.next();
            if("#".equals(str)){
                //c.remove();
                it.remove();
            }
            System.out.println(str);

        }
        System.out.println(c);


    }
}
