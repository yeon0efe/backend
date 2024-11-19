package a1119;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 화폐 단위 배열 정의 (오만원권부터 1원까지)
        int[] cash = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        String[] cash_string = {"오만원권", "만원권", "오천원권", "천원권", "오백원", "백원", "오십원", "십원", "오원", "일원"};

        System.out.print("금액을 입력하세요: ");
        int amount = scan.nextInt();


        for (int i = 0; i < cash.length; i++) {
            int count = amount /cash[i];
            if (count > 0) {
                System.out.println(cash_string[i] + ": " + count + "개");
            }
            amount %= cash[i];
        }

        scan.close();
    }
}
