package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chicken {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        int i = Integer.parseInt(input1);

        String[] input2 = new String[i];
        int[] numArr = new int[i];
        for (int j = 0; j < i; j++){
            input2[j] = br.readLine();
            numArr[j] = Integer.parseInt(input2[j]);
        }

        // 메이커 별 치킨 조각 수
        int grC = 3;
        int cmC = 7;
        String[] answer = new String[i];
        for (int j = 0; j < i; j++){
            answer[j] = "NO";
        }

        for (int j = 0; j < i; j++){
            //양이 적은 메이커로 최대 몫 구하기
            int k = (int) (numArr[j]/grC)+1;

            //식단 가능 여부 조사
            for (; k >= 0 ; k--){
                if ((numArr[j] - k*3)%cmC == 0){
                    answer[j] = "YES";
                    break;
                }
            }
        }

        // 출력
        for (int j = 1; j < i+1; j++){
            System.out.println("Test Case #" + j);
            System.out.println(answer[j-1]);
        }
    }
}
