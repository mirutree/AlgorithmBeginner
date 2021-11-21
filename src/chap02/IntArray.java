package chap02;

public class IntArray {
    public static void main(String[] args) {

        int[] a = new int[5]; //배열 선언
        a[0] = 4;
        a[1] = a[0] + 10;   // 4 + 10 = 14
        a[2] = 34;
        a[3] = 57;
        a[4] = a[1] * 2;    // 14 * 2 = 28

        for (int i=0; i < a.length; i++) {
            System.out.println("a[" +i+ "] = " +a[i]);
        }
    }
}
