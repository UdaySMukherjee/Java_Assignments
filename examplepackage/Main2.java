
import examplepackage.ClassA;
import examplepackage.ClassB;
// Filename: Main.java

public class Main2 {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.publicMethod();    // Accessing public method
        // objA.privateVariable; // Error: private variable is not accessible
        objA.defaultMethod();   // Accessing default method

        ClassB objB = new ClassB();
        // objB.protectedMethod(); // Error: protected method is not accessible directly
        objB.accessDefaultMethod(); // Accessing default method from ClassA using ClassB
    }
}