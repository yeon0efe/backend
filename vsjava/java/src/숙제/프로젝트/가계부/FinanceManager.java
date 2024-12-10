package 숙제.프로젝트.가계부;

import java.util.*;

public class FinanceManager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("가계부 프로그램");
            System.out.println("1. 수입 추가");
            System.out.println("2. 지출 추가");
            System.out.println("3. 가계부 보기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // to consume the newline character

            switch (choice) {
                case 1:
                    addIncome();
                    break;
                case 2:
                    addExpense();
                    break;
                case 3:
                    showTransactions();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private static void addIncome() {
        System.out.print("수입 금액을 입력하세요: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character
        transactions.add(new Transaction("수입", amount));
        System.out.println("수입이 추가되었습니다.");
    }

    private static void addExpense() {
        System.out.print("지출 금액을 입력하세요: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character
        transactions.add(new Transaction("지출", amount));
        System.out.println("지출이 추가되었습니다.");
    }

    private static void showTransactions() {
        double totalIncome = 0, totalExpense = 0;
        System.out.println("가계부 내역:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getType() + ": " + transaction.getAmount());
            if (transaction.getType().equals("수입")) {
                totalIncome += transaction.getAmount();
            } else {
                totalExpense += transaction.getAmount();
            }
        }
        System.out.println("총 수입: " + totalIncome);
        System.out.println("총 지출: " + totalExpense);
        System.out.println("잔액: " + (totalIncome - totalExpense));
    }
}

class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
