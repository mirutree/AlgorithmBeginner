#### Array.binary.Search에 의한 이진검색
 - Java는 배열에서 이진 검색을 하는 메서드를 표준 라이브러리로 제공.   
 - 이진 검색 표준 라이브러리의 메서드로는 java.utill.Arrays클래스의 binarySearch메서드가 있다.   
 - binarySearch메서드의 장점   
 ```
 1. 이진 검색 메서드를 직접 코딩할 필요가 없다.
 2. 모든 자료형 배열에서 검색할 수 있다.
 ```
 - binarySearch메서드는 오름차순으로 정렬된 배열 a를 가정하고, 키값이 key인 요소를 이진 검색한다.   
 - binarySearch메서드는 자료형에 따라 9가지 방법으로 오버로딩(overloading)되어 있다. (오버로딩은 같은 메서드 이름으로 매개변수만 다르게 정의하는 방법)
    1) static int binarySearch(byte[] a, byte key)
    2) static int binarySearch(char[] a, char key)
    3) static int binarySearch(double[] a, double key)
    4) static int binarySearch(float[] a, float key)
    5) static int binarySearch(int[] a, int key)
    6) static int binarySearch(long[] a, long key)
    7) static int binarySearch(short[] a, short key)
    8) static int binarySearch(Object[] a, Object key)
    9) static <T>int binarySearch(T[] a, T key, Comparator <? super T>c)
   
   
#### 검색에 성공한 경우
 - key와 일치하는 요소의 인덱스를 반환.    
 - 일치하는 요소가 여러 개 있다면 무작위의 인덱스 반환.

#### 검색에 실패한 경우
 - 변환값은 삽입 포인트를 x라고 할 때 -x -1을 반환한다.
 - 삽입 포인트란? 
    - 검색하기 위해 지정한 key보다 큰 요소 중 첫번째 요소의 인덱스
 - 배열의 모든 요소가 key보다 작다면 배열의 길이를 삽입 포인트로 정한다.

---

#### 클래스 메서드와 인스턴스 메서드
```
Java의 메서드 종류
1. 인스턴스 메서드(비정적 메서드) - static을 붙이지 않고 선언한 메서드
2. 클래스 메서드(정적 메서드) - static을 부텨서 선언한 메서드
```
IdTester.java를 보면 클래스 생성자(public id())를 가지고 있다.   
인스턴스를 생성할 때 마다 각각의 인스턴스에 1, 2, ...의 아이디를 부여한다.   
클래스 메서드와 마찬가지로 클래스 변수도 인스턴스에 포함되지 않는 변수이다.   
또한 인스턴스의 개수와 관계없이 1개만 만들어진다.   
클래스 변수 counter를 통해 몇개의 아이디를 만들었는지 알 수 있고 아이디로 사용할 수 있다.   
인스턴스 메서드 getId는 개별 인스턴스의 아이디를 반환하고 클래스 메서드 getCounter는 마지막으로 부여한 아이디를 반환한다.   
   
```
인스턴스 메서드와 클래스 메서드 호출방식
인스턴스 메서드  호출 시 : 클래스형 변수 이름.메서드 이름
클래스 메서드 호출 시 : 클래스 이름.메서드 이름
```


---
#### 객체의 배열에서 검색하기
위에 있는 java.utill.Arrays클래스의 binarySearch메서드 중에서 8번, 9번으로 검색한다.
 - 8번) static int binarySearch(Object[] a, Object key)
    - 자연정렬이라는 방법으로 요소의 대소관계를 판단 (정수 배열, 문자열 배열에서 검색할 때 적당)
 - 9번) static <T>int binarySearch(T[] a, T key, Comparator <? super T>c)
  - 자연순서가 아닌 배열에서 검색하거나, 자연순서를 논리적으로 갖지 않는 클래스 배열에서 검색할 때 알맞다.
    
#### 자연 정렬(natural ordering)
 - binarySearch메서드에 배열과 키 값을 전달하는 간단한 방법으로 검색할 수 있는 이유?
   - Stirng 클래스가 Comparable<T> 인터페이스와 compareTo 메서드를 구현하고 있기 때문
   
|문자열 정렬|자연 정렬|
|:--:|:--:|
|텍스트1.txt|텍스트1.txt|
|텍스트10.txt|텍스트2.txt|
|텍스트100.txt|텍스트10.txt|
|텍스트2.txt|텍스트21.txt|
|텍스트21.txt|텍스트100.txt|
   
 - 둘 다 정렬이 되었지만 문자열 정렬은 *동일한 위치에 있는 문자의 대소비교*를 통해 정렬한다.
 - 본인 클래스에도 자연정렬을 하고 싶다면 다음과 같은 방법으로 클래스를 정의한다.
```java

package 패키지이름;

class A implements Comparable<A> { // Comparable<A> 인터페이스 구현
  
  public int compareTo (A c) {     // compareTo 메서드 구현
    // this가 c보다 크면 양의 값 반환
    // this가 c보다 작으면 음의 값 반환
    // this가 c와 같으면 0 반환
  }

  public boolean equals(Object c) { // equals 메서드 구현
    // this가 c와 같으면 true 반환
    // this가 c와 같지 않으면 false 반환
  }
}

```


















