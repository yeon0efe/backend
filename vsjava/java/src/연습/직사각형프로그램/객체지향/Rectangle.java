package 연습.직사각형프로그램.객체지향;

public class Rectangle {

        int width = 0;
        int height = 0;
        int area =0;
        int perimeter = 0;
        boolean isSquare = false;


    static void calculateArea(int width,int height){
        int area = width * height;
        System.out.println("넓이 : " + area);
    }
    static void calculaterPerimeter(int width,int height){
        int perimeter = 2 * (width + height);
        System.out.println("둘레 : " + perimeter);
    }
    static void isSquare (int width,int height){
        if(width==height){
            System.out.println("정사각형입니다.");
        }else{
            System.out.println("정사각형이 아닙니다.");
        }
    }


}
