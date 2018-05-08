/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public static void main(String[] args) {
		//1. Create and initialize an object of the JFrame class
JFrame x=new JFrame();
		//2. Set your JFrame object to be visible
x.setVisible(true);
		//3. Run your program. Do you see your window? It's probably very small.
		
		//4. Set the default close operation to JFrame.EXIT_ON_CLOSE
x.getDefaultCloseOperation();
		//5. Create and initialize an object of the JPanel class
JPanel y=new JPanel();
		//6. Create and initialize an object of the JLabel class
JLabel w=new JLabel();
		//7. Set the text of the JLabel to a lovely greeting.
w.setText("Hello");
		//8. Add the JPanel object to the JFrame
x.add(y);
		//9. Add the JLabel object to the JPanel
y.add(w);
		//10. Pack your JFrame.
x.pack();
		//11. Run your program again. Do you see your message.
		
		//12. Use the loadImage method to set the icon of the JLabel object.  
w.setIcon(loadImage());
		//13. Re-pack the JFrame object.
		x.pack();
		//14. Run the program one more time. Do you see the image?
	}
	
	public static ImageIcon loadImage(){
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			
			return null;
		}
	}
}
