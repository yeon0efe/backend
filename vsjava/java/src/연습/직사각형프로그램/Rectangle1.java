package 연습.직사각형프로그램;
//해당 코드는 절차지향 프로그래밍
//이 코드를 객체지향으로 변경하기
public class Rectangle1 {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculateArea(width,height);
        System.out.println("넓이 : "+ area);

        int perimeter = calculaterPerimeter(width,height);
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = isSquare(width,height);
        System.out.println("정사각형 여부 : " + square);
    }

    static int calculateArea(int width,int height){
        return (width * height);
    }
    static int calculaterPerimeter(int width,int height){
        return (width + height) * 2 ;
    }
    static boolean isSquare (int width,int height){
        return width == height;
        // 비교연산자
        // widht와 height가 같지 않으면 false를 같다면 true를 반환한다.

    }
}
