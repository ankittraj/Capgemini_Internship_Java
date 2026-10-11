package Static_Keyword;
// Static Method

// public class MainApp2 {

//     void m1(){
//         System.out.println("Hello M1");
//     }

//     static void m2(){
//         System.out.println("Hello M2");
//     }

//     public static void main(String[] args) {
//         //MainApp2.m1();  It is a instance method so we can not call directly by class Name 
//         // for accessing this method we have to create an Object of the class

//         MainApp2.m2(); 

//         MainApp2 mm = new MainApp2();
//         mm.m1();
//     }
    
// }

public class MainApp2 {

    int a = 10;
    static int b = 20;

    void m1(){
        System.out.println("Hello M1");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    static void m2(){
        System.out.println("Hello M2");
        //System.out.println("a: "+a);   It is a instance variable so we can not call in the static method
        // for accessing this variable we have to create an Object of the class
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {

        MainApp2.m2(); 

        MainApp2 mm = new MainApp2();
        mm.m1();
    }
    
}
