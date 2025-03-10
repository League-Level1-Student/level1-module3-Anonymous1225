package _02_static_smiley_blues;

import javax.swing.*;

public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible
		JFrame luke = new JFrame();
		luke.setVisible(true);
		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
		luke.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Make a new JPanel
		JPanel piggy = new JPanel();
		// 4. Add your panel to your frame
		luke.add(piggy);
		// 8. DO THIS LAST:
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley
		// object's!)
		Smiley.color=Smiley.YELLOW;
		// Using a specific object for a static variable works, but is not usually
		// recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red
		// or green!

		// 5. Make three Smiley objects and add them to your panel
		Smiley rodent = new Smiley();
		Smiley doggo = new Smiley();
		Smiley cat = new Smiley();
		piggy.add(rodent);
		piggy.add(doggo);
		piggy.add(cat);
		// 6. Pack your frame
		luke.pack();
		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
	}
}
