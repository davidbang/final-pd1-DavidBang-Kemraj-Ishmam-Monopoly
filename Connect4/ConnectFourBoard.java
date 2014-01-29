import java.io.*;
import java.util.*;

public class ConnectFourBoard{
    private boolean go1, play;
    public char [][] board;
    public int MoveRow, MoveCol, row, i;
    public String Player1, Player2;
    public Scanner input;
    public char Pl1, Pl2;
    
    public ConnectFourBoard(String P1, String P2){
	Player1 = P1;
	Player2 = P2;
	this.board = new char [6][7];
	play = true;
	go1 = true;
	Pl1 = 'X';
	Pl2 = 'O';
	setBoard();
    }

	public String getPlayer() {
		if (go1) {
			return Player1;
			}
		else {
			return Player2;
		}
	}
	
    public void setBoard(){
	for (int i=0; i<board.length; i++){
	    for (int j=0; j<board[i].length; j++){
		board[i][j] = '-';
	    }
	}
    }

    public void aidMove(char player, int row, int col){
        this.board[row][col]=player;
    } 
    
    public boolean move(char player, int col){
	boolean fails = true;
	int row = 0;
	while (fails && (row<7)){
	    if (this.board[row][col]=='-'){
		aidMove(player, row, col);
		fails = false;
	    }
	    else
		row++;
	}
	return !fails;
    }

    
    
    //We have to implement GUI input or Scanners to get the user decisions.
    public void Play_Game(){
	input = new Scanner(System.in);
	while (play){
	    i = -1;
	    System.out.println("_________________________________________________________________________________________________");
	    System.out.println("Current Board:");
	    System.out.println(board2String(board));
	    if (go1){
		while (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6){
		    System.out.println("Choose a column number " + Player1);
		    try{ 
			String choice = input.nextLine();
			if (choice.equals("reset"))
			    setBoard();
			System.out.println(board2String(board));
			i = Integer.parseInt(choice);
		    }
		    catch (Exception e) {
			System.out.println("Please enter a column number");
		    }
		}
		move(Pl1, i);
		if (checkAll(Pl1)){
		    System.out.println(Player1 + "wins");
		    play = false;
		    return;
		}
		
	    }
	    else{
		while (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6){
		    System.out.println("Choose a column number " + Player2);
		    try{ 
			String choice = input.nextLine();
			if (choice.equals("reset"))
			    setBoard();
			System.out.println(board2String(board));
			i = Integer.parseInt(choice);
		    }
		    catch (Exception e) {
			System.out.println("Please enter a column number");
		    }
		} 
		move(Pl2, i);
		if (checkAll(Pl2)){
		    System.out.println(Player2 + " wins");
		    play = false;
		    return;
		}
			
		
	    }
	    go1 = !go1;	    
	}
	System.out.println(board2String(board));
    }

    public String board2String(char[][] array2D){
	String output = "";
	for (int i=array2D.length-1; i >-1;i--){
	    for (int j=0; j<array2D[i].length;j++){
		output = output + array2D[i][j] + " ";
	    }
	    output = output + "\n";
	}
	for (int h = 0; h <array2D[1].length; h++){
	    output = output + h + " ";
	}
	return output;
    }

    private boolean horizontalCheck(char icon){
	for (int i= board.length-1;i>0; i--){
	    for (int j =0; j<4; j++){
			if (board[i][j]== icon && 
				board[i][j+1]== icon && 
				board[i][j+2]== icon && 
				board[i][j+3]== icon){
					return true;
				}
	    }
	}
	return false;
    }
	
    private boolean verticalCheck(char icon) {
	for (int i = 5 ; i > 2 ; i--) {
	    for (int j = 0; j < 7; j++){
		if (board[i][j]== icon && 
		    board[i-1][j]== icon && 
		    board[i-2][j]== icon && 
		    board[i-3][j]== icon){
		    return true;
		}
	    }	
	}
	return false;
    }
	
    private boolean diagonalCheckRight(char icon) {
	for (int i = 5 ; i > 2 ; i--) {
	    for (int j = 0; j < 4; j++){
		if (board[i][j]== icon && 
		    board[i-1][j+1]== icon && 
		    board[i-2][j+2]== icon && 
		    board[i-3][j+3]== icon){
		    return true;
		}
	    }	
	}
	return false;
    }
	
    private boolean diagonalCheckLeft(char icon) {
	for (int i = 5 ; i > 2 ; i--) {
	    for (int j = 6; j > 2; j--){
		if (board[i][j]== icon && 
		    board[i-1][j-1]== icon && 
		    board[i-2][j-2]== icon && 
		    board[i-3][j-3]== icon){
		    return true;
		}
	    }	
	}
	return false;
    }

    public boolean checkAll(char icon){
	return (horizontalCheck(icon)||verticalCheck(icon)||diagonalCheckRight(icon)||diagonalCheckLeft(icon));	
    }
	
	public boolean isPlayerOneTurn() {
		return go1;
	}
	
	public void swapTurns(){
		go1 = !go1;
	}
}
