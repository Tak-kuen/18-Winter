package p126;

public class LoopExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =0;
		int sum=0;
		while (number<=10) {
			sum=sum+number;
			number++;
		}
		System.out.println("1부터 " + (number-1) +"까지의 합계 : " + sum);
	}

}
