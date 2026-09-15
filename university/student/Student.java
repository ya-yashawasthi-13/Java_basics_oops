package university.student;

public class Student {
    private int studentId;
    private String name;
    private int semester;
    private int[] marks;

    public Student(int studentId, String name, int semester, int[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.semester = semester;
        this.marks = marks;
    }

    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculatePercentage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        return (calculateTotalMarks() * 100.0) / (marks.length * 100);
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 75) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}
