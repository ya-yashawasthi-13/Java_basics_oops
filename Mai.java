
import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class Mai {

    static void validateMarks(int marks)
            throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(
                "Invalid marks! Marks must be between 0 and 100."
            );
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        try {
            validateMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
