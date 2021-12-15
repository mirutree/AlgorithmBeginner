package chap03;

import java.util.Scanner;

public class seqSearch {
    // 선형검색
    // 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            /*
                선형 검색에서 ( 맨 앞부터 순서대로 요소 검색)의 종료조건은
                1. 검색 실패하거나
                2. 검색 성공하거나 인데,
                실패하는 경우는 배열 마지막까지 가서야 없는 경우이므로 배열 크기만큼 돌아야 종료된다
                i가 0부터 시작해서 하나씩 올라가니까 n번째까지 반복했다는 것은 찾는 값이 없다(실패했다)라는 뜻
                i == n이 성립하는 경우 (종료조건 1 : 검색 실패이므로 -1를 반환)
                그만큼 반복되지 않았다면 (i++해서 i == n이 되기 전에 종료되었다면) 검색이 성공했다는 뜻이고
                a[i]에 그 키 값이 있다.
             */
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

        // 요소수를 입력받는 포문
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값：");		// 키 값을 입력
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);	// 배열x에서 키 값이 ky인 요소를 검색

        if (idx == -1) // 검색 실패
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}
