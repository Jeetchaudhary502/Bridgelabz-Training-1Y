package com.gla.Packages.Q1;


public class Main {
    public static void main(String[] args) {

        // Create Student object
        Student s = new Student("Jeet", 101);
        s.displayStudent();

        System.out.println();

        // Create Faculty object
        Faculty f = new Faculty("Dr. Sharma", "Mathematics");
        f.displayFaculty();
    }
}
