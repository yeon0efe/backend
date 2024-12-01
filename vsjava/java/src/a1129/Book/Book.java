package a1129.Book;

public class Book {
    private String title;    // 책 제목
    private String author;   // 저자
    private String publisher; // 출판사
    private boolean available; // 대출 가능 여부

    public Book() {}

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.available = true; // 기본적으로 대출 가능
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        this.available = false;
    }

    public void returnBook() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "책 제목: " + title + ", 저자: " + author + ", 출판사: " + publisher
                + ", 상태: " + (available ? "대출 가능" : "대출 중");
    }
}
