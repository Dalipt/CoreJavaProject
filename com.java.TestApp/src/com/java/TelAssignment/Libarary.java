package com.java.TelAssignment;
//6.Implements multiple constructor to Initialize different sets of parameters fields
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void checkOutBook(Book book)
    {
    	if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book checked out: " + book);
        } else
        {
            System.out.println("Book not found: " + book);
        }
    }

    public void displayBooks() 
    {
        for (Book book : books)
        {
            System.out.println(book);
        }
    }
}

public class Libarary {

	public static void main(String[] args)
	{
		
		Library lb= new Library();
		Book bk= new Book("English", "Treahan", "1Edition");
		Book bk1= new Book("Punjabi", "Amrita", "2Edition");
		//bk1= new Book("Punjabi", "Amrita", "2Edition");
		Book bk2=new Book("marathi", "mrita", "4Edition");
		lb.addBook(bk);
		lb.addBook(bk1);
		//lb.addBook(bk2);
		lb.addBook(bk2);
		System.out.println("All Books");
		lb.displayBooks();
		System.out.println("Checked out Books");
		lb.checkOutBook(bk);
		lb.checkOutBook(bk1);
		lb.displayBooks();

	}

}
