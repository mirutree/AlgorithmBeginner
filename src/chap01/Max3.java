package chap01;
// 3개의 정수 중 최대값 구하기
class Max3m {
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("[3,2,1]중 가장 큰 수는? " + max3(3, 2, 1));
        System.out.println("[1,2,5]중 가장 큰 수는? " + max3(1, 2, 5));
        System.out.println("[7,-1,9]중 가장 큰 수는? " + max3(7, -1, 9));
    }
}
