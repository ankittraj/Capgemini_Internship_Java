package Static_Keyword;
//Can we override a static method in Java?
//No, static methods cannot be overridden in Java because they belong to the class rather than individual objects.
//Static method = method hiding; instance method = method overriding.

class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show();

        Parent obj = new Child();
        obj.show();
    }
}