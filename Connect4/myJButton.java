import javax.swing.JButton;

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