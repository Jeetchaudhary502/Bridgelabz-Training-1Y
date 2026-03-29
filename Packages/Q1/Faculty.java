package com.gla.Packages.Q1;

public class Faculty {
    String name;
    String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
