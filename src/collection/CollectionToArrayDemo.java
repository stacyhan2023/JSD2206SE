package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**集合转换为数组*/
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c= new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

        //Object[] array=c.toArray();

        //String [] array=c.toArray(new String[10]);  [one, two, three, four, five,null,null,null,null,null,null]
       // String [] array=c.toArray(new String[1]);  ...[one, two, three, four, five]
        String [] array=c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(array));

    }
}
