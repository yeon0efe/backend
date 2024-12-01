package 숙제;

public class Q1121 {
    public static void main(String[] args) {
        // Rectangle 객체 생성
        Rectangle rect = new Rectangle();
        rect.setDimensions(5, 6);
        System.out.println("사각형의 면적: " + rect.getArea());
        System.out.println("사각형의 둘레: " + rect.getPerimeter());

<<<<<<< HEAD
        // 정사각형 예제
        Rectangle square = new Rectangle();
        square.setDimensions(4); // 정사각형으로 설정
=======
        // 정사각형
        Rectangle square = new Rectangle();
        square.setDimensions(4);
>>>>>>> 679df517dcff3bf053997b3de896229a4ad6bfb8
        System.out.println("정사각형 면적: " + square.getArea());
        System.out.println("정사각형 둘레: " + square.getPerimeter());
    }
}

class Rectangle {
    private double width;  // 가로 길이
    private double height; // 세로 길이

    // 기본 생성자: width와 height를 0으로 초기화
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    // 값을 입력받는 생성자: width와 height를 초기화
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // setDimensions 메서드 (오버로딩)
<<<<<<< HEAD

    public void setDimensions(double side) {
        this.width = side;
        this.height = side;
    }

=======
>>>>>>> 679df517dcff3bf053997b3de896229a4ad6bfb8
    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

<<<<<<< HEAD
=======
    public void setDimensions(double side) {
        this.width = side;
        this.height = side;
    }
>>>>>>> 679df517dcff3bf053997b3de896229a4ad6bfb8

    // getArea 메서드 (오버로딩)
    public double getArea() {
        return this.width * this.height;
    }

    public double getArea(double side) {
        return side * side; // 정사각형 면적 계산
    }

    // getPerimeter 메서드 (오버로딩)
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public double getPerimeter(double side) {
        return 4 * side; // 정사각형 둘레 계산
    }
}
