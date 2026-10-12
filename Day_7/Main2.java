package Day_7;

// HAS-A Relationship (Composition / Aggregation)
// HAS-A = Object reference / association between classes
// Meaning: One class has an object of another class.
// Real-life examples:
// - A Car HAS-A Engine.
// - A Student HAS-A Address.
// - A Mobile HAS-A Battery.

class Engine {
    void start() {
        System.out.println("Engine is starting");
    }
}

class Car {
    Engine e = new Engine();

    void drive() {
        e.start();
        System.out.println("Car is moving");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
