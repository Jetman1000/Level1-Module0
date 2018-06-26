import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener{
JackInTheBox(){
}
public static void main(String[] args) {

JackInTheBox JITB=new JackInTheBox();
JITB.showButton();







}
public void showButton() {
    
		JFrame fc=new JFrame();
		JButton button=new JButton("Surprise!");
		fc.setVisible(true);
		fc.add(button);
		button.addActionListener(this);
		fc.pack();
}

private void showPicture(String jackInTheBox) { 
    try {
         JLabel imageLabel = createLabelImage(jackInTheBox);
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private JLabel createLabelImage(String jackInTheBox) {
    try {
         URL imageURL = getClass().getResource(jackInTheBox);
         if (imageURL == null) {
              System.err.println("Could not find image " + jackInTheBox);
              return new JLabel();
         } else {
              Icon icon = new ImageIcon(imageURL);
              JLabel imageLabel = new JLabel(icon);
              return imageLabel;
         }
    } catch (Exception e) {
         System.err.println("Could not find image " + jackInTheBox);
         return new JLabel();
    }
}

int i=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//System.out.println("hello");
		i++;
		if(i==5) {
			jackInTheBox.showPicture();
			i=0;
		}
}

}
