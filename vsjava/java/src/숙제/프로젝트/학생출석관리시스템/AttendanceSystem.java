package 숙제.프로젝트.학생출석관리시스템;

import java.util.*;

public class AttendanceSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Boolean> studentAttendance = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("학생 출석 관리 시스템");
            System.out.println("1. 학생 등록");
            System.out.println("2. 출석 체크");
            System.out.println("3. 출석 현황 보기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // to consume the newline character

            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    markAttendance();
                    break;
                case 3:
                    showAttendance();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private static void registerStudent() {
        System.out.print("학생 이름을 입력하세요: ");
        String studentName = scanner.nextLine();
        studentAttendance.put(studentName, false);
        System.out.println(studentName + " 학생이 등록되었습니다.");
    }

    private static void markAttendance() {
        System.out.print("출석을 체크할 학생의 이름을 입력하세요: ");
        String studentName = scanner.nextLine();

        if (studentAttendance.containsKey(studentName)) {
            System.out.print(studentName + " 학생은 출석하셨습니까? (y/n): ");
            String attendance = scanner.nextLine();
            studentAttendance.put(studentName, attendance.equalsIgnoreCase("y"));
            System.out.println(studentName + " 학생의 출석 상태가 변경되었습니다.");
        } else {
            System.out.println("학생이 등록되지 않았습니다.");
        }
    }

    private static void showAttendance() {
        System.out.println("출석 현황:");
        for (Map.Entry<String, Boolean> entry : studentAttendance.entrySet()) {
            String status = entry.getValue() ? "출석" : "결석";
            System.out.println(entry.getKey() + " - " + status);
        }
    }
}
