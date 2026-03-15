class Student {

    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

class Main {
    public static void main(String[] args) {

        PostgraduateStudent p = new PostgraduateStudent();

        p.rollNumber = 28;
        p.name = "Jeet";
        p.setCGPA(8.7);

        p.displayDetails();
    }
}