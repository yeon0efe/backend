package a1120.class_ex;

public class CarEx {
    public static void main(String[] args) {

        Car myCar1= new Car();
        myCar1.company = "현대";
        myCar1.model = "제네시스G80";
        myCar1.color = "white";
        myCar1.maxSpeed = 240;
        myCar1.speed = 120;

        Car myCar2 = new Car();
        myCar2.company = "도요타";
        myCar2.model = "camry";
        myCar2.color = "black";
        myCar2.maxSpeed = 210;
        myCar2.speed = 90;

        System.out.println("myCar1을 소개합니다.");
        System.out.println("제조사 : " +myCar1.company);
        System.out.println("모델 : "+myCar1.model);
        System.out.println("색상 : "+myCar1.color);
        System.out.println("현재속도 : "+myCar1.speed);
        myCar1.speed = 60;
        System.out.println("수정된속도 : "+myCar1.speed);



        System.out.println("myCar2을 소개합니다.");
        System.out.println("제조사 : " +myCar2.company);
        System.out.println("모델 : "+myCar2.model);
        System.out.println("색상 : "+myCar2.color);

        Car myCar3 = new Car("기아","투싼","blue",220,100);
        System.out.println("myCar3을 소개합니다.");
        System.out.println("제조사 : " +myCar3.company);
        System.out.println("모델 : "+myCar3.model);
        System.out.println("색상 : "+myCar3.color);
        System.out.println("최고속도 : "+myCar3.maxSpeed);
        System.out.println("현재속도 : "+myCar3.speed);
    }
}
