//Write a program in Java that converts a string vector (containing
//        strings) into an array of
//        strings and display them [use command-line argument].
//        CODE:
public class Main {
    public static void main(String[] args) {
        // Check if command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a string vector as a command-line argument.");
            return;
        }

        // Convert string vector to array
        String[] stringArray = args;

        // Display the elements of the array
        System.out.println("Elements of the array:");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element " + i + ": " + stringArray[i]);
        }
    }
}
//    java StringVectorToArray element1 element2 element3
