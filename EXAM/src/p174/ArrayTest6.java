package p174;

public class ArrayTest6 {

	public static void main(String[] args) {
		int[][] array = {
				{10,20,30,40},
				{50,60,70,80,81,82,83},
				{90,100,110,120}
		};
		
		for(int r=0 ; r < array.length ; r++) {
			for(int c=0 ; c < array[r].length ; c++) {
				System.out.printf("%dÇà %d¿­ : %d / ",r,c,array[r][c]);
			}
			System.out.println();
		}
	}

}
