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
			System.out.println("배열의 인덱스가 잘못됐습니다");
		}
		System.out.println("이 문장이 실행될까요");
	}
}
