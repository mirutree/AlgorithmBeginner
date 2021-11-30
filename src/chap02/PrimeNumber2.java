package chap02;

public class PrimeNumber2 {
    // 소수 판단 ver2
    // 1000이하 소수를 열거
    public static void main(String[] args) {
        int counter = 0;    // 나눗셈 횟수
        int ptr = 0;        // (찾은) 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[ptr++] = 2; // 2는 소수

        for (int n = 3; n <= 1000; n += 2) { // 홀수만 (짝수는 무조건 나누어 떨어지므로)
            int i;
            for (i=0; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0) // 나누어서 떨어짐 (나머지0) 소수가 아님
                    break;
            }
            if (ptr == i)         // 나눠서 떨어지지 않음(소수)
                prime[ptr++] = n; // 배열에 저장
        }

        for (int i =0; i < ptr; i++)
            System.out.println("찾은 소수 : " +prime[i]);

        System.out.println("나눗셈을 수행한 횟수? " +counter);
    }
}
