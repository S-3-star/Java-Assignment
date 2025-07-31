
import java.util.*;

public class LibraryManagementSystem {

    public static void displayBooks(List<? extends Book> books) {
        System.out.println("\n--- All Available Books ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        // 1. List to store all books
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Muna Madan", "Laxmi Prasad Devkota"));
        bookList.add(new Book("Philippians", "Apostle Paul"));
        bookList.add(new Book("Exodus", "Moses"));

        // 2. Set to store borrowed books
        Set<Book> borrowedBooks = new HashSet<>();
        borrowedBooks.add(bookList.get(1)); // Harry Potter

        // 3. Map to store member IDs and their borrowed books
        
        Map<String, List<Book>> memberBorrowMap = new HashMap<>();

        memberBorrowMap.put("J001", new ArrayList<>());
        memberBorrowMap.get("J001").add(bookList.get(1)); // Harry Potter

        memberBorrowMap.put("J002", new ArrayList<>());
        memberBorrowMap.get("J002").add(bookList.get(2)); // Java Programming

        // 4. Iterate with enhanced for loop
        displayBooks(bookList); // wildcard usage here

        // 5. Display borrowed books using Iterator
        System.out.println("\n--- Borrowed Books ---");
        Iterator<Book> iterator = borrowedBooks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 6. Display map of members and borrowed books
        System.out.println("\n--- Member Borrow Records ---");
        for (Map.Entry<String, List<Book>> entry : memberBorrowMap.entrySet()) {
            System.out.println("Member ID: " + entry.getKey());
            for (Book b : entry.getValue()) {
                System.out.println(" - " + b);
            }
        }
    }
}


