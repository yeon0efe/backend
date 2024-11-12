package a1112;
import java.util.Scanner;

public class Scan11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("실수를 입력하세요:");
        float num=scan.nextFloat();


        System.out.printf("사용자가 입력한 숫자는 %.2f 입니다.",num);

    }
}