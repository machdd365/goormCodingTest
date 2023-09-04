package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumSquare {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int num = Integer.parseInt(input);
        int[][] square = new int[num][num];

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                square[i][j] = j + 1 + i * num;
            }
        }

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                System.out.print(square[j][i] + " ");
            }
            System.out.println();;
        }

    }
}
