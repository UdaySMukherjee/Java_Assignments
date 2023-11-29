// Filename: examplepackage/ClassB.java
package examplepackage;

public class ClassB {
    protected void protectedMethod() {
        System.out.println("This is a protected method in ClassB.");
    }

    public void accessDefaultMethod() {
        ClassA a = new ClassA();
        a.defaultMethod(); // Accessing default method from ClassA
    }
}