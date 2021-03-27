import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Gui{
	
	private JFrame frame;
	private JPanel topPanel;
	private JPanel lowerPanel;
	private JButton createAcc;
	private JButton balance;
	private JButton addCash;
	private JButton withdraw;	
	private JTextArea text;
	
	public void go(){
		frame = new JFrame("Bank app");
		topPanel = new JPanel();
		lowerPanel = new JPanel();
		createAcc = new JButton("Create account");
		balance = new JButton("Check balance");
		addCash = new JButton("Add funds");
		withdraw = new JButton("Withdraw funds");
		
		Font font = new Font("sanserif", Font.BOLD, 24);
		
		text = new JTextArea(5,25);
		text.setFont(font);
		text.setLineWrap(true);
		text.setEditable(false);
		
		
		createAcc.addActionListener(new createAccountListener());
		//balance.addActionListener(new checkBalanceListener());
		//addCash.addActionListener(new addCashListener());
		//withdraw.addActionListener(new withdrawListener());
		
		lowerPanel.setLayout(new GridLayout(0,1));
		lowerPanel.add(createAcc);
		lowerPanel.add(balance);
		lowerPanel.add(addCash);
		lowerPanel.add(withdraw);
		
		
		topPanel.add(text);
		
		
		lowerPanel.setBackground(Color.black);
		
		frame.getContentPane().add(BorderLayout.NORTH,topPanel);
		frame.getContentPane().add(BorderLayout.CENTER, lowerPanel);
		frame.setSize(550,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class createAccountListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			//Account acc = new Account(0);
			//text.setText("0");
			CreateAccount ac = new CreateAccount();
			ac.go();
		}
	}
	
}
