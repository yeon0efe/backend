package 연습.MemberConstruct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age,int grade){
        System.out.println( "생성자 호출 name = " + name + ",age =" + age + ",gradwe = " + grade);
        this.name = name;
        this.age = age ;
        this.grade = grade;

    }
}
