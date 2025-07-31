
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString method
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }

    // equals & hashCode for HashSet functionality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equalsIgnoreCase(b.title) && author.equalsIgnoreCase(b.author);
    }

    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode() + author.toLowerCase().hashCode();
    }
}
