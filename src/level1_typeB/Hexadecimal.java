package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hexadecimal {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        System.out.println(Integer.toHexString(num));
    }
}
