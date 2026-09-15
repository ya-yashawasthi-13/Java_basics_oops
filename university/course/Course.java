package university.course;

public class Course {
    private int courseId;
    private String courseName;
    private int credits;
    private double fee;

    public Course(int courseId, String courseName, int credits, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.fee = fee;
    }

    public double calculateTotalFee() {
        return credits * fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Fee per Credit: Rs. " + fee);
    }
}
