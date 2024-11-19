package a1119;

import java.util.Scanner;

public class cash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 화폐 단위 배열 정의 (오만원권부터 1원까지)
        int[] currencyUnits = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        String[] unitNames = {"오만원권", "만원권", "오천원권", "천원권", "오백원", "백원", "오십원", "십원", "오원", "일원"};

        System.out.print("금액을 입력하세요: ");
        int amount = scan.nextInt();

        System.out.println("화폐 단위별 개수:");
        for (int i = 0; i < currencyUnits.length; i++) {
            int count = amount / currencyUnits[i]; // 화폐 단위별 개수 계산
            if (count > 0) {
                System.out.println(unitNames[i] + ": " + count + "개");
            }
            amount %= currencyUnits[i]; // 남은 금액 계산
        }

        scan.close();
    }
}