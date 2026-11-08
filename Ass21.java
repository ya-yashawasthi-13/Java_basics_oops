
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ass21 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2;
    JRadioButton male, female;
    JCheckBox java, python, cpp;
    JComboBox<String> course;
    JButton submit;

    Ass21() {
        setTitle("Student Details Form");
        setSize(400, 450);
        setLayout(new GridLayout(7, 2, 10, 10));

        l1 = new JLabel("Name:");
        t1 = new JTextField();

        l2 = new JLabel("Roll Number:");
        t2 = new JTextField();

        l3 = new JLabel("Gender:");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JPanel genderPanel = new JPanel();
        genderPanel.add(male);
        genderPanel.add(female);

        l4 = new JLabel("Skills:");
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        cpp = new JCheckBox("C++");

        JPanel skillPanel = new JPanel();
        skillPanel.add(java);
        skillPanel.add(python);
        skillPanel.add(cpp);

        l5 = new JLabel("Course:");
        String courses[] = {"BCA", "B.Tech", "BBA", "MCA"};
        course = new JComboBox<>(courses);

        l6 = new JLabel("");
        submit = new JButton("Submit");
        submit.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(genderPanel);
        add(l4);
        add(skillPanel);
        add(l5);
        add(course);
        add(l6);
        add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String gender = "Not selected";

        if (male.isSelected())
            gender = "Male";
        else if (female.isSelected())
            gender = "Female";

        String skills = "";

        if (java.isSelected())
            skills += "Java ";
        if (python.isSelected())
            skills += "Python ";
        if (cpp.isSelected())
            skills += "C++ ";

        String result = "Name: " + t1.getText()
                + "\nRoll Number: " + t2.getText()
                + "\nGender: " + gender
                + "\nSkills: " + skills
                + "\nCourse: " + course.getSelectedItem();

        JOptionPane.showMessageDialog(this, result,
                "Student Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Ass21();
    }
}
