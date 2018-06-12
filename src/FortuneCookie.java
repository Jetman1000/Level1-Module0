import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener{
	FortuneCookie(){
		JFrame fc=new JFrame();
		JButton button=new JButton();
		fc.setVisible(true);
		fc.add(button);
		button.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new FortuneCookie();
	}
	public void showButton() {
	     System.out.println("Button clicked");
	     FortuneCookie fc = new FortuneCookie();
	     fc.showButton();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
