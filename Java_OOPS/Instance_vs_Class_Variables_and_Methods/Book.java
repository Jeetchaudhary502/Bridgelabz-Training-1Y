class Book {

    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

class Main {
    public static void main(String[] args) {

        EBook e = new EBook();

        e.ISBN = "690-17147714";
        e.title = "The Epstien files";
        e.setAuthor("JEET CHAUDHARY");

        e.displayDetails();
    }
}