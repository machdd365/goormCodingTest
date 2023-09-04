package level1_typeB;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        String[] sArr = new String[10];
        for(int i = 0 ; i < 10; i++){
            sArr[i] = scanner.nextLine();
        } //입력받은 10개의 단어를 sArr 어레이로
        for(int i = 0 ; i < 10; i++)
        {
            testcase(sArr[i]);
        }
    }

    public static void testcase(String s) {
        char[] wordArr = s.toCharArray();
        char[] reverseWordArr = new char[wordArr.length];
        // 반전문자열에 문자열 반전 대입
        for (int i = 0 ; i < wordArr.length; i++){
            reverseWordArr[i] = wordArr[wordArr.length-i-1];
        }

        //출력
        if (Arrays.equals(reverseWordArr, wordArr)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
