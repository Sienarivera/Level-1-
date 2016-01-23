import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.teachingextensions.logo.Colors;

public class SimpleCalculator implements ActionListener
{
	int firstNum, lastNum, result = -1;
	String operation = "";
	public static void main(String[] args0)
	{
		SimpleCalculator c = new SimpleCalculator();
		c.createUI();
	
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	JButton five = new JButton();
	JButton zero = new JButton();
	JButton add = new JButton();
	JButton sub = new JButton();
	
	

	JButton mult = new JButton();
	JButton div = new JButton();
	JTextField field = new JTextField(10);
	
	void createUI()
	{
		frame.pack();
		frame.add(panel);
		panel.add(field);
		
		frame.setVisible(true);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(zero);
		
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(div);
		frame.setSize(200, 400);
		frame.setTitle("Simple Calculator");
		four.setText("4");
		five.setText("5");
		zero.setText("0");
		add.setText("+");
		sub.setText("-");
		one.setText("1");
		two.setText("2");
		three.setText("3");
		mult.setText("x");
		div.setText("/");
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		zero.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mult.addActionListener(this);
		field.addActionListener(this);
		
		
		frame.setBackground(Colors.getRandomColor());
		frame.setForeground(Colors.getRandomColor());
		panel.setBackground(Colors.getRandomColor());
		panel.setBackground(Colors.getRandomColor());
		add.setBackground(Colors.getRandomColor());
		sub.setBackground(Colors.getRandomColor());
		mult.setBackground(Colors.getRandomColor());
		div.setBackground(Colors.getRandomColor());
		
	}
	
	public void actionPerformed(ActionEvent args0)
	{
		JButton newButton = (JButton) args0.getSource();
		if(one==newButton)
		{
			
			setInput(1);
			
		}
		else if(two==newButton)
		{
			
			setInput(2);
		}
		else if(three == newButton )
		{
			setInput(3);
			
		}
		else if(add == newButton)
		{
			doOperation("+");
		}
		
		
		
		field.setText(firstNum+operation+lastNum);
		
		field.setText(result+"");
	}
	
	public void doOperation(String op)
	{
		if(op.equals("+"))
		{
			operation = "+";	
			result = addNumbers(firstNum, lastNum);
		}
	}

	private void setInput(int value)
	{
		if(firstNum==-1)
		{
			firstNum = value;
		}
		else
			lastNum = value;
	}
	
	public int addNumbers(int a, int b)
	{
		return a+b;
	}
	
	public int subNumbers(int a, int b)
	{
		return a-b;
	}
	
	public double divideNumbers(int a, int b)
	{
		return (double)a/b;
	}
	
	public int multiplyNumbers(int a, int b)
	{
		return a*b;
	}
	
	
}
