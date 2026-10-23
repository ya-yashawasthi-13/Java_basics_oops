import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    String department;
    double sub1, sub2, sub3;

    Student(int studentId, String studentName, String department, double sub1, double sub2, double sub3) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

  double calculateTotalMarks() {
        return sub1 + sub2 + sub3;
    }

  double calculateAverageMarks() {
        return calculateTotalMarks() / 3;
    }

    String determineGrade() {
        double avg = calculateAverageMarks();

        if (avg >= 90) {
            return "A+";
        } else if (avg >= 80) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 60) {
            return "C";
        } else if (avg >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Subject 3 Marks: " + sub3);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Average Marks: " + calculateAverageMarks());
        System.out.println("Grade: " + determineGrade());

    }
}

class Ass3 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", "CSE", 88, 92, 90);
        Student s2 = new Student(102, "Riya", "ECE", 76, 81, 72);
        Student s3 = new Student(103, "Karan", "MECH", 55, 60, 58);

        System.out.println("Student Academic Records\n");

        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
    }
}