import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.teachingextensions.logo.Colors;



public class Spamalot implements ActionListener
{
	static final String FAKE_USERNAME = "level1spam530@gmail.com";
	static final String FAKE_PASSWORD = "password530";
	
	public static void main(String[] args)
	{
		Spamalot spammer = new Spamalot();
		spammer.createUI();
		
		
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonG = new JButton();
	JButton buttonB = new JButton();
	JTextField amountOfSpam = new JTextField(3);
	JButton buttonC = new JButton();
	JTextField field = new JTextField(10);
	JTextField custom = new JTextField(10);
	
	
	void createUI()
	{
		
		frame.setVisible(true);
		panel.setVisible(true);
		
		buttonG.setVisible(true);
		buttonB.setVisible(true);
		buttonC.setVisible(true);
		custom.setVisible(true);
		amountOfSpam.setVisible(true);
		
		frame.add(panel);
		panel.add(field);
		panel.add(buttonG);
		panel.add(buttonB);
		panel.add(amountOfSpam);
		panel.add(custom);
		panel.add(buttonC);
		frame.setTitle("Spammer");
		
		
		buttonB.addActionListener(this);
		buttonG.addActionListener(this);
		buttonC.addActionListener(this);
		
		frame.pack();
		panel.setBackground(Colors.getRandomColor());
		buttonB.setForeground(Colors.getRandomColor());
		buttonB.setText("Bad");
		
		buttonG.setForeground(Colors.getRandomColor());
		buttonG.setText("Good");
		buttonC.setForeground(Colors.getRandomColor());
		buttonC.setText("Customed");
		
		frame.setSize(400,100);
		panel.setSize(400,100);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		JButton newButton = (JButton) arg0.getSource();
		
		if(buttonB == newButton)
		{
			
			//System.out.println("Bad: "+field.getText());
			int spamNum = Integer.parseInt(amountOfSpam.getText());
			for (int i = 0; i < spamNum; i++)
			{
				boolean sentSpam = sendSpam(field.getText(), "BANANA DOGGGGG"+i, "LIKE MAI SPAM! YOOOOO"+i);
				System.out.println(sentSpam);
					if(sentSpam== true)
					{
						field.setBackground(Colors.Greens.DarkGreen);
						
					}
					else
					{
						field.setBackground(Colors.Reds.FireBrick);
					}
				
			}
			
		}
		if(buttonG == newButton)
		{
			//System.out.println("Good: "+field.getText());
			boolean sentSpamG = sendSpam(field.getText(), "THIS IS NOT SPAM THIS IS LEGIT SHIZWA", ":PPP");
			System.out.println(sentSpamG);
			String sentSpamText = sendTextMessage(field.getText(),"SUP BIRCH WAT CHU UP TO IM WATCHIN U...BANANA DOG");
			
			if(sentSpamG== true)
			{
				field.setBackground(Colors.Greens.DarkGreen);
				
			}
			else
			{
				field.setBackground(Colors.Reds.FireBrick);
			}
		}
		if(buttonC == newButton)
		{
			
			//System.out.println("Customed: "+custom.getText());
			boolean sentSpamC =sendSpam(field.getText(), custom.getText(), ":P");
			System.out.println(sentSpamC);
			
			if(sentSpamC== true)
			{
				field.setBackground(Colors.Greens.DarkGreen);
				
			}
			else
			{
				field.setBackground(Colors.Reds.FireBrick);
			}
		}
		
	}
	
	
	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}
	
	String sendTextMessage(String phoneNumber, String message){
		if(sendSpam(phoneNumber + "@tmomail.net", "", message)) return "T-Mobile"; 
		if(sendSpam(phoneNumber + "@vmobl.com", "", message)) return "Virgin Mobile"; 
		if(sendSpam(phoneNumber + "@cingularme.com", "", message)) return "Cingular"; 
		if(sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message)) return "Sprint"; 
		if(sendSpam(phoneNumber + "@vtext.com", "", message)) return "Verizon"; 
		if(sendSpam(phoneNumber + "@messaging.nextel.com", "", message)) return "Nextel"; 
		return "FAIL!";
	}


	

}
