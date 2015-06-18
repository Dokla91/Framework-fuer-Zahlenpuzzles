package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {

	JButton button;
	
	public ButtonListener(JButton button) {
		this.button = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.button.setText("AAA");
	}

}
