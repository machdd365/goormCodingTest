package level1;

import java.util.Arrays;
import java.util.Scanner;

public class QuadCore {


    //표준입력을 수행할 Scanner를 선언한다
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {   //프로그램의 시작부
        int[] job = new int[5];
        int answer; //이 변수에 답을 저장한다
        for(int i = 0 ; i < 5; i++){
            job[i] = scanner.nextInt();
        }

        Arrays.sort(job);

        if (job[0] + job[1] > job[4]){
            answer = job[0] + job[1];
        }else {
            answer = job[4];
        }


        //정답을 출력한다
        System.out.printf("%d\n", answer);
    }
}
