package p691;

import java.util.*;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number=number;
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
}

public class MapTest {
	public static void main(String[] args) {
		Map<String,Student> st = new HashMap<String,Student>();
		st.put("20090001", new Student(20090001,"홍길동"));
		st.put("20090002", new Student(20090002,"김개똥"));
		st.put("20090003", new Student(20090003,"박철수"));
		
		//모든항목 출력
		System.out.println(st);
		
		//항목 하나 삭제
		st.remove("20090002");
		//항목 하나 대체
		st.put("20090003", new Student(20090003,"이민수"));
		//값 참조
		System.out.println(st.get("20090003"));
		//모든항목을 방문
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
	}
}
