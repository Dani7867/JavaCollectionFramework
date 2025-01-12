package JavaCollectionFramework.List;


import java.util.List;
import java.util.Comparator;
import java.util.LinkedList;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // 1. Adding elements
        list.add(10); // Add at the end
        list.add(20);
        list.add(30);
        System.out.println("Initial List: " + list);

        list.addFirst(5); // Add at the beginning
        list.addLast(40); // Add at the end
        System.out.println("After addFirst and addLast: " + list);

        list.add(2, 15); // Add at a specific index
        System.out.println("After adding 15 at index 2: " + list);

        // 2. Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 3: " + list.get(3));

        // 3. Removing elements
        list.removeFirst(); // Remove the first element
        System.out.println("After removeFirst: " + list);

        list.removeLast(); // Remove the last element
        System.out.println("After removeLast: " + list);

        list.remove(2); // Remove element at index 2
        System.out.println("After removing element at index 2: " + list);

        list.remove(Integer.valueOf(20)); // Remove the element with value 20
        System.out.println("After removing element with value 20: " + list);

        // 4. Iterating through the list
        System.out.print("Iterating using for-each loop: ");
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Iterating using Iterator: ");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        System.out.println(list.reversed());

        // 5. Sorting the list
        list.add(25);
        list.add(35);
        System.out.println("Before sorting: " + list);
        list.sort(Comparator.naturalOrder()); // Sort in ascending order
        System.out.println("After sorting in ascending order: " + list);

        list.sort(Comparator.reverseOrder()); // Sort in descending order
        System.out.println("After sorting in descending order: " + list);

        // 6. Using Streams with LinkedList
        List<Integer> filteredList = list.stream()
                .filter(x -> x > 20)
                .toList();
        System.out.println("Filtered List (elements > 20): " + filteredList);

        // 7. Clearing the list
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}


	 
	 

	
	 
	




