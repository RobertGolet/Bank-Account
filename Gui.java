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
	
	public void go(){
		frame = new JFrame("Bank app");
		topPanel = new JPanel();
		lowerPanel = new JPanel();
		createAcc = new JButton("Create account");
		balance = new JButton("Check balance");
		addCash = new JButton("Add funds");
		withdraw = new JButton("Withdraw funds");
		
		BoxLayout layout = new BoxLayout(lowerPanel, BoxLayout.Y_AXIS);
		
		lowerPanel.setLayout(layout);
		lowerPanel.add(createAcc);
		lowerPanel.add(balance);
		lowerPanel.add(addCash);
		lowerPanel.add(withdraw);
		
		lowerPanel.setAlignmentY(createAcc.CENTER_ALIGNMENT);
		
		lowerPanel.setBackground(Color.black);
		
		frame.getContentPane().add(BorderLayout.NORTH,topPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, lowerPanel);
		frame.setSize(500,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
