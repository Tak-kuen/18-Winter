package p65;

public class light {
	public static void main(String args[]) {
		long lightspeed;
		long distance;
		
		lightspeed = 300000;
		distance = lightspeed * 365 * 24 * 60 * 60; 
		/* ������ �ڷḦ int������ �Ұ�� ������ �ڷ�� int������ ���Ǿ� ����Ǵϱ� 365L�̶�� long�� ����� �ٿ������
		 * ��, ���Ǳ��� int�������� �Ѿ�� ������ ����
		 * ���� �ڷḦ ÷���� long������ �� ��� ������ �ڷᵵ long������ ����Ǵϱ� L�Ⱥٿ��� ��
		 */
		System.out.println("���� 1�⵿�� ���� �Ÿ� : " + distance + "km." );
	}

}
