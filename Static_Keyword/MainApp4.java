package Static_Keyword;
// Static class ----> Static Nested Class

// Java allows the creation of static nested classes (a class inside another class declared as static).

// A static nested class can access only static members of the outer class!

// It doesn't need an instance of the outer class to be instantiated.


class Test{

    int a = 10;
    static int b = 20;

    static class ABC{
        void m1(){
            System.out.println("m1 method of ABC class is executed");
            //System.out.println("a : " + a);
            System.out.println("b : " + b);
        }
    }
}
public class MainApp4 {
    public static void main(String args[]){
        Test.ABC obj = new Test.ABC();
        obj.m1();

    }
}
