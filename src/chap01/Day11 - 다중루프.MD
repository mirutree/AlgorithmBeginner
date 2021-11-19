### 다중 루프
반복 프로그램은 반복 안에서 다시 반복할 수도 있다.    
루프가 중첩되는 수준에 따라 '이중루프, 삼중루프'라고 한다.
    
```java
package chap01;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println("곱셈표");

        for (int i=1; i <= 9; i++) {
            for (int j=1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println(); // 줄바꿈
        }
    }
}
```
printf로 형식회된 출력을 할 수 있다.   
- 출력구조 `%[-][0][n][.m]지시자`
- 지시자를 제외한 나머지는 생략가능 ( ex. %d)   
   
|지시자|설명||
|--|--------|--------|
|%n|줄바꿈||
|%s|String 형식으로 출력|%S는 대문자로 출력|
|%d|integer 형식으로 출력||
|%f|float 형식으로 출력||
|%t|date, time 형식으로 출력||
|%o|8진수 integer 형식으로 출력||
|%x|16진수 integer 형식으로 출력||
|%b|boolean 형식으로 출력|%B는 대문자로 출력|
|%e|지수 형식으로 출력||

%10S처럼 가운데 숫자를 입력하면 입력한 숫자만큼 공간할당.   
숫자가 양수면 오른쪽 정렬. 음수면 왼쪽 정렬.   


