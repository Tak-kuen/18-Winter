package p620;

public class TryCatchTest {
	public static void main(String[] args) {
		
		int[] array = new int[8];
		
		for(int i=0; i<8 ; i++) {
			array[i]=0;
			System.out.println(array[i]);
		}
		
		try {
			int result = array[12];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� �߸��ƽ��ϴ�");
		}
		System.out.println("�� ������ ����ɱ��");
	}
}
