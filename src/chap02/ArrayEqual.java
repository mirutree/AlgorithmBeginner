package chap02;

import java.util.Scanner;

public class ArrayEqual {

    // 배열 a,b의 모든 요소를 비교하여 완전히 같은 배열인지 판단
    static boolean equals(int[] a, int[] b) {
        // 두 배열이 length가 다르면 false
        if (a.length != b.length)
            return false;

        // 배열 길이만큼 두 배열의 요소를 비교하여 다르면 false
        for (int i=0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        // 위 두 조건을 통과하면 true
        return true;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int aaa = stdIn.nextInt();

        int[] a = new int[aaa]; // 입력받은 요솟수를 가진 배열 a

        for (int i=0; i < aaa; i++) {
            System.out.print("a[" +i+ "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int bbb = stdIn.nextInt();

        int[] b = new int[bbb]; // 입력받은 요솟수를 가진 배열 b

        for (int i=0; i < bbb; i++) {
            System.out.print("b[" +i+ "] : ");
            b[i] = stdIn.nextInt();
        }

        // true면 '같다' false면 '같지 않다'
        System.out.println("배열 a와 b는" + (equals(a, b) ? "같다" : "같지 않다"));

    }
}
