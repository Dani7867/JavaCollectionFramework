package JavaCollectionFramework;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> vector = new Vector<>();

        // 1. Adding elements
        vector.add(10); // Add at the end
        vector.add(20);
        vector.add(30);
        System.out.println("Initial Vector: " + vector);

        vector.addElement(40); // Add using addElement (specific to Vector)
        System.out.println("After addElement(40): " + vector);

        vector.add(1, 15); // Add at a specific index
        System.out.println("After adding 15 at index 1: " + vector);

        // 2. Accessing elements
        System.out.println("Element at index 0: " + vector.get(0));
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        // 3. Removing elements
        vector.remove(2); // Remove element at index 2
        System.out.println("After removing element at index 2: " + vector);

        vector.remove(Integer.valueOf(20)); // Remove the element with value 20
        System.out.println("After removing element with value 20: " + vector);

        vector.removeElementAt(0); // Remove using removeElementAt (specific to Vector)
        System.out.println("After removeElementAt(0): " + vector);

        vector.removeElement(Integer.valueOf(40)); // Remove using removeElement
        System.out.println("After removeElement(40): " + vector);

        // 4. Iterating through the Vector
        System.out.print("Iterating using for-each loop: ");
        for (int element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Iterating using Iterator: ");
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 5. Vector-specific methods
        System.out.println("Capacity of the Vector: " + vector.capacity());
        System.out.println("Size of the Vector: " + vector.size());

        vector.ensureCapacity(50); // Ensures minimum capacity
        System.out.println("Capacity after ensureCapacity(50): " + vector.capacity());

        vector.setSize(10); // Sets the size of the vector
        System.out.println("Vector after setSize(10): " + vector);

        // 6. Sorting the Vector// Removing null elements before sorting
        vector.removeIf(Objects::isNull);
        vector.sort(Comparator.naturalOrder()); // Sort in ascending order
        System.out.println("After sorting in ascending order: " + vector);


        vector.sort(Comparator.reverseOrder()); // Sort in descending order
        System.out.println("After sorting in descending order: " + vector);

        // 7. Using Streams with Vector
        List<Integer> filteredList = vector.stream()
                .filter(x -> x > 20)
                .toList();
        System.out.println("Filtered List (elements > 20): " + filteredList);

        // 8. Demonstrating Vector constructors
        // Default constructor
        Vector<Integer> defaultVector = new Vector<>();
        System.out.println("Default constructor, capacity: " + defaultVector.capacity());

        // Constructor with initial capacity
        Vector<Integer> capacityVector = new Vector<>(20);
        System.out.println("Constructor with initial capacity (20), capacity: " + capacityVector.capacity());

        // Constructor with initial capacity and capacity increment
        Vector<Integer> incCapacityVector = new Vector<>(10, 5);
        System.out.println("Constructor with initial capacity (10) and increment (5), capacity: " + incCapacityVector.capacity());

        // Constructor with a collection
        Vector<Integer> collectionVector = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Constructor with collection, elements: " + collectionVector);

        // 9. Clearing the Vector
        vector.clear();
        System.out.println("After clearing the vector: " + vector);
    }
}

