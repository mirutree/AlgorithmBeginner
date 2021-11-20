package chap01;

import java.util.Scanner;

public class TriangleLB {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = stdIn.nextInt();
        } while (n <= 0); // n이 0보다 클때까지 반복

        for (int i = 1; i <= n; i++) { // 1부터 n까지 반복
            for (int j = 1; j <= i; j++)
                System.out.print('*'); // 별 개사룰 하나씩 늘림
            System.out.println(); // 줄바꿈
        }
    }

}
