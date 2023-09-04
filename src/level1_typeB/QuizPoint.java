package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuizPoint {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] inputArr = input.toCharArray();
        int point = 0;

        for (int i = 0, j = 1; i < inputArr.length; i++) {
            if (inputArr[i] == 'O'){
                point += j;
                j++;
            }else {
                j = 1;
            }
        }

        System.out.println(point);
    }
}
