package LibraryManagementSystem;
public class LibraryManagementSystem {

    public static Book linearSearchByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("B001", "Book1", "author1"),
            new Book("B002", "Book2", "author2"),
            new Book("B003", "Book3", "author3"),
            new Book("B004", "Book4", "author4"),
            new Book("B005", "Book5", "author5")
        };

        String searchTitle = "Book5";
        Book foundBook = linearSearchByTitle(books, searchTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}

