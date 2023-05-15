import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Book implements Comparable<Book>
{
private int id;
private String title;
private String author;
private String publisher;
public Book(int id, String title, String author, String publisher)
{
this.id = id;
this.title = title;
this.author = author;
this.publisher = publisher;
}
public int compareTo(Book b)
{
return this.id - b.id;
}
public int getId()
{
return id;
}
public String getTitle()
{
return title;
}
public String getAuthor()
{
return author;
}
public String getPublisher()
{
return publisher;
}
public static void main(String[] args)
{
ArrayList<Book> books = new ArrayList<Book>();
books.add(new Book(2, "Harry Potter and the Philosopher's Stone", "J.K. Rowling",
"Bloomsbury"));
books.add(new Book(1, "To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co."));
books.add(new Book(3, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company"));
Collections.sort(books);
System.out.println("Sorted by book id:");
for (Book b : books)
{
System.out.println(b.getId() + " " + b.getTitle() + " " + b.getAuthor() + " " + b.getPublisher());
}
Comparator<Book> titleComparator = new Comparator<Book>()
{
public int compare(Book b1, Book b2)
{
return b1.getTitle().compareTo(b2.getTitle());
}
};
Collections.sort(books, titleComparator);
System.out.println("\nSorted by book title:");
for (Book b : books)
{
System.out.println(b.getId() + " " + b.getTitle() + " " + b.getAuthor() + " " + b.getPublisher());
}
}
}