import java.util.ArrayList;

class Book {
    public String title;
    public String author;
    public String isbn;

    public Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Member {
    public String name;
    public int memberId;
    public ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String n, int id) {
        name = n;
        memberId = id;
    }
}

class Transaction {
    public void borrowBook(Book b, Member m) {
        m.borrowedBooks.add(b);
        System.out.println("Borrowed");
    }

    public void returnBook(Book b, Member m) {
        m.borrowedBooks.remove(b);
        System.out.println("Returned");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Book b = new Book("Java", "Author", "123");
        Member m = new Member("User", 1);
        Transaction t = new Transaction();

        t.borrowBook(b, m);
        t.returnBook(b, m);
    }
}