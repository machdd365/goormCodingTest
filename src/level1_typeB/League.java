package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class League {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int num = Integer.parseInt(input);
        int answer = num*(num-1)/2;

        System.out.println(answer);
    }
}
