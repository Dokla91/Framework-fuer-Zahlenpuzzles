package Logik;

import java.util.concurrent.ExecutionException;

public class Rahmen {
	private int xMax;
	private int yMax;
	private Feld[][] fields;
	
	public void setRahmen() {} 
	
	public void setRahmen(int xMax, int yMax, Feld[][] fields){
		
		this.xMax = xMax;
		this.yMax = yMax;
		this.fields = fields;	
		
	}
		
	/**
	 * Setzt die Spielfeld Breite und H�he.
	 * @param x Breite
	 * @param y H�he
	 */
	public void setDimension(int x, int y){

		try {
			
			if (x < 0 || y < 0) {
				throw new Exception("x or y is less then 0");
			}
			
			fields = new Feld[x][y];
			
			for (int i = 0; i < x; i++) {
				
				for (int j = 0; j < y; j++) {					
					fields[i][j] = new Feld();
				}			
				
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}				
		
	}
	
	public Feld[][] getFields() {	// was macht das ??
		return fields;
	}
	
}
