package level1;

import java.util.Scanner;

public class figure {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {   //프로그램의 시작부
        //첫 번째 점 P의 좌표
        int px = scanner.nextInt();
        int py = scanner.nextInt();
        //두 번째 점 Q의 좌표
        int qx = scanner.nextInt();
        int qy = scanner.nextInt();

        String answer;

        if (px == qx && py == qy){
            answer = "DOT";
        } else if( px == qx || py == qy){
            answer = "SEGMENT";
        } else if (Math.abs(px - qx) == Math.abs(py - qy)) {
            answer = "SQUARE";
        } else {
            answer = "RECTANGLE";
        }

        System.out.println(answer);

    }
}
