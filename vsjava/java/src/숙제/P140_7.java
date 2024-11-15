package 숙제;


import java.util.Scanner;

public class P140_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while(run){
            System.out.println("--------------------------------");
            System.out.println("1.예금ㅣ 2.출금ㅣ3.잔고ㅣ4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택>");
            int input=sc.nextInt();

            switch(input){
                case 1:

                    System.out.print("예금액>");
                    int in=sc.nextInt();
                    balance=balance+in;
                    continue;
                case 2:
                    System.out.print("출금액>");
                    int out=sc.nextInt();
                    balance=balance-out;
                    continue;

                case 3:
                    System.out.println("잔고>"+ balance);
                    continue;
                case 4:
                    run=false;
                    System.out.println("종료합니다.");
                default:
                    System.out.println("정확한 숫자를 입력해주세요.");
            }

        }

    }
}
