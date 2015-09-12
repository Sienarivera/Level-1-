import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.teachingextensions.logo.Colors;
public class BinaryConverter implements ActionListener
{

	
	public static void main(String[] args)
	{
		BinaryConverter converter = new BinaryConverter();
		converter.createUI();

	
	}
	public void actionPerformed(ActionEvent arg0)
	{	
	answer1.setText(convert(answer.getText()));
	
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField answer1 = new JTextField(20);
	JTextField answer = new JTextField(20);
	
	void createUI()
	{
		frame.add(panel);
		frame.setVisible(true);
		frame.setBackground(Colors.getRandomColor());
		frame.setSize(800, 70);
		frame.setTitle("Binary Converter");
		
		panel.setVisible(true);
		panel.setForeground(Colors.getRandomColor());
		panel.add(answer);
		panel.add(button);
		panel.add(answer1);
		answer.setVisible(true);
		answer.setBackground(Colors.getRandomColor());
		answer1.setVisible(true);
		answer1.setBackground(Colors.getRandomColor());
		button.setVisible(true);
		button.setText("Convert");
		button.setForeground(Colors.getRandomColor());
		button.addActionListener(this);
		
	}
	
	String convert (String binary)
	{
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
		
	}

	
	
}
