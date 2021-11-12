package chap01;
import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("정수를 입력하면 양수인지 음수인지 판단");
        int x = num.nextInt();

        if(x > 0)
            System.out.println(x+"는 양수다.");
        else if (x < 0)
            System.out.println(x+"는 음수다.");
        else
            System.out.println(x+"는 0이다.");
    }
}
