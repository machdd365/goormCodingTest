package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharCounter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        char[] s1 = input1.toCharArray();
        char[] s2 = input2.toCharArray();
        char c = s2[0];
        int answer = 0;

        for (int i = 0 ; i < s1.length; i++){
            if (s1[i] == c){
                answer++;
            }
        }

        System.out.println(answer);
    }
}
