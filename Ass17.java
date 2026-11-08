import java.io.*;

// Class implementing Serializable
class Student implements Serializable {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class Ass17 {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Rahul", 85.5);

            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.txt")
            );

            out.writeObject(s1);
            out.close();

            System.out.println("Object serialized successfully.");

            ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.txt")
            );

            Student s2 = (Student) in.readObject();
            in.close();

            System.out.println("Student Details:");
            System.out.println("Roll No: " + s2.rollNo);
            System.out.println("Name: " + s2.name);
            System.out.println("Marks: " + s2.marks);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
