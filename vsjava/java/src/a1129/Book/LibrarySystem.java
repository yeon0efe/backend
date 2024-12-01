package a1129.Book;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();
        boolean running = true;

        while (running) {
            System.out.println("\n****도서 대출 시스템****\n");
            System.out.println("1. 도서목록[대출 가능]");
            System.out.println("2. 도서목록[대출 불가]");
            System.out.println("-------------------");
            System.out.println("3. 도서 대출");
            System.out.println("4. 도서 반납");
            System.out.println("-------------------");
            System.out.println("5. 도서 추가");
            System.out.println("6. 도서 삭제");
            System.out.println("7. 프로그램 종료");
            System.out.print("작업을 선택하세요 > ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    manager.displayAvailableBooks();
                    break;
                case 2:
                    manager.displayBorrowedBooks();
                    break;
                case 3:
                    System.out.print("대출할 책 제목 입력 > ");
                    String borrowTitle = sc.nextLine();
                    if (manager.borrowBook(borrowTitle)) {
                        System.out.println("대출이 완료되었습니다.");
                    } else {
                        System.out.println("현재 대출이 불가능합니다.");
                    }
                    break;
                case 4:
                    System.out.print("반납할 책 제목 입력 > ");
                    String returnTitle = sc.nextLine();
                    if (manager.returnBook(returnTitle)) {
                        System.out.println("반납이 완료되었습니다.");
                    } else {
                        System.out.println("반납할 책이 없습니다.");
                    }
                    break;
                case 5:
                    System.out.print("추가할 책 제목 > ");
                    String title = sc.nextLine();
                    System.out.print("저자 > ");
                    String author = sc.nextLine();
                    System.out.print("출판사 > ");
                    String publisher = sc.nextLine();
                    manager.addBook(title, author, publisher);
                    System.out.println("<"+ title +"> [도서등록완료]");
                    break;
                case 6:
                    System.out.print("삭제할 책 제목 입력 > ");
                    String deleteTitle = sc.nextLine();
                    manager.removeBook(deleteTitle);
                    System.out.println("<"+ deleteTitle +"> [도서삭제완료]");
                    break;
                case 7:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }

        sc.close();
    }
}
