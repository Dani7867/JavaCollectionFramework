package JavaCollectionFramework;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add initial elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Initial List: " + list);

        // Create threads that modify and read the list concurrently
        Thread writerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                list.add("Element-" + i);
                System.out.println("Writer added: Element-" + i);
                try {
                    Thread.sleep(100); // Simulate delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread readerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Reader sees: " + list);
                try {
                    Thread.sleep(150); // Simulate delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final List: " + list);
    }
}

