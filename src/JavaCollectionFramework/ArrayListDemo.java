package JavaCollectionFramework;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Create and Initialize an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Initial List: " + list);

        // 3. Get an element at a specific index
        int elementAtIndex1 = list.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);

        // 4. Remove an element by index
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        // 5. Remove an element by value
        list.remove(Integer.valueOf(10));
        System.out.println("After removing element with value 10: " + list);

        // 6. Add elements again
        list.add(40);
        list.add(50);
        list.add(20);
       
        System.out.println("After adding more elements: " + list);

        // 7. Sort the ArrayList (Natural Order)
        Collections.sort(list);
        System.out.println("Sorted List (Natural Order): " + list);

        // 8. Sort using Comparator (Descending Order)
        list.sort((a, b) -> b - a);
        System.out.println("Sorted List (Descending Order using Lambda): " + list);

        // 9. Sort using Comparator with Method Reference (Ascending Order)
        list.sort(Integer::compareTo);
        System.out.println("Sorted List (Ascending Order using Method Reference): " + list);

        // 10. Create a List using List.of()
        List<Integer> immutableList = List.of(7, 1, 2);
        System.out.println("Immutable List using List.of(): " + immutableList);

        // 11. Create a List using Arrays.asList()
        List<Integer> asListDemo = Arrays.asList(5, 15, 25);
        System.out.println("List created using Arrays.asList(): " + asListDemo);

        // Note: Modifying asListDemo will throw an exception if the underlying array does not support resizing.

        // 12. Use Streams and Collectors to filter and collect elements
        List<Integer> filteredList = list.stream()
                .filter(x -> x > 20)
                .collect(Collectors.toList());
        System.out.println("Filtered List (elements > 20): " + filteredList);

        // 13. Use forEach with Lambda Expression
        System.out.print("Using forEach to print elements: ");
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 14. Use forEach with Method Reference
        System.out.print("Using forEach with Method Reference: ");
        list.forEach(System.out::print);
        System.out.println();
        
        ArrayList<Student> li = new ArrayList<>();
		li.add(new Student("Dani" , 4));
		li.add(new Student("Aani" , 3));
		li.add(new Student("Bani" , 2));
		li.add(new Student("Cani" , 5));
		
		System.out.println(li.toString());
		
		Comparator<Student> comparator = Comparator.comparing(Student::getGpa).thenComparing(Student::getName);
		li.sort(comparator);
		System.out.println(li.toString());
		
    }

}

class  Student{
	 
	 private String name;
	 private int Gpa;
	 
	 public Student(String name,int Gpa){
		 this.name = name;
		 this.Gpa = Gpa;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public int getGpa() {
		 return Gpa;
	 }
	 
	 

	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student{name='" + name + "', gpa=" + Gpa + "}";
	}
	 
	
}
