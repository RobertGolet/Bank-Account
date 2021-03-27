import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CreateAccount{
	
	private JFrame frame;
	private JLabel label;
	private JTextArea text;
	private JButton ok;
	
	public void go(){
		frame = new JFrame("Create account");
		frame.setSize(300,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Enter the balance amount");
		text = new JTextArea(1,10);
		ok = new JButton("OK");
		
		ok.addActionListener(new getTextListener());
		
		frame.getContentPane().add(BorderLayout.NORTH, label);
		frame.getContentPane().add(BorderLayout.CENTER, text);
		frame.getContentPane().add(BorderLayout.SOUTH, ok);
	}
	public class getTextListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			String str = text.getText();
			int it = Integer.parseInt(str);
			Account acc = new Account(it);
			text.append("12");
		}
	}
}