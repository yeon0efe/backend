package 연습;

public class 향상된for문 {
    public static void main(String[] args) {

        String[] days = {"월요일","화요일","수요일","목요일"};
        for(String day :days){
            System.out.print(day + " ");
        }
    }
}
// "향상된 for문" 또는 "foreach문"이라고 부르는
// ebhanced for loop


// 기존의 for문보다 더 간단하게 배열이나 컬렉션의 모든 요소를 순서대로 순회하는 반복문
// 인덱스를 사용할 필요 없이 자동으로 배열의 각 요소를 순서대로 접근한다.

// (String day : days)에서 day는 배열의 각 요소를 담는 임시 변수

