class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName;

    // parametrised Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName + ", Course: " + courseName +
                ", Duration: " + duration + " weeks, Fee: $" + fee);
    }

    // Static method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 10, 5000);
        Course c2 = new Course("Web Development", 12, 6000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Updating the institute name
        Course.updateInstituteName("Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
