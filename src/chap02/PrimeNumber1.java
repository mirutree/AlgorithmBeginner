package chap02;

public class PrimeNumber1 {
    /* 100 이하 소수를 모두 나열하기
    소수란?
     - 1과 자신 이외의 자연수로는 나눌 수 없는, '1보다 큰' 자연수
     */
    public static void main(String[] args) {
        int counter = 0;     // 나눗셈 횟수

        for (int n = 2; n <= 100; n++) { // n이 2부터 100이 될 때까지 반복
            int i;
            for ( i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) // n에서 i을 나눈 나머지가 0 (소수아님)
                    break;
            }
            if ( n == i ) // 나누어서 떨어지지 않음 (소수)
                System.out.println(n + "은(는) 소수이다.");
        }
        System.out.println("나눗셈을 수행한 횟수는? " +counter);
    }
}
