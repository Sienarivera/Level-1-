import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import java.util.EventObject;
import java.util.Random;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.teachingextensions.logo.Colors;

public class WhackAMole implements ActionListener
{
	public static void main(String[] args)
	{
		WhackAMole mole = new WhackAMole();
		mole.createUI();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int ranNum = new Random().nextInt(24);

	void createUI()
	{
		frame.add(panel);
		frame.setTitle("Whack a Mole");
		frame.setBackground(Colors.getRandomColor());
		frame.setForeground(Colors.getRandomColor());
		panel.setBackground(Colors.getRandomColor());

		frame.setVisible(true);
		drawButtons(24);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void drawButtons(int num)
	{

		for (int i = 0; i < num; i++)
		{
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);

			button.setForeground(Colors.getRandomColor());
			button.setBackground(Colors.getRandomColor());

			if (i == ranNum)
			{

				button.setText("mole!");

			} else
				button.setText("");

		}

	}

	void speak(String words)
	{
		try
		{
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent arg0)
	{

		String chosenText = ((JButton) arg0.getSource()).getText();
		if (chosenText.equals("mole!"))
		{
			this.speak("Ouch");
		} else
			this.speak("Hehe");
		
		

	}

}
