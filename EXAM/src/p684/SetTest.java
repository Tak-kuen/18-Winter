package p684;

import java.util.HashSet;
import java.util.LinkedList;
public class SetTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("cheese");
		set.add("ham");
		set.add("ham");
		
		
		System.out.println(set);
	}
}