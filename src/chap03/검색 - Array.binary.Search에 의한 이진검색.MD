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
    1) static int binarySearc(byte[] a, byte key)
    2) static int binarySearc(char[] a, char key)
    3) static int binarySearc(double[] a, double key)
    4) static int binarySearc(float[] a, float key)
    5) static int binarySearc(int[] a, int key)
    6) static int binarySearc(long[] a, long key)
    7) static int binarySearc(short[] a, short key)
    8) static int binarySearc(Object[] a, Object key)
    9) static <T>int binarySearc(T[] a, T key, Comparator <? super T>c)
   
   
#### 검색에 성공한 경우
 - key와 일치하는 요소의 인덱스를 반환.    
 - 일치하는 요소가 여러 개 있다면 무작위의 인덱스 반환.

#### 검색에 실패한 경우
 - 변환값은 삽입 포인트를 x라고 할 때 -x -1을 반환한다.
 - 삽입 포인트란? 
    - 검색하기 위해 지정한 key보다 큰 요소 중 첫번째 요소의 인덱스
 - 배열의 모든 요소가 key보다 작다면 배열의 길이를 삽입 포인트로 정한다.
