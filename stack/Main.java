import java.util.Scanner;

class Stack {
    private static final int MAX_SIZE = 10;
    private int[] array;
    private int top;

    public Stack() {
        array = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            array[++top] = value;
            System.out.println(value + " pushed to the stack.");
        } else {
            System.out.println("Stack overflow! Cannot push " + value + ".");
        }
    }

    public void pop() {
        if (top >= 0) {
            int poppedValue = array[top--];
            System.out.println("Popped element: " + poppedValue);
        } else {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.println("Elements in the stack:");
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int valueToPush = scanner.nextInt();
                    stack.push(valueToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
