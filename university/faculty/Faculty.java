package university.faculty;

public class Faculty {
    private int facultyId;
    private String name;
    private String department;
    private String designation;

    public Faculty(int facultyId, String name, String depart, String designation) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = depart;
        this.designation = designation;
    }

    public void displayFacultyDetails() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
    }
}
