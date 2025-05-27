package screening;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements to the stack
        stack.push(10);  // Stack: [10]
        stack.push(20);  // Stack: [10, 20]
        stack.push(30);  // Stack: [10, 20, 30]

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());  // Output: 30

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());        // Output: 30
        System.out.println("Popped: " + stack.pop());        // Output: 20

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack still has elements");
        }
    }
}

