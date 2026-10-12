package Day_7;

// IS-A = Inheritance = extends
// Meaning: One class is a type of another class.
// We use the extends keyword to achieve an IS-A relationship.
// Real-life example:
// - A Dog IS-A Animal.
// - A Car IS-A Vehicle.
// - A Student IS-A Person.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();  // Inherited from Animal
        d.bark(); // Dog's own method
    }
}