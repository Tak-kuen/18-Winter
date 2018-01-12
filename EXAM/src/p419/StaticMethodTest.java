package p419;

interface MyInterFace {
	static void print(String msg) {
		System.out.println(msg + " : 인터페이스의 정적 메소드를 호출했습니다.");
	}
}

public class StaticMethodTest {
	public static void main(String[] args) {
		MyInterFace.print("Java 8");
	}
}
