package chap01;
import java.util.Scanner;

// 1 + 2 + 3 + 4 ... + n의 합 구하기
public class SumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1부터 n까지의 합 구하기");
        System.out.println("n의 값을 입력 하세요.");
        int n = input.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {  // i가 n과 같아질 때까지 반복
            sum += i;     // sum과 i를 더하기
            i++;          // i를 1씩 증가
        }
        System.out.println("1부터 " +n+ "까지의 합은?");
        System.out.println(sum+ "이다.");
    }
}
