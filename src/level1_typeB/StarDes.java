package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StarDes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int num = Integer.parseInt(input);

        for (int i = num; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
