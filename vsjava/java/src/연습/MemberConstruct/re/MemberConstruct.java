package 연습.MemberConstruct.re;

public class MemberConstruct {

    String name;
    int age;
    int grade;


    MemberConstruct(String name, int age){
//       this.name = name;
//       this.age = age;
//       this.grade = 30;
//        System.out.println("이름 :"+name + ", 나이 :" + age + ", 성적 :" + grade);

        // 중복된 내용이 많다.
        // 생성자 안에서도 생성자 호출 가능
        // 매개값으로 받은 것을 그대로 생성자 호출하며 넣어주기

        this(name,age,30);

        // this 는 생성자 코드 첫줄에서 작성할 수 있다.(첫줄에서만!!!)
        // 다른 줄에 작성하면 컴파일오류
    }
    MemberConstruct(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
//        System.out.println("이름 :"+name + ", 나이 :" + age + ", 성적 :" + grade);
    }
}
