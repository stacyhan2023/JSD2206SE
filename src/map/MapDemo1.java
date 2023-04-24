package map;

import java.util.HashMap;
import java.util.Map;

/** java.util.map查找表 */

public class MapDemo1 {
    public static void main(String[] args) {

    Map<String,Integer> map= new HashMap<>();
    Integer value= map.put("语文",99);
     System.out.println(value);
     map.put("数学",98);
     map.put("英语",97);
     map.put("物理",96);
     map.put("化学",99);
     System.out.println(map);

     value=map.put("语文",80);
        System.out.println(map);
        System.out.println(value);

        /**获取值*/
        value=map.get("数学");
        System.out.println("数学： "+value);
        value=map.get("体育");
        System.out.println("体育： "+value);

        value=map.remove("英语");//获得返回值
        System.out.println(map);
        System.out.println(value);//获得返回值

        int size= map.size();//一组键值对算一个
        System.out.println(size);

        boolean ck=map.containsKey("数学");
        System.out.println("包含key： "+ck);
        boolean cv=map.containsValue("95");
        System.out.println("包含value： "+cv);

        map.clear();
        System.out.println(map);



    }
}

