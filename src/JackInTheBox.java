import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
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
private void playSound(String homerWoohoo) { 
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(homerWoohoo));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}




@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	Random r =new Random();
	int i=r.nextInt(10);
	for (int t = 0; t < 10; t++) {
		
		if(i==t) {
		showPicture("jackInTheBox.png");
		playSound("homer-woohoo.wav");
		}else {
			
		}
	}
		
}
}
