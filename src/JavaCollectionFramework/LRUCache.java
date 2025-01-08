package JavaCollectionFramework;



import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings("serial")
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;   // removes least recently used 
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("B", 99);
        studentMap.put("A", 89);
        studentMap.put("R", 91);
        studentMap.put("B", 100);
        studentMap.put("V", 89);


        System.out.println(studentMap);
    }
}