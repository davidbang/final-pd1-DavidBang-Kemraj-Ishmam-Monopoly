import javax.swing.JButton;

/* 
	This class was developed solely for the GUI. 
	There was a need to check which column the player was placing a piece in
	Thus by extending JButton, it gains the functionality of JButton,
	While also giving freedom to add convenient variables.
	
	This was just to give each button a coordinate in the Connect4 grid.
*/

public class myJButton extends JButton {

	private int row;
	private int col; 
	
	public myJButton(){
		super();
	}
	
	public myJButton(int r, int c) {
		super();
		row = r;
		col = c;
	}
	
	public void setRow(int n) {
		row = n;
	}
	
	public void setCol(int n) {
		col = n;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
}