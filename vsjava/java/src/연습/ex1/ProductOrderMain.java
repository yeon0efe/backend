package 연습.ex1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부",2000,2);
        orders[1]= createOrder("김치",5000,1);
        orders[2] = createOrder("콜라",1500,2);
//        ProductOrder order1 = new ProductOrder();
//        order1.productName = "두부";
//        order1.price = 2000;
//        order1.quantity = 2;
//        orders[0] = order1;
//
//        ProductOrder order2 = new ProductOrder();
//        order2.productName = "김치";
//        order2.price = 5000;
//        order2.quantity = 1;
//        orders[1] = order2;
//
//        ProductOrder order3 = new ProductOrder();
//        order3.productName = "콜라";
//        order3.price = 1500;
//        order3.quantity = 2;
//        orders[2] = order3;
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);

//        for (ProductOrder order : orders) {
//            System.out.println("상품명 " + order.productName + ", 가격 " + order.price + ", 수량 " + order.quantity);
//            totalAmount = totalAmount + order.price * order.quantity;
//        }
        System.out.println("총 결제 금액 :" + totalAmount);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 " + order.productName + ", 가격 " + order.price + ", 수량 " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount=0;
        for (ProductOrder order : orders){
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

}





//public class ProductOrderMain {
//    public static void main(String[] args) {
//        ProductOrder[] orders = new ProductOrder[3];
//
//        ProductOrder order1 = new ProductOrder();
//        order1.productName = "두부";
//        order1.price = 2000;
//        order1.quantity = 2;
//        orders[0] = order1;
//
//        ProductOrder order2 = new ProductOrder();
//        order2.productName = "김치";
//        order2.price = 5000;
//        order2.quantity = 1;
//        orders[1] = order2;
//
//        ProductOrder order3 = new ProductOrder();
//        order3.productName = "콜라";
//        order3.price = 1500;
//        order3.quantity = 2;
//        orders[2] = order3;
//
//        int totalAmount=0;
//        for(ProductOrder order :orders) {
//            System.out.println("상품명 " +order.productName +", 가격 " + order.price + ", 수량 "+order.quantity);
//            totalAmount = totalAmount + order.price * order.quantity;
//        }
//        System.out.println("총 결제 금액 :" + totalAmount);
//    }

