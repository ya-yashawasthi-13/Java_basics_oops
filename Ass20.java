import java.applet.Applet;
import java.awt.Graphics;

public class Ass20 extends Applet {

    String name, roll, marks;

    public void init() {
        name = getParameter("name");
        roll = getParameter("roll");
        marks = getParameter("marks");
    }

    public void paint(Graphics g) {
        g.drawString("Student Details", 50, 50);
        g.drawString("Name: " + name, 50, 80);
        g.drawString("Roll No: " + roll, 50, 110);
        g.drawString("Marks: " + marks, 50, 140);
    }
}
