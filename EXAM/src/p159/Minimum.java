package p159;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,3,5,6,7,9,3,25,74,642,24};
		int min;
		int max;
		
		min=num[0];
		max=num[0];
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for(int i=1;i<num.length;i++) {	//i=0부터 시작할것인가 1부터 시작할것인가
			if(min>num[i]) {
				min=num[i];
			}
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.printf("최소값은 %d, 최대값은 %d 입니다.", min,max);
	}
}
