package p154;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] s = new int[10];
		
		for(int i=0 ; i<s.length;i++) {
			s[i]=(int)(Math.random()*100);
			System.out.printf("%d ",s[i]);
		}
	}
}
