package Game;

import javax.swing.JButton;

import Logik.Feld;
import Logik.Rahmen;
import Visual.GUI;

public class Sudoku {

	private int playerAmount;
	private int timeOut;
	
	public Sudoku(int playerAmount, int timeOut) {
		this.playerAmount = playerAmount;
		this.timeOut = timeOut;
	}
	
	public void run() {
		
		// Create SudokuGUI
		// +++++++++++++++++++
		GUI frame = new GUI();
//		JButton button = frame.createButton("Test", 60, 60, 40, 40);
//		frame.add(button);
		Rahmen rahmen = new Rahmen();
		rahmen.setDimension(9, 9);
		Feld[][] fields = rahmen.getFields();
		
		int xMax = fields.length;
		
		for (int i = 0; i < xMax; i++) {
			
			int yMax = fields[i].length;
			
			for (int j = 0; j < yMax; j++) {
				
				JButton button = frame.createButton("x", 55, 55, i * 60, j * 60);
				button.addActionListener(new ButtonListener(button));
				frame.add(button);
			}		
			
		}
		
		// +++++++++++++++++++
		
	}
	
//	private JButton createSudokuButtons(Feld[][] fields) {
//		
//		JButton jButtons = new JButton;
//		
//		
//		return jButtons;
//	}
	
	
}
