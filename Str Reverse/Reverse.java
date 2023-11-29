import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        scanner.close();


        String reversedString = reverseString(userInput);


        System.out.println("Reversed string: " + reversedString);
    }

    private static String reverseString(String input) {

        char[] charArray = input.toCharArray();

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {

            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return new String(charArray);
    }
}
