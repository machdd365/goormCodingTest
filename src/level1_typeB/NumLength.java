package level1_typeB;

import java.util.Scanner;

public class NumLength {
    public static int intLength(long decimal){
        int length = 0;

        if(decimal < 0){
            length++;
        }

        length += (int) Math.log10(Math.abs(decimal));
        length++;

//        for (int i = 0; i <= Math.log10(Math.abs(decimal)); i++){
//            if (Math.abs(decimal)/Math.pow(10,i) > 0){
//
//            }
//            length++;
//        }

        return length;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(intLength(num));
    }
}
