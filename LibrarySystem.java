import java.util.*;

class Library {
    private int libraryId;
    private String name;
    private String address;
    private String contactDetails;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public Library(int libraryId, String name, String address, String contactDetails) {
        this.libraryId = libraryId;
        this.name = name;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.getName());
    }

    public Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }
}

class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private String ISBN;
    private boolean isAvailable;

    public Book(int bookId, String title, String author, String publisher, String ISBN) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Member {
    private int memberId;
    private String name;
    private String membershipType;
    private String contactDetails;

    public Member(int memberId, String name, String membershipType, String contactDetails) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.contactDetails = contactDetails;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("Book returned: " + book.getTitle());
    }
}

class Transaction {
    private int transactionId;
    private int bookId;
    private int memberId;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;

    public Transaction(int transactionId, int bookId, int memberId, Date issueDate, Date dueDate) {
        this.transactionId = transactionId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}

class Librarian {
    private String name;
    private String contactDetails;

    public Librarian(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public void issueBook(Library library, int bookId, int memberId) {
        Book book = library.findBookById(bookId);
        Member member = library.findMemberById(memberId);

        if (book != null && member != null && book.isAvailable()) {
            member.borrowBook(book);
        } else {
            System.out.println("Cannot issue book. Either the book or member does not exist, or the book is unavailable.");
        }
    }

    public void returnBook(Library library, int bookId, int memberId) {
        Book book = library.findBookById(bookId);
        Member member = library.findMemberById(memberId);

        if (book != null && member != null) {
            member.returnBook(book);
        } else {
            System.out.println("Cannot return book. Either the book or member does not exist.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(1, "Central Library", "Main Street", "123456789");
        Librarian librarian = new Librarian("Alice", "alice@library.com");

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();

                    Book book = new Book(bookId, title, author, publisher, ISBN);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Member Name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter Membership Type: ");
                    String membershipType = scanner.nextLine();
                    System.out.print("Enter Contact Details: ");
                    String contactDetails = scanner.nextLine();

                    Member member = new Member(memberId, memberName, membershipType, contactDetails);
                    library.registerMember(member);
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueBookId = scanner.nextInt();
                    System.out.print("Enter Member ID: ");
                    int issueMemberId = scanner.nextInt();

                    librarian.issueBook(library, issueBookId, issueMemberId);
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnBookId = scanner.nextInt();
                    System.out.print("Enter Member ID: ");
                    int returnMemberId = scanner.nextInt();

                    librarian.returnBook(library, returnBookId, returnMemberId);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
