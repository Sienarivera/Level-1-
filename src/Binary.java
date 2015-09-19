
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import org.teachingextensions.logo.Colors;

public class Binary implements ActionListener
{
	public static void main(String[] args)
	{
		Binary game = new Binary();
		game.createUI();
	}


	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button4 = new JButton();
	JButton button8 = new JButton();
	JButton button16 = new JButton();
	JButton clear = new JButton();

	int sum = 0;
	


	void createUI()
	{
		frame.add(panel);
		frame.setVisible(true);
		frame.setBackground(Colors.getRandomColor());
		panel.setVisible(true);
		panel.setSize(600,100);
		panel.setForeground(Colors.getRandomColor());
		frame.setSize(600, 100);
		frame.setTitle("Binary Game");
		
		panel.add(button1);
		button1.setVisible(true);
		button1.setSize(200,800);
		button1.setText(" ");
		panel.add(button2);
		button2.setVisible(true);
		button2.setSize(200, 800);
		button2.setText(" ");
		panel.add(button4);
		button4.setVisible(true);
		button4.setSize(200,800);
		button4.setText(" ");
		panel.add(button8);
		button8.setVisible(true);
		button8.setSize(200,800);
		button8.setText(" ");
		panel.add(button16);
		button16.setVisible(true);
		button16.setSize(200,800);
		button16.setText(" ");
		
		panel.add(clear);
		clear.setText("Clear");
		
	
		panel.add(label);
		label.setText("Your Sum is "+sum);
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button4.addActionListener(this);
		button8.addActionListener(this);
		button16.addActionListener(this);
		clear.addActionListener(this);
		
		

	}
	public void actionPerformed(ActionEvent e)
	{	
		JButton clickedButton = (JButton) e.getSource();
	
		
		if(clickedButton.equals(button1))
		{
			if (button1.getText().equals(" "))
			{
				button1.setText("16");
				sum+=16;
			}
			else
			{
				button1.setText(" ");
				sum-=16;
			}
		}
		
		if(clickedButton.equals(button2))
		{
			if (button2.getText().equals(" "))
			{
				button2.setText("8");
				sum+=8;
			}
			else
			{
				button2.setText(" ");
				sum-=8;
			}
		}
		if(clickedButton.equals(button4))
		{
			if (button4.getText().equals(" "))
			{
				button4.setText("4");
				sum+=4;
			}
			else
			{
				button4.setText(" ");
				sum-=4;
			}
		}
		if(clickedButton.equals(button8))
		{
			if (button8.getText().equals(" "))
			{
				button8.setText("2");
				sum+=2;
			}
			else
			{
				button8.setText(" ");
				sum-=2;
			}
		}
		if(clickedButton.equals(button16))
		{
			if (button16.getText().equals(" "))
			{
				button16.setText("1");
				sum+=1;
			}
			else
			{
				button16.setText(" ");
				sum--;
			}
		}
		
		if(clickedButton.equals(clear))
		{
			button1.setText(" ");
			button2.setText(" ");
			button4.setText(" ");
			button8.setText(" ");
			button16.setText(" ");
			
			sum=0;
		}
		
		label.setText("Your Sum is "+sum);

	}

	
	
	
	
	
}
