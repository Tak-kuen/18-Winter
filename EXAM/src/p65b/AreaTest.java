package p65b;

public class AreaTest {
	public static void main(String[] args) {
		double radius, area;		//�Ǽ����̴ϱ� double�� ���
		radius = 0.5e+2;		//�Ҽ����� �⺻������ double ������ �Ǿ������Ƿ� float������ �ٲپ������
		area = 3.141592f * radius * radius;
		System.out.println("���� ������ " + area);
	}
}
