package StudentGUI;

public class Student {
	private int studNumber;			//�й�
	private String studName;		//����
	private int point;				//����
	
	public Student(int sNum, String sName, int point) {
		this.studNumber = sNum;
		this.studName = sName;
		this.point = point;
	}								//������
	
	public Student() {
		this(1000000, "����", 0);
	}								//������
	
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
	// ���ͼ���
	
	
	
}
