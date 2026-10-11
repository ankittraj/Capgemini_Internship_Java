package Static_Keyword;
// Static Variable

class Student {
    String name;
    int roll_no;
    static String school_name ="XYZ School"; 

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

public class MainApp {
    public static void main(String[] args) {
        Student std1 = new Student("Sonu", 101);
        std1.displayStudentDetails();

        Student std2 = new Student("Vikash", 102);
        std2.displayStudentDetails();

        Student std3 = new Student("Govinda", 103);
        std3.displayStudentDetails();

        
    }
}
