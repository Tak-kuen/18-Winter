package p217;

public class MathTest {

	public static void main(String[] args) {

		int sum;
		Math obj = new Math();
		sum = obj.add(2, 3);
		System.out.println("2와 3의 합은 " + sum);
		
		sum = obj.sub(2, 3);
		System.out.println("2와 3의 차는 " + sum);
		sum = obj.mul(2, 3);
		System.out.println("2와 3의 곱은 " + sum);
		sum = obj.div(2, 3);
		System.out.println("2와 3의 몫은 " + sum);
		
		sum = obj.add(8, 7);
		System.out.println("8과 7의 합은 " + sum);
	}

}
