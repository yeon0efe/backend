package a1113;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 9 사이의 숫자를 입력해주세요:");
        int num = scanner.nextInt();

        for(int i=1;i<10;i++){
            System.out.println(num + "x" + i+"=" + num*i);
        }
    }
}
