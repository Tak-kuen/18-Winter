package p419;

interface MyInterFace {
	static void print(String msg) {
		System.out.println(msg + " : �������̽��� ���� �޼ҵ带 ȣ���߽��ϴ�.");
	}
}

public class StaticMethodTest {
	public static void main(String[] args) {
		MyInterFace.print("Java 8");
	}
}
