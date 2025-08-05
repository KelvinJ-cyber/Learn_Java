package chatserver.java.src;

public class Book {
    String bookTitle;
    String author;
    int bookYear;

    Book(String bookTitle, String author, int bookYear){
        this.bookTitle = bookTitle;
        this.author = author;
        this.bookYear = bookYear;
    }

    public static void main(String [] args){

        System.out.println("----Welcome to the book library!---");

        Book book1 = new Book("Think and Grow Rich", "David Goggins", 2018);
        Book book2 = new Book("Buy Back Your Time", "Dan Martell", 2023);

        System.out.println("Book 1: "  + book1.author + " wrote " + "'" + book1.bookTitle +  "'" +" in " + book1.bookYear);
        System.out.println("Book 2: "  + book2.author + " wrote " + "'" + book2.bookTitle +  "'" +" in " + book2.bookYear);

    }


}
