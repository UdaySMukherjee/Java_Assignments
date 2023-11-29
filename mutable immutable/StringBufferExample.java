public class StringBufferExample {
    public static void main(String[] args) {
        // Using String (Immutable)
        String str1 = "Hello";
        String str2 = str1; // str2 references the same "Hello" string as str1
        str1 = str1 + " World"; // This creates a new string "Hello World" and makes str1 reference it
        System.out.println("Using String (Immutable):");
        System.out.println("str1: " + str1); // "Hello World"
        System.out.println("str2: " + str2); // "Hello" (str2 is still referencing the original "Hello" string)
        // Using StringBuffer (Mutable)
        StringBuffer buffer1 = new StringBuffer("Hello");
        //buffer1.append("Hello");
        StringBuffer buffer2 = buffer1; // buffer2 references the same StringBuffer as buffer1
        buffer1.append(" World"); // This modifies the content of buffer1
        System.out.println("\nUsing StringBuffer (Mutable):");
        System.out.println("buffer1: " + buffer1); // "Hello World"
        System.out.println("buffer2: " + buffer2); // "Hello World" (buffer2 is referencing the same modified StringBuffer)
    }
}