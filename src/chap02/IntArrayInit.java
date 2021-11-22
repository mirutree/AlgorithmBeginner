package chap02;

public class IntArrayInit {
    public static void main(String[] args) {
        /* 배열의 요소값을 초기화하며 배열 선언
        배열 본체는 배열 초기화(Array Initializer)를 사용하면 본체 생성과 동시에
        각 요소 초기화가 가능하다.
         */

        int[] a = {1,2,3,4,5,6,7,8,9,10}; // 배열 초기자에 의해 생성

        for(int i=0; i <a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
