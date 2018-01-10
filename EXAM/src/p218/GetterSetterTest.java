package p218;

public class GetterSetterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter gst = new GetterSetter();
		
		//gst.salary=1000)
		//gst.name="stk";
		
		gst.setName("홍길동");
		gst.setSalary(1000);
		
		//gst.salary=1000; private써서 이렇게 안됨(정보은닉 가능)
	}

}
