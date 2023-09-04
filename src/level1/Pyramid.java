package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pyramid {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int i;
        int j;
        int k;
        int num = Integer.parseInt(input);

        for (i = 0 ; i < num; i++){
            for (k = 0 ; k < num - i-1; k++){
                System.out.print(" ");
            }
            for (j = 0 ; j< i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
