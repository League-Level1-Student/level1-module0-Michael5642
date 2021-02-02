package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
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

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		JLabel question = new JLabel();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
String image = "https://upload.wikimedia.org/wikipedia/commons/8/83/Jeopardy%21.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component hold = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(hold);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String quizQuestion = JOptionPane.showInputDialog("what is the name of this show?");
		// 7. print "CORRECT" if the user gave the right answer
if (quizQuestion.equalsIgnoreCase("jeopardy")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(hold);
		// 10. find another image and create it (might take more than one line
		// of code)
String alexTrebek = "https://imagesvc.meredithcorp.io/v3/mm/image?q=85&c=sc&poi=face&w=2000&h=1333&url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F20%2F2020%2F11%2F08%2Falex-trebek.jpg";
		// 11. add the second image to the quiz window
Component trebek = createImage(alexTrebek);
quizWindow.add(trebek);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String question2 = JOptionPane.showInputDialog("who is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if (question2.equalsIgnoreCase("alex trebek")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
System.exit(0);
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
