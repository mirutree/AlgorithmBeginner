package chap01;

import java.util.Scanner;

// 가우스 공식을 이용한 1부터 n까지의 합
public class SumGauss {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("n의 값을 입력하세요");
        int n = num.nextInt();

        /* 가우스 법칙
        1+2+3+....+100을 구할 때
        1+100 = 101
        2+99 = 101
        3+98 = 101
        ...
        101이 50묶음 이라는 법칙
         */

        int sum = (n+1) * (n/2) + ( n%2 == 1 ? (n+1)/2 : 0 );
        int sum2 = (n%2 == 1 ? (n+1)/2 : 0);

        // n+1과 n을 2로 나눈 값을 곱한다 (짝수일경우)
        // n을 2로 나누었을때 나머지가 있다면 (홀수일경우) 그걸 더한다

        System.out.println("1부터 " +n+ "까지의 합은 " +sum);
        System.out.println("남은 홀수의 값은?(없으면0) " +sum2);
    }
}
