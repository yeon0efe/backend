package 연습.MemberConstruct.re;

public class ConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("jyp",28,50);
        MemberConstruct member2 = new MemberConstruct("mkh",30);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct m : members){
            System.out.println("이름 :"+m.name + ", 나이 :" + m.age + ", 성적 :" + m.grade);
        }
    }

}
