package screening;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10);  // Queue: [10]
        queue.add(20);  // Queue: [10, 20]
        queue.add(30);  // Queue: [10, 20, 30]

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());  // Output: 10

        // Dequeue elements
        System.out.println("Removed: " + queue.remove());      // Output: 10
        System.out.println("Removed: " + queue.remove());      // Output: 20

        // Check if queue is empty
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue still has elements");
        }
    }
}

