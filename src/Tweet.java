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

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Tweet implements ActionListener
{
	public static void main(String[] args)
	{
		Tweet twitter = new Tweet();
		twitter.createUI();
		
		
		
	}

	public void actionPerformed(ActionEvent e)
	{	
	twitterMessage.setText("tweet tweet");
	JButton clickedButton = (JButton) e.getSource();
	
	if(clickedButton.equals(button))
	{
		twitterMessage.setText(getLatestTweet(field.getText()));
		
	}
	
	
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field = new JTextField(20);
	JButton button = new JButton();
	JTextField twitterMessage = new JTextField(100);

	void createUI()
	{
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		panel.add(twitterMessage);
		
		frame.setSize(1500, 1000);
		panel.setSize(1500,1000);
		
		frame.setVisible(true);
		panel.setVisible(true);
		field.setVisible(true);
		button.setVisible(true);
		twitterMessage.setVisible(true);
		
		

		frame.setForeground(Colors.getRandomColor());
		frame.setTitle("Tweet Retriever Swag Monay");
		panel.setBackground(Colors.getRandomColor());
		
		field.setSize(100,100);
		field.setForeground(Colors.getRandomColor());
		
		
		button.setForeground(Colors.getRandomColor());
		button.setText("Search the Twitterverse");
		
		frame.pack();
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}




}