package 연습.MemberConstruct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        //객체를 만들때 생성자를 자동으로(즉시) 호출하기 때문에 매개변수로 값을 전달해야 한다.
        MemberConstruct member2 = new MemberConstruct("user2",40,95);

        MemberConstruct[] members = {member1, member2};
        // MeberConstruct 타입의 객체를 담는 배열 members -> MemberConstruct[] members


        //  MemberConstruct[] member가 아니라 MemberConstruct인 이유
        //  for-each 문은 배열의 요소를 하나씩 꺼내서 처리하는 것이기 때문에 조건식에는
        //  배열 타입이 아닌 배열의 각 요소 타입을 지정해야 한다.

        // MemberConstruct[]는 members는 배열의 타입이고,
        // member는 배열의 요소, 즉 각각의 MemberConstruct 객체를 하나씩 가리키게 된다.
        // 그래서 for-each 문에서는 배열의 타입이 아닌 배열 요소의 타입을 명시해야 한다.
        for (MemberConstruct member : members){
            System.out.println("이름 = " + member.name + ", 나이 = "+ member.age + ", 성적 = " + member.grade );

        }
    }
}
