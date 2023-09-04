package level1_typeB;

import java.util.Scanner;

public class PowerSupply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int supply = 3;
        int demand = 2;

        int time=0;

        for (;Math.min(x,y) >= 0;time++){
            if (x<=y){
                x += supply;
            }else {
                y += supply;
            } // 발전기가 둘 중 저전력인 곳에 전력 공급

            x -= demand;
            y -= demand; // 1시간동안 전력 소비
        }

        System.out.println(time-2);
    }
}
