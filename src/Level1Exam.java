import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Level1Exam implements ActionListener
{
	public static void main(String[] arg0)
	{
		Level1Exam exam = new Level1Exam();
		exam.createUI();
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yellow= new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	
	public void createUI()
	{
		frame.add(panel);
		frame.setTitle("Color Teacher");
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		
		frame.pack();
		frame.show();
		yellow.setBackground(java.awt.Color.yellow);
		yellow.setOpaque(true);
		red.setBackground(java.awt.Color.red);
		red.setOpaque(true);
		blue.setBackground(java.awt.Color.blue);
		blue.setOpaque(true);
		green.setBackground(java.awt.Color.green);
		green.setOpaque(true);
		
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		
	}
	
	void speak(String words)
	{
		try
		{
			Runtime.getRuntime().exec("say "+words);
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent arg0)
	{
		if((JButton)arg0.getSource()==yellow)
		{
						speak("Yellow");
		}
		if((JButton)arg0.getSource()==red)
		{
			
			speak("Red");
		}
		if((JButton)arg0.getSource()==blue)
		{
			
			speak("Blue");
		}
		if((JButton)arg0.getSource()==green)
		{
			
			speak("Green");
		}
	}
	
	
}
