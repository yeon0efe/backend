import java.util.Scanner;

public class Castion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("넓이 계산을 원하는 도형 유형을 선택해주세요");
        System.out.println("1. 원형\t2. 사각형\t3. 삼각형");
        int shape = scanner.nextInt();
        Shape shapeObject = null; // 추상 클래스 Shape는 객체를 직접 생성할 수 없음

        double area = 0;

        switch (shape) {
            case 1:
                System.out.println("반지름을 입력하세요:");
                double radius = scanner.nextDouble();
                shapeObject = new Circle(radius); // Circle 객체 생성
                area = shapeObject.calculateArea(); // 넓이 계산
                break;
            case 2:
                System.out.println("가로와 세로를 입력하세요:");
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                shapeObject = new Rectangle(width, height); // Rectangle 객체 생성
                area = shapeObject.calculateArea(); // 넓이 계산
                break;
            case 3:
                System.out.println("밑변과 높이를 입력하세요:");
                double base = scanner.nextDouble();
                double triHeight = scanner.nextDouble(); // Triangle 용으로 다른 변수 사용
                shapeObject = new Triangle(base, triHeight); // Triangle 객체 생성
                area = shapeObject.calculateArea(); // 넓이 계산
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }

        // 도형의 render와 넓이 출력
        System.out.println(shapeObject.getRender() + "의 넓이: " + area);
    }
}

abstract class Shape {
    private String render; // 도형 이름을 저장하는 필드

    public String getRender() {
        return render;
    }

    // 추상 메서드
    public abstract double calculateArea();

    // render 값을 설정하는 생성자
    public Shape(String render) {
        this.render = render;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("circle"); // 부모 클래스의 생성자를 호출하여 render 값 설정
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2); // 원의 넓이 계산
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("rectangle"); // 부모 클래스의 생성자를 호출하여 render 값 설정
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // 사각형의 넓이 계산
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("triangle"); // 부모 클래스의 생성자를 호출하여 render 값 설정
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // 삼각형의 넓이 계산
    }
}
