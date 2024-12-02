package a1201.book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {
    private ArrayList<BookDTO> bookList; // 도서 목록을 저장하는 리스트
    private Scanner sc = new Scanner(System.in);

    // 생성자
    public BookDAO() {
        bookList = new ArrayList<>();
        // 기본 도서 데이터 추가
        bookList.add(new BookDTO(1, "Java Programming", "Author A", 2020));
        bookList.add(new BookDTO(2, "Python Basics", "Author B", 2019));
        bookList.add(new BookDTO(3, "Data Structures", "Author C", 2018));
    }

    // 도서 추가
    public void addBook() {
        System.out.println("<도서 추가>");
        System.out.print("도서 제목: ");
        String title = sc.nextLine();
        System.out.print("저자: ");
        String author = sc.nextLine();
        System.out.print("출판 연도: ");
        int year = sc.nextInt();
        sc.nextLine();

        // 새로운 도서 ID는 bookList의 크기를 기준으로 자동 할당
        int id = bookList.size() + 1;

        BookDTO newBook = new BookDTO(id, title, author, year);
        bookList.add(newBook);

        System.out.println("도서가 추가되었습니다.");
    }

    // 도서 삭제
    public void deleteBook() {
        System.out.println("<도서 삭제>");
        System.out.print("삭제할 도서의 ID를 입력하세요: ");
        int id = sc.nextInt();
        int index = findBookIndexById(id);

        if (index == -1) {
            System.out.println("도서를 찾을 수 없습니다.");
        } else {
            bookList.remove(index);
            System.out.println("도서가 삭제되었습니다.");
        }
    }

    // 도서 수정
    public void updateBook() {
        System.out.println("<도서 수정>");
        System.out.print("수정할 도서의 ID를 입력하세요: ");
        int id = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        int index = findBookIndexById(id);

        if (index == -1) {
            System.out.println("도서를 찾을 수 없습니다.");
        } else {
            BookDTO book = bookList.get(index);
            System.out.print("새로운 도서 제목 (기존: " + book.getTitle() + "): ");
            String title = sc.nextLine();
            System.out.print("새로운 저자 (기존: " + book.getAuthor() + "): ");
            String author = sc.nextLine();
            System.out.print("새로운 출판 연도 (기존: " + book.getYear() + "): ");
            int year = sc.nextInt();

            // 수정된 정보 반영
            book.setTitle(title);
            book.setAuthor(author);
            book.setYear(year);

            System.out.println("도서 정보가 수정되었습니다.");
        }
    }

    // 도서 조회
    public void searchBook() {
        System.out.println("<도서 조회>");
        System.out.print("조회할 도서의 ID를 입력하세요: ");
        int id = sc.nextInt();
        int index = findBookIndexById(id);

        if (index == -1) {
            System.out.println("도서를 찾을 수 없습니다.");
        } else {
            System.out.println(bookList.get(index).toString());
        }
    }

    // 도서 목록 출력
    public void printAllBooks() {
        System.out.println("도서 목록:");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }

    // 도서 ID로 해당 도서를 찾는 함수
    private int findBookIndexById(int id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == id) {
                return i;
            }
        }
        return -1; // 해당 도서를 찾지 못한 경우
    }
}
