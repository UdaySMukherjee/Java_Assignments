public class MyClass {

    private static int objectCount = 0;

    public MyClass() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }
    public static void main(String[] args) {

        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        System.out.println("Number of objects created: " + MyClass.getObjectCount());
    }
}
