package 연습.음악플레이어;

import java.sql.SQLOutput;

public class ValueDataMain{
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
//        valueData.value++;
//        System.out.println("숫자 증가 value=" + valueData.value);

        add(valueData);
        System.out.println("최종 숫자 = "+ valueData.value);

    }
    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }
}

