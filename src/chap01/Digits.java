package chap01;

import java.util.Scanner;
/*
 - 구조적 프로그래밍
 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법.
 순차, 선택, 반복이라는 3종류의 제어 흐름을 사용
*/
public class Digits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.print("입력：");
            no = stdIn.nextInt();
        } while (no < 10 || no > 99); // no가 10보다 크고 99보다 작을 때까지 본문을 반복한다.
        /*
        논리곱 && 둘다 참이어야 true
        논리합 || 둘 중 하나라도 참이면 true

        드모르간 법칙
         - 논리 부정 연산자 !를 사용함
         - !는 피연산자가 true면 false를, false면 true를 반환한다.
        (no < 10 || no > 99) 와 !(no >= 10 && no <= 99) 두 식은 같다.
         */

        System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
    }
}
