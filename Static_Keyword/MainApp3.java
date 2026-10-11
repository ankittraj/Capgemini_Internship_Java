package Static_Keyword;
// Static Block

class Student {
    String name;
    int roll_no;
    static String school_name; // Initialized by Static block

    static{
        school_name = "XYZ School";
    }

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("School Name: " + school_name);
        System.out.println("----------------------------");
    }
}

public class MainApp3 {
    public static void main(String[] args) {
        Student std1 = new Student("Rohan", 101);
        std1.displayStudentDetails();

        Student std2 = new Student("Rohit", 102);
        std2.displayStudentDetails();

        Student std3 = new Student("Aman", 103);
        std3.displayStudentDetails();

        
    }
}
