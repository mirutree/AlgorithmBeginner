package chap01;
import java.util.Scanner;

// 1 + 2 + 3 + 4 ... + n의 합 구하기
public class SumFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("n의 값을 입력 하세요.");

        int n = stdIn.nextInt();
        int sum = 0; // 합

        // i가 1부터 시작해서 n과 같아질 때 까지 1씩 추가되어 반복
        for (int i = 1; i <= n; i++)
            sum += i; // sum에 i를 더하기

        System.out.println("1부터 " +n+ "까지의 합은 " +sum );

    }
}
