package JavaCollectionFramework.Map;



import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap =  new ConcurrentHashMap<>();
        // Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        // Only the segment being written to or read from is locked
        // read: do not require locking unless there is a write operation happening on the same segment
        // write: lock

        // java 8 --> no segmentation
        //        --> Compare-And-Swap approach --> no locking except resizing or collision
        // Thread A last saw --> x = 45
        // Thread A work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry
        // put --> index

        // MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap
        
        concurrentHashMap.put("Alice", 30);
        concurrentHashMap.put("Bob", 40);
        concurrentHashMap.put("Charlie", 50);

        // Fetching elements
        System.out.println("ConcurrentHashMap contents:");
        concurrentHashMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Updating a value
        concurrentHashMap.put("Alice", 35);
        System.out.println("\nUpdated ConcurrentHashMap:");
        concurrentHashMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Using computeIfAbsent to add a new key-value pair
        concurrentHashMap.computeIfAbsent("David", k -> 45);
        System.out.println("\nAfter computeIfAbsent:");
        concurrentHashMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Using computeIfPresent to modify an existing key-value pair
        concurrentHashMap.computeIfPresent("Bob", (k, v) -> v + 10);
        System.out.println("\nAfter computeIfPresent:");
        concurrentHashMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Creating and demonstrating a ConcurrentSkipListMap
        ConcurrentSkipListMap<String, Integer> concurrentSkipListMap = new ConcurrentSkipListMap<>();

        // Adding elements
        concurrentSkipListMap.put("Alice", 30);
        concurrentSkipListMap.put("Bob", 40);
        concurrentSkipListMap.put("Charlie", 50);

        System.out.println("\nConcurrentSkipListMap contents (sorted):");
        concurrentSkipListMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Demonstrating sorted nature
        System.out.println("\nFirst entry in ConcurrentSkipListMap: " + concurrentSkipListMap.firstEntry());
        System.out.println("Last entry in ConcurrentSkipListMap: " + concurrentSkipListMap.lastEntry());
    

    }
}