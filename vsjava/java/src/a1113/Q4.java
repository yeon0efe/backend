package a1113;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("0보다 큰 숫자를 입력해주세요 :");
        int input = scanner.nextInt();

        int i;
        var sum = 0;
        for(i=1;i<=input;i++){
            sum = sum + i;  // sum +=1;과 같다.
        }
        System.out.println("1부터 "+input+"까지의 합은 "+sum+" 입니다.");
    }
}
