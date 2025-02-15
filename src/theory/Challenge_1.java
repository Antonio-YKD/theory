package theory;

import java.awt.Color;

import javax.swing.JFrame;

public class Challenge_1 {
	public static void main(String[] args) {

		System.out.println("Ez");
		
		
		JFrame gameWindow_1 = new JFrame();
		gameWindow_1.setSize(200, 200);
		gameWindow_1.setVisible(true);
		gameWindow_1.setLocation(1730,0);
		gameWindow_1.getContentPane().setBackground(Color.black);

		

		JFrame gameWindow_2 = new JFrame();
		gameWindow_2.setSize(200, 200);
		gameWindow_2.setVisible(true);
		gameWindow_2.setLocation(-10,0);
		gameWindow_2.getContentPane().setBackground(Color.black);


		JFrame gameWindow_3 = new JFrame();
		gameWindow_3.setSize(200, 200);
		gameWindow_3.setVisible(true);
		gameWindow_3.setLocation(1730,890);
		gameWindow_3.getContentPane().setBackground(Color.black);


		JFrame gameWindow_4 = new JFrame();
		gameWindow_4.setSize(200, 200);
		gameWindow_4.setVisible(true);
        gameWindow_4.setLocation(-10,890);
        gameWindow_4.getContentPane().setBackground(Color.black);
	}

}
