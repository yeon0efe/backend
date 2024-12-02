package 연습.ex11;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        // ProductOrder[]는 배열의 타입, orders가 배열의 이름
        orders[0]=createOrder("두부",2000,1);
        orders[1]=createOrder("김치",5000,2);
        orders[2]=createOrder("콜라",2200,10);

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
