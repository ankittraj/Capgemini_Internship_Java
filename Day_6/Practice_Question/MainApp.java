package Day_6.Practice_Question;

class Student {
    String name;
    int roll_no;
    String school_name;

    Student(String name, int roll_no, String school_name) {
        this.name = name;
        this.roll_no = roll_no;
        this.school_name = school_name;
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
        Student std1 = new Student("Ankit", 101, "XYZ School");
        Student std2 = new Student("Rohan", 102, "XYZ School");
        Student std3 = new Student("Amit", 103, "XYZ School");

        std1.displayStudentDetails();
        std2.displayStudentDetails();
        std3.displayStudentDetails();
    }
}
