package p217;

public class MathTest {

	public static void main(String[] args) {

		int sum;
		Math obj = new Math();
		sum = obj.add(2, 3);
		System.out.println("2�� 3�� ���� " + sum);
		
		sum = obj.sub(2, 3);
		System.out.println("2�� 3�� ���� " + sum);
		sum = obj.mul(2, 3);
		System.out.println("2�� 3�� ���� " + sum);
		sum = obj.div(2, 3);
		System.out.println("2�� 3�� ���� " + sum);
		
		sum = obj.add(8, 7);
		System.out.println("8�� 7�� ���� " + sum);
	}

}
