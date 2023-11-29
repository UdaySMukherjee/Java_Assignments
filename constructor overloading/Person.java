public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person("Jane", 25);

        System.out.println("Person 1: Name = " + person1.getName() + ", Age = " + person1.getAge());
        System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.getAge());
        System.out.println("Person 3: Name = " + person3.getName() + ", Age = " + person3.getAge());
    }
}
