package chap01;

import java.util.Scanner;

public class SumOf {
    // 정수 a와 b를 포함해서 그 사이의 모든 정수의 합
    static int sumOf(int a, int b) {
        int min; // a, b 중에서 작은값
        int max; // a, b 중에서 큰값

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        int sum = 0; // 합
        for (int i = min; i <= max; i++) // min부터 시작해서 max가 될때까지 반복
            sum += i; // 1씩 높아진 값을 더함
        return (sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("a의 값은?");
        int a = input.nextInt();
        System.out.println("b의 값은?");
        int b = input.nextInt();

        System.out.println("a부터 b사이의 모든 정수의 합은? "
            + sumOf(a, b));
    }
}
