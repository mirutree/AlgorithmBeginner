package chap02;

import java.util.Scanner;

public class CardConvRev {
    /* 기수변환

     */

    // 입력받은 10진수를 2진수 ~ 36진수호 기수변환하기
    // 정수값 x를 r진수로 변환하여 배열 d에 넣고 자릿수 반환
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0; // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // str.charAt(0); 첫번째 문자
        // str.charAt(3); 네번째 문자
        do {
            d[digits++] = dchar.charAt(x % r); // x를 r로 나눈 나머지
            x /= r;
        } while (x != 0);
        return digits;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.print("10진수 기수변환.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환하겠습니까? (2~36) : ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = dno -1; i >=0; i--)
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("한번 더 하시겠습니까? (1.예 / 0.아니오) : ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
