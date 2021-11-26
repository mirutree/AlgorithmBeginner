package chap02;

import java.util.Scanner;

// 배열 요소를 역순으로 정렬
public class ReverseArray {

    // 배열요소 a[index1]과 a[index2]의 값을 바꾸기
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];   // t에 idx1값을 넣음
        a[idx1] = a[idx2]; // idx1에는 idx2값을 넣음
        a[idx2] = t;       // idx2에는 t값을 넣음
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i=0; i < a.length / 2; i++) // 0부터 배열 절반이 될때까지 반복
            swap(a, i, a.length - i - 1); // a[i]랑 a[length-i-1]위치 바꿈
    }
    // a배열이 length가 7이면
    // a[0]과 (7-0-1=6) a[6]을 바꾸고 (가장 끝과 끝)
    // a[1]과 (7-1-1=5) a[5]를 바꾸고 (두번째 끝과 끝)
    // a[2]와 (7-2-1=4) a[4]를 바꾸고 (세번쨰 끝과 끝)
    // a[3]과 (7-3-1=3) a[3]을 바꿈. (값이 변하지 않음)
    // 그러면 순서만 바뀐 배열이 만들어진다.

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 요소의 수 : ");
        int num = stdIn.nextShort();

        int[] x = new int[num];

        for(int i=0; i<num; i++) { // 배열 값 입력받아서 생성
            System.out.print("x[" +i+ "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x); // 배열 역순 정렬

        System.out.println("배열을 역순으로 정렬했습니다.");
        for (int i=0; i<num; i++)
            System.out.println("x[" +i+ "] : " + x[i]);

    }
}
