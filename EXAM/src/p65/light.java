package p65;

public class light {
	public static void main(String args[]) {
		long lightspeed;
		long distance;
		
		lightspeed = 300000;
		distance = lightspeed * 365 * 24 * 60 * 60; 
		/* 광속의 자료를 int형으로 할경우 우측의 자료는 int형으로 계산되어 저장되니까 365L이라는 long형 상수를 붙여줘야함
		 * 단, 계산되기전 int값범위를 넘어서면 오류가 생김
		 * 광속 자료를 첨부터 long형으로 할 경우 우측의 자료도 long형으로 저장되니까 L안붙여도 됨
		 */
		System.out.println("빛이 1년동안 가는 거리 : " + distance + "km." );
	}

}
