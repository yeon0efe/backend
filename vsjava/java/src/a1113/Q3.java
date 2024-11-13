package a1113;

public class Q3 {
    public static void main(String[] args) {
        var i=1;
        var sum = 0;
        for(i=1;i<=100;i++){
            sum = sum + i;  // sum +=1;과 같다.
        }
        System.out.println("1부터 100까지의 합은 "+sum+" 입니다.");
    }
}
