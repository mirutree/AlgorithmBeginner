package chap03;

import java.util.Scanner;
// 이진 검색
public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        int pl = 0;         // 검색 범위위 첫번째 인덱스
        int pr = n - 1;     // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2;     // 중앙 요소의 인덱스
            if (a[pc] == key)
                return pc; // 검색성공 : key값이 위치한 인덱스를 반환한다.
            else if (a[pc] < key)    // 찾는 값이 중앙요소보다 크다 (뒤에 위치한다)
                pl = pc + 1;         // pl(첫번째 인덱스)을 중앙요소 다음으로 재정의 (검색범위 좁힘)
            else // 찾는 값이 중앙요소보다 작음 (앞에 위치)
                pr = pc - 1;         // pr(맨 끝 인덱스)을 중앙요소 이전으로 재정의 (검색범위 좁힘)
        } while (pl <= pr);          // pl(첫번째 인덱스)가 pr(맨 끝 인덱스)보다 작거나 같은 동안 계속 반복한다.

        return -1;     // 검색실패 : do while문을 돌 동안 못찾았다면 -1을 반환한다.
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];      // 요소수가 num개인 배열 x를 생성한다

        System.out.println("오름차순으로 입력");
        System.out.print("x[0] : "); // 첫 요소를 입력받는다.
        x[0] = stdIn.nextInt();

        /*
            이진 검색은 배열이 정렬되어 있다는 조건을 전제로 해야하기 때문에
            값을 입력받을 때 오름차순이 아니면 다시 입력받도록 해야한다 (정렬은 진도상 아직 나오기 전이므로 현재는 이렇게 입력받기)
         */
        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" +i+ "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i-1]); // 입력한 값이 이전 입력값(이전 인덱스)값보다 작으면 다시 입력받는다
        }

        System.out.println("배열에서 어떤 값을 검색하시겠습니까?");
        int ky = stdIn.nextInt(); // key값을 입력받는다.

        int idx = binSearch(x, num, ky); // 요소수가 num인 배열x에서 key값이 ky인요소를 검색하여 요소위치를 반환받는다.

        if (idx == -1) // -1은 검색 실패
            System.out.println("검색한 요소가 존재하지 않습니다");
        else
            System.out.println(ky+ "의 위치는 : a[" +idx+ "]에 있다.");
    }
}
