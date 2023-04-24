package map;

import java.util.*;

/**map的遍历
 * 遍历所有key
 * 遍历所有键值对
 * 遍历所有value
 * */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",99);
        System.out.println(map);

        //遍历所有key
        Set<String> keySet=map.keySet();
        for(String key:keySet) {
            System.out.println("key: " + key);
        }

        //遍历所有键值对
            Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
            for(Map.Entry<String,Integer> e:entrySet){
                String key= e.getKey();
                Integer value=e.getValue();
                System.out.println(key+":"+value);

            }

        //遍历所有value以集合形式返回
        Collection<Integer> values=map.values();
            for(Integer value : values){
                System.out.println("value: "+value);

            }

            /**jdk8之后，集合和map都提供了foreach方法，基于lambda表达式遍历*/
            Collection<String> c=new ArrayList<>();
            c.add("one");
            c.add("two");
            c.add("three");
            c.add("four");

            //新循环遍历
        for(String s:c){
            System.out.println(s);
        }

        //forEach
        c.forEach(s-> System.out.println(s));

        //map也支持foreach
        map.forEach((k,v)-> System.out.println(k+":"+v));

        }

    }

