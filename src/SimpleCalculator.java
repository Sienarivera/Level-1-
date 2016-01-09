import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.Colors;

public class SimpleCalculator implements ActionListener
{
	public static void main(String[] args0)
	{
		SimpleCalculator c = new SimpleCalculator();
		c.createUI();
	
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mult = new JButton();
	JButton div = new JButton();
	
	
	void createUI()
	{
		frame.add(panel);
		frame.setVisible(true);
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(div);
		frame.setSize(500, 300);
		frame.setTitle("Simple Calculator");
		add.setText("Add");
		sub.setText("Subtract");
		mult.setText("Multiply");
		div.setText("Divide");
		frame.setBackground(Colors.getRandomColor());
		frame.setForeground(Colors.getRandomColor());
		panel.setBackground(Colors.getRandomColor());
		panel.setBackground(Colors.getRandomColor());
		add.setBackground(Colors.getRandomColor());
		sub.setBackground(Colors.getRandomColor());
		mult.setBackground(Colors.getRandomColor());
		div.setBackground(Colors.getRandomColor());
		
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
	
	}
}
