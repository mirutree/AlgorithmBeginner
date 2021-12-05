package chap02;

public class ArraySumForIn {
    // 배열의 모든 요소의 합
    public static void main(String[] args) {
        double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };

        for (int i = 0; i < a.length; i++)  // 배열요소
            System.out.println("a[" + i + "] = " + a[i]);

        double sum = 0;		// 합계

        // 확장 for문
        // : ~안에있는
        for (double i : a)
            sum += i;

        System.out.println("모든 요소의 합은? " + sum);
    }

}
