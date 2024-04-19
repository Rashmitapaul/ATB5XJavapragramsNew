package src.collectionframework_3_feb_2024;

import java.util.Map;
import java.util.WeakHashMap;

public class Lab197 {
    public static void main(String[] args) {
//MAP
        Map<String,Integer> map = new WeakHashMap<>();
//        Map<String,Integer> map = new TreeMap<>();
//        Map<String,Integer> map = new LinkedHashMap<>();
        //Map<String,Integer> map = new HashMap<>();
        map.put("id",1);
        //   map.put("id",2);//In this case here 1 elements is present
        map.put("id2",2);
        map.put("id3",34);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsKey("Id"));//o/p false
        System.out.println(map.containsValue(2));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));
        System.out.println(map.get("id3"));
        System.out.println(map.keySet());
        System.out.println(map.values());



        for(Map.Entry<String,Integer> item: map.entrySet()){//remember this syntax
            System.out.println(item.getKey() + " -> " + item
                    .getValue());
        }










    }
}
