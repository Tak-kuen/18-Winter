package p218;

public class GetterSetter {
	private int salary;
	private String name;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary; //매개변수를 멤버변수와 다르게해도 this는 적어주는것이좋다
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
