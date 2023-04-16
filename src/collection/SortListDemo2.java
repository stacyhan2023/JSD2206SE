package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**阿丕绪自定义型元素*/
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,6));
        list.add(new Point(13,87));
        list.add(new Point(55,35));
        list.add(new Point(9,4));
        list.add(new Point(2,1));
        list.add(new Point(99,88));
        System.out.println(list);
        //Collections.sort(list);

        //单独定义比较器（定义point元素的比较规则）
      //  Comparator<Point> c=;
//        Collections.sort(list,new Comparator<Point>() {
//            public int compare(Point o1, Point o2) {
//                int olen1= o1.getX()* o1.getX()+ o1.getY()* o1.getY();
//                int olen2= o2.getX()* o2.getX()+ o2.getY()* o2.getY();
//                return olen1-olen2;//升序
//            }
//        });
        Collections.sort(list,(o1, o2) ->
                o1.getX()* o1.getX()+ o1.getY()* o1.getY()-
                 o2.getX()* o2.getX()- o2.getY()* o2.getY()
        );
        System.out.println(list);

    }
}
