package JavaCollectionFramework.Map;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> lMap = new LinkedHashMap<>(10,0.3f); // double linked list
	lMap.put("A", 1);
	lMap.put("B", 2);
	lMap.put("C", 3);
	lMap.get("B");
	for( Entry<String, Integer> m :lMap.entrySet()) {
		System.out.println(m.getKey() + ":" + m.getValue());
	}
	
	HashMap<String, Integer> hashMap = new HashMap<>();
   // LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

    hashMap.put("S", 91);
    hashMap.put("B", 80);
    hashMap.put("A", 78);

    Integer res = hashMap.getOrDefault("Vipul", 0);
    hashMap.put("S", 92);
    System.out.println(hashMap + " "+res);
}
}
