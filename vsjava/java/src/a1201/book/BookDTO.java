package a1201.book;

public class BookDTO {
    private int id;          // 도서 ID
    private String title;    // 도서 제목
    private String author;   // 저자
    private int year;        // 출판 연도

    // 기본 생성자
    public BookDTO() {}

    // 생성자
    public BookDTO(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // 게터와 세터
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString 메서드 (도서 정보를 보기 좋게 출력하기 위해)
    @Override
    public String toString() {
        return "ID: " + id + ", 제목: " + title + ", 저자: " + author + ", 출판연도: " + year;
    }
}
