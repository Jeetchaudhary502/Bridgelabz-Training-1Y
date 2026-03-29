package com.gla.Packages.Q5;


public class Transaction {

    public void issueBook(Book book, Member member) {
        System.out.println("\n--- Book Issued ---");
        System.out.println("Book: " + book.title);
        System.out.println("Issued to: " + member.name);
    }

    public void returnBook(Book book, Member member) {
        System.out.println("\n--- Book Returned ---");
        System.out.println("Book: " + book.title);
        System.out.println("Returned by: " + member.name);
    }
}