import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumGenerator implements ActionListener{
	JFrame window=new JFrame();
	JButton button=new JButton("Generate");
	JPanel panel=new JPanel();
	JLabel label=new JLabel();
public NumGenerator() {
	
	panel.add(label);
panel.add(button);
	window.add(panel);
	window.setVisible(true);
	
button.addActionListener(this);
window.pack();
	}	
 public static void main(String[] args) {
	NumGenerator x= new NumGenerator();
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated  stub
	Random r=new Random();
	int o=r.nextInt(10);
	label.setText(""+o);
	
}
}
