package Java8;



class Outer {
    // Static variable in the Outer class
	static int staticVariable;

    // Static method in the Outer class
    static void staticMethod() {
        System.out.println("Static method in Outer class.");
    }
    
    static {
    	 staticVariable = 10;
    	 System.out.println("In Static");
    }

    // Static nested class
    static class Inner {
        // Method in the static nested class
        void display() {
            // Accessing static variable from Outer class
            System.out.println("Static variable from Outer class: " + staticVariable);
            
            // Calling static method from Outer class
            staticMethod();
        }
    }

    // Static variable for counting instances of the Outer class
    static int count = 0;

    // Constructor to increment count for every instance created
    Outer() {
        count++;
        System.out.println("In constr");
    }

    // Static method to display the count of created instances
    static void displayCount() {
        System.out.println("Number of Outer class instances: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Access static variable and method of Outer class directly
        System.out.println("Accessing static variable: " + Outer.staticVariable); // Output: 10
        Outer.staticMethod(); // Output: Static method in Outer class.

        // Creating instances of the static nested class
        Outer.Inner innerObject1 = new Outer.Inner();
        innerObject1.display(); // Output: Static variable from Outer class: 10, Static method in Outer class.

        Outer.Inner innerObject2 = new Outer.Inner();
        innerObject2.display(); // Output: Static variable from Outer class: 10, Static method in Outer class.

        // Creating instances of Outer class
        // Outer outerObject1 = new Outer();
        // Outer outerObject2 = new Outer();

        // Access static method to display instance count
        Outer.displayCount(); // Output: Number of Outer class instances: 2
    }
}
