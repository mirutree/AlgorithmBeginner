package chap03;
import java.util.Arrays;
import java.util.Scanner;
// 문자열의 배열에서 검색

class StringBinarySearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String[] alphabet = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"
        };

        System.out.print("알파벳을 입력하세요(대문자) : ");	// 키값을 입력
        String input = stdIn.next();

        int idx = Arrays.binarySearch(alphabet, input);		// 배열 alphabet에서 값이 input인 요소를 검색

        if (idx < 0)
            System.out.println("해당 키워드가 없습니다.");
        else
            System.out.println("해당 키워드는 alphabet[" + idx + "]에 있습니다.");
    }
}
