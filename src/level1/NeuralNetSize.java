package level1;

import java.util.Scanner;

public class NeuralNetSize {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] layers = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            layers[i] = scanner.nextInt();
        }

        int answer = 0;

        for (int i = 0; i < n-1 ; i++){
            answer += layers[i]* layers[i+1];
        }






        System.out.println(answer);
    }
}
