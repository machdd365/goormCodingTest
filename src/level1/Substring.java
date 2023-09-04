package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Substring {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        String[] num = input2.split(" ");
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[1]);

        char[] sArr = input.toCharArray();

        for (int i = 0 ; i < num2 ; i++){
            System.out.print(sArr[num1 + i -1]);
        }
    }
}
