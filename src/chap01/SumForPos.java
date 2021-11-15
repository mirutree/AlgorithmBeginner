package chap01;

import java.util.Scanner;

// 1부터 n까지의 합을 구하기 (양수만)
public class SumForPos {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합 구하기");

        // do문 while(제어식)
        // do문은 루프 본문을 한번 실행 후 계속반복할 것인지 사후판단하는 반복문
        do {
            System.out.println("n의 값을 입력하세요.");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0; // 합

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println("1부터 " +n+ "까지의 합은 " +sum );

    }
}
