
class College {
    private String collegeName;


    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    public void displayDetails() {
        System.out.println("College Name: " + collegeName);
    }
}

class Department extends College {
    private String departmentName;

    public Department(String collegeName, String departmentName) {
        super(collegeName);
        this.departmentName = departmentName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department Name: " + departmentName);
    }
}

class Faculty extends Department {
    private String facultyName;

    public Faculty(String collegeName, String departmentName, String facultyName) {
        super(collegeName, departmentName);
        this.facultyName = facultyName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Faculty Name: " + facultyName);
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Creating objects
        Faculty faculty = new Faculty("IEM", "CSE AIML", "Swarnendu");

        // Displaying details
        faculty.displayDetails();
    }
}
