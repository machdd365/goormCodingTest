package level1;

import java.util.Arrays;
import java.util.Scanner;

public class JudgAttacked {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {   //프로그램의 시작부

        int cx, cy;//스킬을 사용하는 캐릭터의 좌표
        int r;			//스킬의 사정거리를 나타내는 최대 반지름
        int[] ex = new int[5]; //적 들의 x 좌표
        int[] ey = new int[5]; //적 들의 y 좌표

        cx = scanner.nextInt();
        cy = scanner.nextInt();
        r = scanner.nextInt();
        for(int i = 0 ; i < 5;  i ++){
            ex[i] = scanner.nextInt();
            ey[i] = scanner.nextInt();
        }

        double[] er = new double[5];
        for (int i = 0 ; i < er.length ; i++){
            er[i] = Math.sqrt(Math.pow((double) cx - (double) ex[i], 2) + Math.pow((double) cy - (double) ey[i],2));
        }

        double ermin = Arrays.stream(er).min().getAsDouble();
        int target = -1;

        for (int i = 0; i< er.length; i++){
            if (er[i]==ermin && ermin <= r){
                target = i+1;
            }
        }

        System.out.println(target);


//        int target = 0; //이 변수에 정답을 저장한다
//
//        for (int i = 1; i < er.length; i++){
//            if(er[i] < er[i-1]){
//                target = i;
//            }
//        }
//
//        if (r < er[target]){
//            target = -2;
//        }
//
//        System.out.println(target+1);
    }
}
