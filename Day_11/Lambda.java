package Day_11;

@FunctionalInterface
interface Greeter {
    void greet(String name);
}

public class Lambda {
    public static void main(String[] args) {
        // Lambda expression syntax
        Greeter g = name -> System.out.println("Hello " + name);
        
        g.greet("Ankit");
    }
}

