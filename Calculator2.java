import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculater_ui implements ActionListener{
	
	JFrame frame = new JFrame ("Calculater");
	JPanel panel = new JPanel (new FlowLayout());
	
	JTextArea text = new JTextArea(1, 20);
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");
	
	JButton buttonadd = new JButton("+");
	JButton buttonsub = new JButton("-");
	JButton buttonmulti = new JButton("*");
	JButton buttondivid = new JButton("/");
	JButton buttonequal = new JButton("=");
	JButton buttonclear = new JButton("C");
	
	int number1, number2,result;
	int addc=0,subc=0,multic=0,divc=0;
	
	public void ui(){
		frame.setVisible(true);
		frame.setSize(250, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.add(text);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		
		panel.add(buttonadd);
		panel.add(buttonsub);
		panel.add(buttonmulti);
		panel.add(buttondivid);
		panel.add(buttonequal);
		panel.add(buttonclear);
		
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	button0.addActionListener(this);
	buttonadd.addActionListener(this);
	buttonsub.addActionListener(this);
	buttonmulti.addActionListener(this);
	buttondivid.addActionListener(this);
	buttonequal.addActionListener(this);
	buttonclear.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if(source==buttonclear){
			number1=0;
			number2=0;
			text.setText("");
			
		}
		if(source==button1){
			text.append("1");
		}
		if(source==button2){
			text.append("2");
		}
		if(source==button3){
			text.append("3");
		}
		if(source==button4){
			text.append("4");
		}
		if(source==button5){
			text.append("5");
		}
		if(source==button6){
			text.append("6");
		}
		if(source==button7){
			text.append("7");
		}
		if(source==button8){
			text.append("8");
		}
		if(source==button9){
			text.append("9");
		}
		if(source==button0){
			text.append("0");
		}
		if(source==buttonadd){
			number1=(int) number_reader();
			text.setText("");
			addc=1;
			subc=0;
			multic=0;
			divc=0;
		}
		if(source==buttonsub){
			number1=(int) number_reader();
			text.setText("");
			addc=0;
			subc=1;
			multic=0;
			divc=0;
		}
		if(source==buttonmulti){
			number1=(int) number_reader();
			text.setText("");
			addc=0;
			subc=0;
			multic=1;
			divc=0;
		}
		if(source==buttondivid){
			number1=(int) number_reader();
			text.setText("");
			addc=0;
			subc=0;
			multic=0;
			divc=1;
		}
		if(source==buttonequal){
			number2=(int) number_reader();
				if(addc>0){
					result=number1+number2;
					text.setText(Double.toString(result));
				}
				if(subc>0){
					result=number1-number2;
					text.setText(Double.toString(result));
				}
				if(multic>0){
					result=number1*number2;
					text.setText(Double.toString(result));
				}
				if(divc>0){
					result=number1/number2;
					text.setText(Double.toString(result));
				}
		}
	}
	
	public double number_reader(){
		Double num1;
		String a;
		a=text.getText();
		num1=Double.valueOf(a);
		
		return num1;
	}
		
	
}
