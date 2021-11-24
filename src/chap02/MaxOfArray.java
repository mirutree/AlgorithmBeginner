package chap02;

import java.util.Scanner;

public class MaxOfArray {
    // 배열 요소의 최대값 구하기
    static int maxOf(int[] a) {
        int max = a[0]; // max세팅

        for (int i=0; i < a.length; i++) // 배열a의 길이만큼 반복
            if (a[i] > max)
                max = a[i];
        return max;    // 가장 큰 수가 있는 위치
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최대값 구하기");
        System.out.print("사람수 : ");
        int num = stdIn.nextInt(); // 배열의 요소수 입력 (사람 수)

        int[] height = new int[num]; // 사람 수만큼 height라는 배열 선언

        for (int i=0; i < num; i++) { // 사람 수만큼 height[i]값을 받는다.
            System.out.print("height[" +i+ "] : ");
            height[i] = stdIn.nextInt();
        }

        System.out.println("입력받는 키 중에서 가장 큰 키는 " +maxOf(height)+ "cm 입니다.");


    }
}
