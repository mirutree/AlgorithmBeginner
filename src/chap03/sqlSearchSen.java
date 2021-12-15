package chap03;

import java.util.Scanner;

public class sqlSearchSen {
    // 선형 검색(보초법)
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        /*
            n은 요솟수
            a배열의 마지막 요소는 a[n-1]에 담기므로
            a[n]에 요수를 하나 추가한다(보초)
            a[n]에는 검색할 값과 같은 값이 담긴다.
         */
        a[n] = key;					// 검색할 값(key)를 보초로 a[n]에 대입

        /*
            배열 요소를 순서대로 검사.
            보초문을 사용하면 if (i == n) (배열의 끝까지 가서도 키값이 나오지 않는다면)를 사용할 필요가 없다
            따라서 if문은 한개만 들어간다
         */
        while (true) {
            if (a[i] == key)		// 검색 성공!
                break;
            i++;
        }

        /*
            while문에 의한 반복이 완료되면 찾은 값이 '원래 배열의 데이터'인지 '보초'인지 판단해야 한다.
            보초는 a[n]에 추가했으므로
            i가 n이면 검색실패(보초를 찾음)니까 -1를 리턴하고
            그렇지 않은 경우에는 i위치(키값의 위치)를 반환하면 된다.
         */
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];				// 요솟수 num + 1

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값：");			// 키값을 입력
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);		// 배열x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}
