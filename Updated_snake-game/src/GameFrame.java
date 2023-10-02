/**
* This is the classic Snake Game programmed in Java. The class extends JFrame and sets up the Frame for the game.
*
* @author  Vivian Gleißner (I followed a Youtube Tutorial--> https://www.youtube.com/watch?v=bI6e6qjJ8JQ)
* @version 1.1
* @since   2023-10-02
*/

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	public GameFrame() {

		this.add(new GamePanel());
		this.setTitle("Snake game by Vivian");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		

		
		
	}
}
