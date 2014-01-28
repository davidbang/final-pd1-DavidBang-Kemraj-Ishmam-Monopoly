import java.io.*;
import java.util.*;

public class ConnectFourBoard{
    public boolean go1, play;
    public char [][] board;
    public int MoveRow, MoveCol, row;
    public String Player1, Player2;
    public Scanner input;
    public char Pl1, Pl2;
    
    public ConnectFourBoard(String P1, String P2){
	Player1 = P1;
	Player2 = P2;
	this.board = new char [6][7];
	go1 = true;
	Pl1 = 'X';
	Pl2 = 'O';
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
	    System.out.println("_________________________________________________________________________________________________");
	    System.out.println("Current Board:");
	    System.out.println(board2String(board));
	    if (go1){
		System.out.println("Choose a column number " + Player1);
		int i = input.nextInt();
		move(Pl1, i);
	    }
	    else{
		System.out.println("Choose a column number " + Player2);
		int i = input.nextInt();
		move(Pl2, i);
	    }
	    go1 = !go1;	    
	}
    }

    public String board2String(char[][] array2D){
	String output = "";
	for (int i=0; i <array2D.length;i++){
	    for (int j=0; j<array2D[i].length;j++){
		output = output + array2D[i][j] + " ";
	    }
	    output = output + "\n";
	}
	for (int i = 0; i <array2D[i].length; i++){
	    output = output + i + " ";
	}
	return output;
    }


}
