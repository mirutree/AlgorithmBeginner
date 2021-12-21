package chap03;

// 아이디를 부여하는 클래스
class Id {
    private static int cnt = 0;
    private int id;

    // 생성자
    public Id() {
        id = ++cnt;
    }

    // 아이디를 반환하는 인스턴트 메서드
    public int getId() {
        return id;
    }

    // count를 반환하는 클래스 메서드
    public static int getCnt() {
        return cnt;
    }
}
public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();
        Id c = new Id();

        // 인스턴스 메서드  호출 시 : 클래스형 변수 이름.메서드 이름
        System.out.println("a의 아이디? " +a.getId());
        System.out.println("b의 아이디? " +b.getId());
        System.out.println("c의 아이디? " +c.getId());

        // 클래스 메서드 호출 시 : 클래스 이름.메서드 이름
        System.out.println("아이디 개수는? " +Id.getCnt());
    }
}
