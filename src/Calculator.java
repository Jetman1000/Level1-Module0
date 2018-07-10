import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	JButton button=new JButton("Add");
	JButton button2=new JButton("Subtract");
	JButton button3=new JButton("Multiply");
	JButton button4=new JButton("Divide");
	JFrame window=new JFrame();
	JTextField text=new JTextField(10);
	JTextField text2=new JTextField(10);
	
	JPanel panel=new JPanel();
	JLabel label=new JLabel();
	
	public Calculator() {
	
	

	panel.add(text);
	panel.add(text2);
		window.add(panel);
		window.setVisible(true);
	button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(label);
	window.pack();
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	JButton buttonPressed=(JButton) arg0.getSource();
	String x=text.getText();
	String y=text2.getText();
	int u=Integer.parseInt(y);
	int i=Integer.parseInt(x);
	if(buttonPressed==button) {
		JOptionPane.showMessageDialog(null, u+i);
	}
	if(buttonPressed==button2) {
		JOptionPane.showMessageDialog(null,u-i);
	}
	if(buttonPressed==button3) {
		JOptionPane.showMessageDialog(null, u*i);
	}
	if(buttonPressed==button4) {
		JOptionPane.showMessageDialog(null, u/i);
	}
	}

}
