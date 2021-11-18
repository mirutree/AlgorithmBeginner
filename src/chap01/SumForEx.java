package chap01;

import java.util.Scanner;
// 1부터 n까지 더한 값을 출력하면서 값만이 아닌 식도 같이 출력
public class SumForEx {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        int sum = 0; // 합

        do {
            System.out.println("양수만 입력하세요.");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) { // 1부터 n까지 반복
            if(i < n)
                System.out.print(i + " + "); // 1 +, 2 +, 3 + 4 +... 를 n전까지 반복
            else
                System.out.print(i); // n 출력
            sum += i; // sum에 i를 더함
        }
        System.out.println(" = " + sum);
        // 1 + 2 + 3 + .... n = sum <-을 출력
    }
}
