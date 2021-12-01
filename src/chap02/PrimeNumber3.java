package chap02;

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for ( int n = 5; n <= 1000; n += 2) {
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if ( n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[ptr++] = n; // 소수면 배열 prime에 저장
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++) // 소수 출력
            System.out.println("소수 : " + prime[i]);

        System.out.println("곱셈과 나눗셈을 수행한 횟수：" + counter);
    }
}
