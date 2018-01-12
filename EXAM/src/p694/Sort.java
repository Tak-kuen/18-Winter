package p694;

import java.util.*;

public class Sort {
	public static void main(String[] args) {
		String[] sample = { "i","walk","the","line"};
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);
		
		Integer[] sample2 = {34,246,24,1,6,7,83,57,356346,234,23425};
		List<Integer> list2 = Arrays.asList(sample2);
		Collections.sort(list2);
		System.out.println(list2);
	}
}
