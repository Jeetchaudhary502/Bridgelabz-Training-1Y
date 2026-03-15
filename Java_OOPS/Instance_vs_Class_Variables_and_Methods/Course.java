class Course {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    Course(String name, int d, double f) {
        courseName = name;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println();
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 2, 4000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName(" GLA UNIVERSITY");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}