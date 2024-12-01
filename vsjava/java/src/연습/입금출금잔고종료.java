package 연습;

import java.util.Scanner;

public class 입금출금잔고종료 {

    public static void main(String[] args) {
        int balance = 0;
        boolean run = true;
        while (run){
            System.out.println("--------------------");
            System.out.println("1입금 2출금 3잔고 4종료");
            System.out.println("--------------------");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            int amount=0;

            switch (choice){
                case 1:
                    System.out.println("입금할 금액을 입력하세요.");
                    amount = sc.nextInt();
                    balance += amount;
                    break;

                case 2:
                    System.out.println("출금할 금액을 입력하세요.");
                    amount = sc.nextInt();
                    if(balance>=amount){
                        balance -= amount;
                    }else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔액은 "+balance+"입니다.");
                break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                break;
                default:
                    System.out.println("메뉴에 해당하는 숫자를 입력해주세요.");
                    break;
            }
        }

    }
}
