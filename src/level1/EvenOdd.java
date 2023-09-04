package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOdd {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        String answer;

        if ( num % 2 == 0){
            answer = "even";
        }else {
            answer = "odd";
        }

        System.out.println(answer);
    }
}
