package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**新循环，用相同的语法遍历集合或者数组*/
public class NewForDemo {
    public static void main(String[] args) {
        String[] array ={"one","two","three","four","five"};
        for(int i=0;i<array.length;i++){
            String str=array[i];
            System.out.println(str);
        }

        for(String str:array){
            System.out.println(str);
        }

        Collection<String> c= new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
      /**迭代器*/
        Iterator<String> it=c.iterator();
        while(it.hasNext()){
//            String str=(String) it.next();
            String str= it.next();
            System.out.println(str);
        }
        //for(Object obj:c){
          //  String str=(String) obj;
        for(String str:c){
            System.out.println(str);

        }

    }
}
