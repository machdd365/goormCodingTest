package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        int length = Integer.parseInt(input1);

        //input2를 숫자 어레이로 분리
        int[] arr = new int[length];
        for (int i = 0 ; i< length; i++){
            String[] s = input2.split(" ");
            arr[i] = Integer.parseInt(s[i]);
        }

        //버블소트
        int num;
        length--;
        Loop1 : for (int i = 0;true; i++){
            // 인자 2개를 sort
            if (arr[i%length] > arr[i%length +1]) {
                num = arr[i % length];
                arr[i % length] = arr[i % length + 1];
                arr[i % length + 1] = num;
            }

            //sort가 완료되었는지 검증하는 for문
            for (int j = 0, k = 0; j < length; j++){
                if (arr[j] < arr[j+1]){
                    k += 1;
                }
                if (k >= length){
                    break Loop1;
                }
            }

        }
        //출력
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
