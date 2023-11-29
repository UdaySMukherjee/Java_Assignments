// Define an Animal interface
interface Animal {
    void makeSound();
    void eat();
}

// Implement the Animal interface with a specific animal class (e.g., Dog)
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

// Implement the Animal interface with another animal class (e.g., Cat)
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}

// Main class to test the Animal interface and its implementations
public class InterfaceExample {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Call methods defined in the Animal interface
        System.out.println("Dog:");
        myDog.makeSound();
        myDog.eat();

        System.out.println("\nCat:");
        myCat.makeSound();
        myCat.eat();
    }
}
