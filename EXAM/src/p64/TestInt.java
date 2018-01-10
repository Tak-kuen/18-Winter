package p64;

public class TestInt {

	public static void main(String[] args) {
		int a,b,c,d;
		char ch, ch2;
		a = 65;
		b = 0101;
		c = 0x41;
		d = 0b01000001;
		
		ch= 'ª¬';
		ch2='\uac00';
		System.out.println("\"¾È³çÇÏ¼¼¿ä\"\\¹Ý°©½À´Ï´Ù.\t");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println(ch + "=" + ch2);

	}

}
