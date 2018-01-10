package Calculator;

public class Calculator {
	private int operand1 = 0;
	private int operand2 = 0;
	private String operator="";
	private int result;
	
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public int getOperand1() {
		return operand1;
	}

	public int getOperand2() {
		return operand2;
	}

	public void plus() {result = operand1 + operand2;}
	public void sub() {result = operand1 - operand2;}
	public void mul() {result = operand1 * operand2;}
	public void div() {result = operand1 / operand2;}

}

