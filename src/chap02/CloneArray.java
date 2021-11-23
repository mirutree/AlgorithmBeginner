package chap02;

public class CloneArray {
    public static void main(String[] args) {
        // 배열 복제
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = a.clone();
        b[3] = 0;
        b[5] = 0; // 일부 요소에 0을 넣는다

        System.out.print("a =");
        for (int i=0; i < a.length; i++)
            System.out.print(" " +a[i]);
        // a = 1 2 3 4 5 6 7 8 9 10

        System.out.print("\nb ="); // \n은 줄바꿈
        for (int i=0; i < b.length; i++)
            System.out.print(" " +b[i]);
        // b = 1 2 3 0 5 0 7 8 9 10 <- 바꾼 요소에 0이 들어감
        // 배열 b는 배열 a 자체가 아닌 복제이기 때문

    }
}
