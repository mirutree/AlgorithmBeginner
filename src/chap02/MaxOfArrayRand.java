package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    // 난수를 사용해 배열의 요솟값 설정
    // 배열의 요소에 값을 하나씩 입력하는 것이 아닌 각 요소에 난수를 대입한다.

    static int maxOf(int[] a) {
        int max = a[0];
        for (int i=0; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random(); // 랜덤 클래스형의 변수(rand)를 만들기 위한 선언
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최대값 구하기");
        System.out.print("사람 수 : ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        System.out.println("키 값들");
        for (int i=0; i < num; i++) {
            height[i] = 100 + rand.nextInt(100); // 요소값을 난수로 설정
            /*
            nextInt(n)이 반환하는 것은 0부터 n-1까지의 난수이다.
            nextInt(100) <- 0부터 99까지의 난수가 생성된다.
            100 + (0~99) 의 값을 랜덤으로 구하기 때문에 키의 값은 100에서 199 사이의 숫자가 나온다
             */
            System.out.println("height[" +i+ "] : " + height[i]);
        }

        System.out.println("가장 큰 키는 " +maxOf(height)+ "cm");
    }
}
