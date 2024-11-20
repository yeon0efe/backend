package a1120.class_ex;

public class Car {
    // **필드선언**
    // 클래스에서 데이터를 저장하기 위해 변수 정의하는 것
    // 클래스의 속성(특성)을 나타내며, 객체가 가지는 데이터를 저장하는 데 사용
    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;

    public Car(){};

//    public Car(String company,String model, String color,int maxSpeed,int speed){
//        this.company = company;
//        this.model=model;
//        this.color=color;
//        this.maxSpeed=maxSpeed;
//        this.speed=speed;
//    }

    public Car(String c,String m, String co,int max,int sp){
        company = c;
        model=m;
        color=co;
        maxSpeed=max;
        speed=sp;
    }
}
