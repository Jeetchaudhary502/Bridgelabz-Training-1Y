package com.gla.Packages.Q5;



public class Main {
    public static void main(String[] args) {

        // 1. Adding a new book
        Book b1 = new Book(101, "Atomic Habits", "James Clear");
        System.out.println("New Book Added:");
        b1.displayBook();

        // 2. Registering a new member
        Member m1 = new Member(1, "Jeet");
        System.out.println("\nNew Member Registered:");
        m1.displayMember();

        // 3. Issuing a book
        Transaction t = new Transaction();
        t.issueBook(b1, m1);
    }
}
