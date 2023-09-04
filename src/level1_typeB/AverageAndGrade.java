package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class AverageAndGrade {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // score에 성적 담기
        String[] inputArr = input.split(" ");
        int[] score = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++){
            score[i] = Integer.parseInt(inputArr[i]);
        }

        // 평균 구하기
        double average = 0;
        for (int i = 0; i < score.length; i++){
            average += score[i];
        }
        average /= score.length;
        average = (double) Math.round(average * 100) /100;
        String scoreString = String.format("%.2f", average);

        //등급 구하기
        char grade;
        if (average >= 90){
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        //출력
        System.out.print(scoreString + " ");
        System.out.print(grade);

    }
}
