/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String Image="https://i.ytimg.com/vi/zHH-a7poRes/maxresdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
 image=createImage(Image);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer=JOptionPane.showInputDialog("Which would you choose?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equals("Some Rainy Bois")) {
	JOptionPane.showMessageDialog(null, "Correct");
}else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)
https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjE2OjfpbvbAhVM7qwKHcc_AEkQjRx6BAgBEAU&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3Dn4tzd0nMi3w&psig=AOvVaw1sU3JSjPcUsJCgGX4bHu0b&ust=1528244979260365
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





