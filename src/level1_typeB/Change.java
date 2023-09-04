package level1_typeB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Change {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int price = Integer.parseInt(input); //가격
        int[] changeCoin = new int[4]; //잔돈 갯수 어레이
        int change = 1000 - price; //잔돈 총액
        int[] coin = {500,100,50,10}; //화폐 규격

        for (int i = 0 ; i < 4; i++){
            changeCoin[i] = change/coin[i]; //화폐 갯수
            change = change%coin[i]; //계산 해야할 남은 잔돈
        }

        for (int i = 0 ; i < 4; i++){
            System.out.print(changeCoin[i] + " ");
        }
    }
}
