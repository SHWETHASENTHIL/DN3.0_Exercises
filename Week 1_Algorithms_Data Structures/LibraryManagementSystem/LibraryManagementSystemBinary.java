package LibraryManagementSystem;
import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystemBinary {

    public static Book binarySearchByTitle(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
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

        // Sort the array by title to use binary search
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        String searchTitle = "Book5";
        Book foundBook = binarySearchByTitle(books, searchTitle);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}

