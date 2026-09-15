import university.course.Course;
import university.faculty.Faculty;
import university.student.Student;

public class UniversityMain {
    public static void main(String[] args) {
        Student student = new Student(101, "Amit Sharma", 5, new int[]{85, 90, 88, 92, 80});
        Faculty faculty = new Faculty(201, "Dr. Rani Verma", "Computer Science", "Professor");
        Course course = new Course(301, "Java Programming", 4, 2500);

        System.out.println("Student Details");
        student.displayStudentDetails();
        System.out.println("Total Marks: " + student.calculateTotalMarks());
        System.out.println("Percentage: " + String.format("%.2f", student.calculatePercentage()) + "%");
        System.out.println("Grade: " + student.calculateGrade());

        System.out.println("Faculty Details");
        faculty.displayFacultyDetails();

        System.out.println("Course Details");
        course.displayCourseDetails();
        System.out.println("Total Course Fee: Rs. " + course.calculateTotalFee());
    }
}
