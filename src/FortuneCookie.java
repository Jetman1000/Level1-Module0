import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	FortuneCookie(){
		
	}
	
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
	     fc.showButton();
	}
	public void showButton() {
	     System.out.println("Button clicked");
	     
			JFrame fc=new JFrame();
			JButton button=new JButton("Something");
			fc.setVisible(true);
			fc.add(button);
			button.addActionListener(this);
			fc.pack();
			
			
			
	     
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		String Fortune1="you will be rich.";
		String Fortune2="you will be poor.";
		String Fortune3="you will be married.";
		String Fortune4="you will be kind.";
		String Fortune5="you will be the president in the future. ";
		int rand=new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, Fortune1);
		}
		if(rand==1) {
			JOptionPane.showMessageDialog(null, Fortune2);
		}
		if(rand==2) {
			JOptionPane.showMessageDialog(null, Fortune3);
		}
		if(rand==3) {
			JOptionPane.showMessageDialog(null, Fortune4);
		}
		if(rand==4) {
			JOptionPane.showMessageDialog(null, Fortune5);
		}
		
	
	}
}
