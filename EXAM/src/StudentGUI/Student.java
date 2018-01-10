package StudentGUI;

public class Student {
	private int studNumber;			//학번
	private String studName;		//성명
	private int point;				//점수
	
	public Student(int sNum, String sName, int point) {
		this.studNumber = sNum;
		this.studName = sName;
		this.point = point;
	}								//생성자
	
	public Student() {
		this(1000000, "무명씨", 0);
	}								//생성자
	
	public void increasePoint() {
		this.point++;
	}
	public void decreasePoint() {
		this.point--;
	}
	
	public int getStudNumber() {
		return studNumber;
	}
	public void setStudNumber(int studNumber) {
		this.studNumber = studNumber;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	// 게터세터
	
	
	
}
