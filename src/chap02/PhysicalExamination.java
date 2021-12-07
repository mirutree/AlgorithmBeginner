package chap02;
import java.util.Scanner;

// 신체검사 클래스 배열에서 '평균 키'와 '시력의 분포'를 구함
class PhsycalExamination {
    static final int VMAX = 21; // 시력분포 (0.0에서 0.1단위로 21개)

    static class PhyscData {
        String name;
        int    height; // 키
        double vision; // 시력

        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값 구하기
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++)
            sum += dat[i].height;

        return  sum / dat.length;
    }

    // 시력 분포 구하기
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++)
            // 0.0 이상 2.1이하면
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
            new PhyscData("김철수", 173, 0.3),
            new PhyscData("이철수", 188, 1.2),
            new PhyscData("박철수", 155, 0.8),
            new PhyscData("최철수", 167, 0.9),
            new PhyscData("정철수", 178, 1.5),
        };

        int[] vdist = new int[VMAX]; // 시력 분포

        System.out.println("-------------------");
        System.out.println("|  신체 검사 리스트  |");
        System.out.println("-------------------");
        System.out.println("| 이름    키    시력 |");
        System.out.println("-------------------");

        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist); // 시력 분포

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++)
            System.out.printf("%3.1f~:%2d명\n", i / 10.0, vdist[i]);
    }



}


