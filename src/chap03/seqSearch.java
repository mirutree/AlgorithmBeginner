package chap03;

import java.util.Scanner;

public class seqSearch {
    // 선형검색
    // 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i==n)
                return -1; // 검색 실패하면 리턴 -1
            if (a[i] == key)
                return i; // 검색 성공하면 리턴 i(index)
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("몇개의 요소를 추가하겠습니까?：");
        int num = stdIn.nextInt();
        int[] x = new int[num];		// 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값：");		// 키 값을 입력
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);	// 배열x에서 키 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}
