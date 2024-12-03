package 연습.직사각형프로그램.객체지향;

public class RectangleOopMain {
    public static void main(String[] args) {

        // 넓이 구하기
        Rectangle.calculateArea(10,10); // 결과값 : 넓이 100
        // 둘레 구하기
        Rectangle.calculaterPerimeter(20,10); // 결과값 : 둘레 60
        // 정사각형 여부 판별하기
        Rectangle.isSquare(10,10); // 결과값 : 정사각형입니다.
        Rectangle.isSquare(20,10); // 결과값 : 정사각형이 아닙니다.
    }
}
