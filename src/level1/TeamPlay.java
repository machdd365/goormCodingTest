package level1;

import java.util.Scanner;

public class TeamPlay {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();

        int answer = 0; //최대 인원수를 계산하여 저장해보세요.


        if (p < (Math.abs(x-y))){
            answer = Math.toIntExact(Math.min(x,y) + p)*2; // 최소pc + 노트북 < 최대pc 일 때
        } else {
            answer = (Math.abs(x - y) + p) / 2; // 노트북으로 플레이 가능하게 된 사람
            answer = (answer + Math.min(x, y)) * 2; // 전체 플레이어
        }

        System.out.println(answer);
    }
}
