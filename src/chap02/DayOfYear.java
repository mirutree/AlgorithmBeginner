package chap02;

import java.util.Scanner;

public class DayOfYear {

    // 그 해의 경과 일수를 구하기
    // 달의 '일'수
    static int[][] mdays = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 평년
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// 윤년
    };

    // year년은 윤년인가? (평년 : 0, 윤년 : 1)
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일수를 구함
    static int dayOfYear(int y, int m, int d) {
        int days = d;						// 일 수

        for (int i = 1; i < m; i++)			// 1월~(m-1)월의 일 수를 더함
            days += mdays[isLeap(y)][i - 1];
        return days;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;							// 반복

        System.out.println("날짜를 입력하여 해당 날짜의 그 해 경과 일 수를 구하기. ");

        do {
            System.out.print("년：");  int year  = stdIn.nextInt();	// 년
            System.out.print("월：");  int month = stdIn.nextInt();	// 월
            System.out.print("일：");  int day   = stdIn.nextInt();	// 일

            System.out.printf("그 해의 %d일째입니다.\n", dayOfYear(year, month, day));

            System.out.print("한번 더 할까요? (1.예／0.아니오）：");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
