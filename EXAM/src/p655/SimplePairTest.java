package p655;

public class SimplePairTest {
	public static void main(String[] args) {
		SimplePair<Double> pair = new SimplePair<Double>(new Double(10.124124),28.1);
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
	}
}
