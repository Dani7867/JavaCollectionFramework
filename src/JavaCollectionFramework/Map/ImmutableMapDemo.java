package JavaCollectionFramework.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        // Create a mutable HashMap
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Make an unmodifiable view of map1
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println("Unmodifiable Map (map2): " + map2);

        // Attempting to modify map2 will throw UnsupportedOperationException
        // map2.put("C", 3);

        // Create an immutable map using Map.of (Java 9+)
        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89);
        System.out.println("Immutable Map (map3): " + map3);

        // Attempting to modify map3 will throw UnsupportedOperationException
        // map3.put("Akshit", 88);

        // Create an immutable map using Map.ofEntries (Java 9+)
        Map<String, Integer> map4 = Map.ofEntries(
                Map.entry("Akshit", 99),
                Map.entry("Vivek", 99)
        );
        System.out.println("Immutable Map using ofEntries (map4): " + map4);

        // Explanation:
        // Collections.unmodifiableMap(map1) - Creates a read-only view of an existing map.
        // Map.of(...) and Map.ofEntries(...) - Create immutable maps directly.
    }
}
