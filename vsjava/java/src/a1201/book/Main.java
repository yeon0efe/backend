package a1201.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO(); // BookDAO 객체 생성
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 조회");
            System.out.println("5. 도서 목록 보기");
            System.out.println("0. 종료");
            System.out.print(">> ");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    bookDAO.addBook();
                    break;
                case 2:
                    bookDAO.deleteBook();
                    break;
                case 3:
                    bookDAO.updateBook();
                    break;
                case 4:
                    bookDAO.searchBook();
                    break;
                case 5:
                    bookDAO.printAllBooks();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
