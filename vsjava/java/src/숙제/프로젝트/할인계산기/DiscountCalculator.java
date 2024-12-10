package 숙제.프로젝트.할인계산기;

import java.util.Scanner;

public class DiscountCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("할인 계산기");
            System.out.println("1. 할인 계산");
            System.out.println("2. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                calculateDiscount();
            } else if (choice == 2) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private static void calculateDiscount() {
        System.out.print("원래 가격을 입력하세요: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("할인율(%)을 입력하세요: ");
        double discountRate = scanner.nextDouble();

        if (originalPrice < 0 || discountRate < 0 || discountRate > 100) {
            System.out.println("잘못된 입력입니다. 가격과 할인율은 0 이상이어야 하며, 할인율은 100 이하이어야 합니다.");
            return;
        }

        // 할인 금액 계산
        double discountAmount = originalPrice * (discountRate / 100);
        // 최종 가격 계산
        double finalPrice = originalPrice - discountAmount;

        System.out.println("할인 금액: " + discountAmount);
        System.out.println("최종 가격: " + finalPrice);
    }
}
