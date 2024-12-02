// 이번엔 사용자에게 값을 입력받는다.
package 연습.ex111;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        //nextInt()메서드를 사용하면 숫자만 입력받고, 엔터키(\n)는 입력 버퍼에 남는다.
        // 이 개행 문자가 다음에 호출되는 nextLine()메서드에서 읽히게 되면,
        // 의도하지 않은 결과가 나올 수 있다.
        // 따라서 당장 nextLine()을 호출하여 버퍼에 남아있는 개행문자를 처리해주었다.
        // 다음 입력에서는 정상적인 값을 읽을 수 있게 만들어줌.
        //1줄요약***** 입력후 남은 개행문자 처리 *****
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i=0; i<orders.length;i++){
            System.out.println((i+1)+"번째 상품명을 입력해주세요.");
            System.out.print("상품명 >");
            String productName = scanner.nextLine();

            System.out.println( "가격을 입력해주세요.");
            System.out.print("가격 >");
            int price = scanner.nextInt();

            System.out.println("수량을 입력해주세요.");
            System.out.print("수량 >");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i]=createOrder(productName,price,quantity);
        }

        printOrder(orders);

        int totalAmount = total(orders);
        System.out.println("총 결제금액은 "+totalAmount+"입니다.");


    }

    static ProductOrder createOrder(String productName,int price,int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName=productName;
        order.price=price;
        order.quantity= quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 :" + order.productName + ", 가격 :" + order.price + ", 수량 :" + order.quantity);
        }
    }
    static int total(ProductOrder[] orders){
        int totalAmount = 0;
        for(ProductOrder order : orders){
            //total()메서드가 orders배열을 사용하려면 이 배열을 매개변수로 받아야 한다.
            totalAmount = totalAmount + order.price * order.quantity;
        }
        return totalAmount;
    }
}
