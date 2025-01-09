package JavaCollectionFramework;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
    private String name;
    private double gpa;

    public Students(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Students other) {
        // First compare by GPA (descending order)
        int gpaComparison = Double.compare(other.gpa, this.gpa);
        if (gpaComparison != 0) {
            return gpaComparison;
        }
     //   return Double.compare(o.getGpa(), this.getGpa());
        // If GPA is the same, compare by name (ascending order)
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', gpa=%.2f}", name, gpa);
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("Charlie", 3.5));
        list.add(new Students("Bob", 3.7));
        list.add(new Students("Alice", 3.5));
        list.add(new Students("Akshit", 3.9));

        // Sorting the list using natural ordering defined in Comparable
        Collections.sort(list);

        // Print the sorted list
        System.out.println(list);
    }
}

