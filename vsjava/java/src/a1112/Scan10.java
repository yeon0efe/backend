package a1112;
import java.util.Scanner;
public class Scan10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String w1 = scan.nextLine();

        System.out.println("사용자가 입력한 단어: " + w1);
    }
}
