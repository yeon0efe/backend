package a1129.Book;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books; // 모든 책 리스트
    private ArrayList<Book> borrowedBooks; // 대출된 책 리스트

    public BookManager() {
        books = new ArrayList<>();
        borrowedBooks = new ArrayList<>();

        // 초기 책 데이터 추가
        books.add(new Book("피프티피플", "정세랑", "창비"));
        books.add(new Book("작별하지않는다", "한강", "문학동네"));
        books.add(new Book("스노볼드라이브", "조예은", "민음사"));
        books.add(new Book("아가미", "구병모", "위즈덤하우스"));
    }

    public void displayAvailableBooks() {
        System.out.println("대출 가능한 책:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.borrowBook();
                borrowedBooks.add(book);
                return true;
            }
        }
        return false;
    }

    public void displayBorrowedBooks() {
        System.out.println("대출된 책:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

    public boolean returnBook(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                borrowedBooks.remove(book);
                return true;
            }
        }
        return false;
    }

    public void addBook(String title, String author, String publisher) {
        books.add(new Book(title, author, publisher));
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title) && book.isAvailable());
    }
}
