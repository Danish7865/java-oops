import java.util.Scanner;

public class StudentReportcard {
    String name;
    int rollNumber;
    int marks;

    // ✅ Constructor
    StudentReportcard(String studentName, int studentRoll, int studentMarks) {
        name = studentName;
        rollNumber = studentRoll;
        marks = studentMarks;
    }

    // ✅ Display Method
    void displayReport() {
        System.out.println("\n📋 Student Report Card");
        System.out.println("--------------------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks + "/100");

        if (marks >= 90) {
            System.out.println("Grade      : A+");
        } else if (marks >= 75) {
            System.out.println("Grade      : A");
        } else if (marks >= 60) {
            System.out.println("Grade      : B");
        } else if (marks >= 40) {
            System.out.println("Grade      : C");
        } else {
            System.out.println("Grade      : F (Fail)");
        }
    }

    // ✅ Main Method (start point)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();

        // ✅ Object bana rahe hain
        StudentReportcard s1 = new StudentReportcard(name, rollNumber, marks);
        s1.displayReport();  // ✅ Method call
    }
}