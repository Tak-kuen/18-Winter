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
		st.put("20090001", new Student(20090001,"ȫ�浿"));
		st.put("20090002", new Student(20090002,"�谳��"));
		st.put("20090003", new Student(20090003,"��ö��"));
		
		//����׸� ���
		System.out.println(st);
		
		//�׸� �ϳ� ����
		st.remove("20090002");
		//�׸� �ϳ� ��ü
		st.put("20090003", new Student(20090003,"�̹μ�"));
		//�� ����
		System.out.println(st.get("20090003"));
		//����׸��� �湮
		for(Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
	}
}
