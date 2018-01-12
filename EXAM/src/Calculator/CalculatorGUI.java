package Calculator;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.EventObject;

public class CalculatorGUI extends JFrame implements ActionListener{
	
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels= {
			"7","8","9","+",
			"4","5","6","-",
			"1","2","3","x",
			"+/-","0","=","/",
			"CE","C","<-",""
	};
	private String Operand="";
	Calculator calc;
	
	public CalculatorGUI(Calculator calc) {
		this.calc = calc;
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("0");
		tField.setEditable(false);
		int Operand = Integer.parseInt((tField).getText());
		
		panel.setLayout(new GridLayout(0,4,3,3));
		buttons = new JButton[20];
		int index = 0;
		for (int rows =0; rows<5 ; rows++) {
			for(int cols = 0 ; cols<4 ; cols++) {
				buttons[index] = new JButton(labels[index]);
				if(cols>=3)
					buttons[index].setForeground(Color.red);
				else
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.white);
				panel.add(buttons[index]);
				index++;
			}
		}
		
		for(int i=0;i<20;i++) {
			buttons[i].addActionListener(this);
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	
	
	public void actionPerformed(ActionEvent e)  {
	String clickedButtonText;
	
	clickedButtonText=((JButton)e.getSource()).getText();
	
		switch(clickedButtonText) {
			case("1"): case("2"): case("3"): case("4"): case("5"):
			case("6"): case("7"): case("8"): case("9"):
				if(Operand.equals("0"))
					Operand="";
				Operand+=clickedButtonText;
				tField.setText(Operand);
				break;
			case("0"):
				if((Operand!="")&&(Operand!="0")) {
					Operand+=clickedButtonText;
					tField.setText(Operand);
				}
				else {
					Operand="0";
					tField.setText(Operand);
				}
				break;
			case("<-"):
				int length = tField.getText().length();
				if(length==1) {
					Operand="";
					tField.setText("0");
				}
				else {
					Operand=Operand.substring(0, length-1);
					tField.setText(Operand);
				}
				break;
			case("CE"):
				Operand="";
				tField.setText("0");
				calc.setOperand1(0);
				break;
			case("C"):
				Operand="";
				tField.setText("0");
				calc.setOperand1(0);
				calc.setOperand2(0);
				calc.setResult(0);
				break;
			case("+"): case("-"): case("*"): case("/"):
				calc.setOperand1(Integer.parseInt(tField.getText()));
				calc.setOperator(clickedButtonText);
				Operand="0";
				tField.setText(Operand);
				break;
			case("+/-"):
				Operand= Integer.toString((Integer.parseInt(Operand))*-1);
				tField.setText(Operand);
				break;
			case("="):
				if(calc.getOperator()!=""&&calc.getOperator()=="+") {
					calc.setOperand2(Integer.parseInt(tField.getText()));
					calc.plus();
					tField.setText(Integer.toString(calc.getResult()));
				}
				else if(calc.getOperator()!=""&&calc.getOperator()=="-") {
					calc.setOperand2(Integer.parseInt(tField.getText()));
					calc.sub();
					tField.setText(Integer.toString(calc.getResult()));
				}
				else if(calc.getOperator()!=""&&calc.getOperator()=="*") {
					calc.setOperand2(Integer.parseInt(tField.getText()));
					calc.mul();
					tField.setText(Integer.toString(calc.getResult()));
				}
				else if(calc.getOperator()!=""&&calc.getOperator()=="/") {
					calc.setOperand2(Integer.parseInt(tField.getText()));
					calc.div();
					tField.setText(Integer.toString(calc.getResult()));
				}
				break;
			default:
				break;
		}
	}
	
	
	
	public static void main(String args[]) {
		Calculator calc = new Calculator();
		CalculatorGUI s = new CalculatorGUI(calc);
	}
}
