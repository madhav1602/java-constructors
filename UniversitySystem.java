class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to update CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0 and 10.");
        }
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Display postgraduate student
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }
}

// Driver class
public class UniversitySystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Madhav", 8.5);
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Simran", 9.2, "Data Science");

        s1.displayDetails();
        pg1.displayPostgraduateDetails();

        // Modifying CGPA
        s1.setCGPA(9.0);
        pg1.setCGPA(9.5);

        System.out.println("After updating CGPA:");
        s1.displayDetails();
        pg1.displayPostgraduateDetails();
    }
}
