package p142;

public class ContinueTest {

	public static void main(String[] args) {
		String s="No news is good news";
		int count = 0;
		String s2=s.toUpperCase();
		
		for(int i=0; i<s.length();i++) {
			if(s2.charAt(i) != 'N')
				continue;
			
			count++;
		}
		
		System.out.printf("���忡�� �߰ߵ� n�� ������ %d���Դϴ�.",count);
	}

}
