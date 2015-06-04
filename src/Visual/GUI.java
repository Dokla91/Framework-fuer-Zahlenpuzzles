package Visual;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
	
	public GUI() {
	
		this.setVisible(true);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(2,3);
		this.setLayout(null);
		
	}
	
	public JButton createButton(String text, int xSize, int ySize, int xLocation, int yLocation) {
		
		JButton button = new JButton();
		button.setVisible(true);
		button.setText(text);
		button.setSize(xSize, ySize);
		button.setLocation(xLocation, yLocation);
		return button;
		
	}
	
}
