package a1118;

import java.util.Scanner;

public class Marray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int [3][3];
        for(int i = 0; i < scores.length;i++){
            System.out.printf("학생%d의 국어,영어,수학 점수를 입력하세요 : " , i+1);
            for(int j=0; j < scores[i].length;j++){
                scores[i][j] = sc.nextInt();
            }
        }

        //각학생의 총점과 평균 계산
        for(int i = 0;  i < scores.length;i++){
            int sum = 0;
            for(int j =0; j < scores[i].length; j++){
                sum = sum + scores[i][j];
            }
           double avg = (double) sum / scores[i].length;
           System.out.printf("학생%d의 총점, %d, 평균: %.2f\n",i+1, sum, avg);
        }
        // 전체 학생의 총점과 평균 계산
        int totalSum = 0;  // 전체 총점
        int totalSubjects = 0;  // 전체 과목 수

        // 전체 학생의 총점 계산
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                totalSum += scores[i][j];  // 전체 점수 합산
            }
            totalSubjects += scores[i].length;  // 전체 과목 수
        }

        // 전체 평균 계산
        double totalAvg = (double) totalSum / totalSubjects;  // 전체 평균

        System.out.printf("전체 학생의 총점: %d, 평균: %.2f\n", totalSum, totalAvg);  // 전체 총점과 평균 출력
    }
}