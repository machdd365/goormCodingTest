package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle {
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int bottom = sc.nextInt();
//        int high = sc.nextInt();
//        double answer = ((double) bottom * high)/2;
//
//        System.out.println(answer);
//
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] inputArr = input.split(" ");
        int bottom = Integer.parseInt(inputArr[0]);
        int high = Integer.parseInt(inputArr[1]);

        double answer = ((double) bottom * high)/2;

        System.out.println(answer);
    }
}
