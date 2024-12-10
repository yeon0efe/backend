package 연습.bookconstruct;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();
        Book book2 = new Book("작별하지 않는다","한강");
        book2.displayInfo();
        Book book3 = new Book("위저드 베이커리","구병모",400);
        book3.displayInfo();
    }
}
