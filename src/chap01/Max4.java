package chap01;

public class Max4 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if ( b > max )
            max = b;
        if ( c > max)
            max = c;
        if ( d > max )
            max = d;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("1 2 3 4 중 max는? " + max4(1,2,3,4));
        System.out.println("2 4 6 8 중 max는? " + max4(2,4,6,8));
        System.out.println("4 -10 7 -34 중 max는? " + max4(4,-10,7,-34));
    }
}
