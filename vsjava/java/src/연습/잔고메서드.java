package 연습;

public class 잔고메서드 {

    public static void main(String[] args) {
        int balance=10000;

        //1000원 입금
        balance=in_money(balance,1000);
        //5000원 입금
        balance=out_money(balance,100000);
    }
    public static int in_money(int balance,int amount){
        balance += amount;
        System.out.println(amount + "원 입금되었습니다.");
        System.out.println("현재 잔액 :"+ balance);
        return balance;
    }

    public static int out_money(int balance,int amount){
        if(balance>amount) {
            balance -= amount;
            System.out.println(amount + "원 출금되었습니다.");
            System.out.println("현재 잔액 :" + balance);
            return balance;
        }else{
            System.out.println("잔액이 부족하여 인출할 수 없습니다. 현재 잔액 :"+balance);
            return balance;
        }
    }

}
