package a1120;

import java.util.Scanner;

public class Hak1_Ex09GPT {
    public static void main(String[] args) {
        boolean run = true;

        int studentNum = 0;  // 학생수를 저장할 변수 , 현재는 0으로 초기화
        int[] scores = null; // 점수를 저장할 배열, 현재는 null로 초기화
        Scanner sc = new Scanner(System.in);

        while(run){ //run이 true일 동안 반복되는 while 루프
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.학생수 ㅣ 2.점수입력 ㅣ 3.점수리스트 ㅣ 4.분석 ㅣ 5.종료");
            System.out.println("-----------------------------------------------------------");
            System.out.print("메뉴 선택: ");
            int menu = sc.nextInt(); // 사용자가 입력한 메뉴 번호를 받아 저장

            switch(menu) {
                case 1:  // 학생 수 입력
                    System.out.print("학생 수를 입력하세요: ");
                    studentNum = sc.nextInt();
                    scores = new int[studentNum];  // 학생 수에 맞는 배열 생성
                    break;
                    //switch 블록 종료하고 나간다.
                    //swich문 종료되어도 while은 여전히 조건을 만족하므로 루프 실행

                case 2:  // 점수 입력
                    if (scores == null) {
                        System.out.println("학생 수가 설정되지 않았습니다. 먼저 학생 수를 입력하세요.");
                    } else {
                        for (int i = 0; i < studentNum; i++) {
                            System.out.print((i+1) + "번째 학생의 점수를 입력하세요: ");
                            scores[i] = sc.nextInt();
                        }
                    }
                    break;

                case 3:  // 점수 리스트 출력
                    if (scores == null) {
                        System.out.println("점수가 입력되지 않았습니다.");
                    } else {
                        System.out.println("학생들의 점수 리스트:");
                        for (int i = 0; i < studentNum; i++) {
                            System.out.println((i+1) + "번째 학생: " + scores[i] + "점");
                        }
                    }
                    break;

                case 4:  // 분석 (최고 점수, 평균 점수 출력)
                    if (scores == null) {
                        System.out.println("점수가 입력되지 않았습니다.");
                    } else {
                        int max = scores[0];  // 첫 번째 학생 점수로 초기화
                        int sum = 0;
                        for (int i = 0; i < studentNum; i++) {
                            sum += scores[i];
                            if (scores[i] > max) {
                                max = scores[i];
                            }
                        }
                        double average = (double) sum / studentNum;
                        System.out.println("최고 점수: " + max);
                        System.out.println("평균 점수: " + String.format("%.2f", average));
                    }
                    break;

                case 5:  // 종료
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;

                default:
                    System.out.println("잘못된 메뉴 번호입니다. 다시 선택해주세요.");
                    break;
            }
        }

        sc.close();
    }
}
