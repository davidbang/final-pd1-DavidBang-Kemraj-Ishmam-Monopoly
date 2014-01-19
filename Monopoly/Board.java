import java.util.*;
import java.io.*;

public class Board {
    public Tiles [][] board;
    private boolean play;
    protected Player P1, P2, P3, P4;

    
    public Board() {
		//sub classes Property and EventSquares in array of Tiles
		board = new Tiles [4] [10];
		board [0] [1] = new Property("Mediterranean");
		// will add more to board later, with each square having a different property
    }
	    

    Random R = new Random ();
    public void move (Player a) {
		int b = R.nextInt (11) + 2;
		//need location variable for player
		//a.changelocation();
    }
    
    public void playGame (){
		while (play) {
		//	P1.move;
		//	P2.move;
		//	P3.move;
		//	P4.move;
		}
		System.out.println ("Game Over");
    }
	
}