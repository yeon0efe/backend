package a1113;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        System.out.print("정수를 입력하세요 : ");
        input= scanner.nextInt();

        if(input<=0){
            System.out.println("0보다 큰 숫자를 입력해주세요.");
        }else{
            if(input%2==0){
                System.out.println(input + "은 짝수입니다.");
            }else {
                System.out.println(input + "은 홀수입니다.");
            }
        }
    }
}
