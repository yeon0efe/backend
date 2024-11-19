package 연습;

import java.util.Arrays;

public class Arrays_toString {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};
        System.out.println(num);

        // 결과값 : [I@4eec7777
        // 배열 객체의 타입과 메모리 주소를 출력한다.
        // [I: 배열의 타입이 int 배열임을 나타냄
        // @뒤: 배열 객체가 메모리에 저장된 주소값(해시코드) 표시
        // 해당 결과값은 배열이 존재하는 위치(주소)

        System.out.println(num[3]);
        // 결과값 : 40
        // 배열 num의 인덱스 3에 해당하는 요소 출력

        System.out.println(Arrays.toString(num));
        // 결과값 : [10, 20, 30, 40, 50]
        // Arrays.toString()은 배열의 모든 요소를 사람이 읽기 쉽게 문자열 형식으로 변환해 출력한다.
        // 배열의 데이터가 [요소1, 요소2, ...] 형식으로 표현된다.
    }
}
