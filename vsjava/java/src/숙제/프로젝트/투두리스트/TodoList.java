package 숙제.프로젝트.투두리스트;

import java.util.*;

public class TodoList {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> todoList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("할 일 목록 관리");
            System.out.println("1. 할 일 추가");
            System.out.println("2. 할 일 삭제");
            System.out.println("3. 할 일 목록 보기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    showTasks();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private static void addTask() {
        System.out.print("할 일을 입력하세요: ");
        String task = scanner.nextLine();
        todoList.add(task);
        System.out.println("할 일이 추가되었습니다.");
    }

    private static void removeTask() {
        System.out.print("삭제할 할 일 번호를 입력하세요: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        if (taskNumber > 0 && taskNumber <= todoList.size()) {
            todoList.remove(taskNumber - 1);
            System.out.println("할 일이 삭제되었습니다.");
        } else {
            System.out.println("유효하지 않은 번호입니다.");
        }
    }

    private static void showTasks() {
        if (todoList.isEmpty()) {
            System.out.println("할 일이 없습니다.");
        } else {
            System.out.println("할 일 목록:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }
}
