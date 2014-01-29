import javax.swing.*;

public class myJButton extends JButton {

	private int row;
	private int col; 
	
	public myJButton(int r, int c) {
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