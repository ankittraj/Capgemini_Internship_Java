package Day_10;

class Box<T> {
    private T item;

    void set(T item) {
        this.item = item;
    }

    T get() {
        return item;
    }
}

public 
class Generics1 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.set("hello");

        String s = box.get();

        System.out.println(s);

        // Example 2: Store an Integer
        Box<Integer> box2 = new Box<>();
        box2.set(100);

        Integer number = box2.get();
        System.out.println(number);
    }
}

// 1. Compile-time errors detected. Without generics, we can't detect
//    compile-time errors, and the code will break while executing (runtime).

// 2. No manual casting.

// 3. Reusable code. (One Box class works for any type).

// Rules:
// 1. Mention the wrapper class.
// 2. Java automatically performs autoboxing and unboxing.