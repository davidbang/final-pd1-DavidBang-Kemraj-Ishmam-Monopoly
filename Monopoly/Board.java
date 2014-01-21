import java.util.*;
import java.io.*;

public class Board {
    public Tiles [][] board;
    private boolean play;
    protected Player P1, P2, P3, P4;

    
    public Board() {
		//sub classes Property and EventSquares in array of Tiles
		board = new Tiles [4] [9];
		board [0] [0] = new EventTile("Go");
		board [0] [1] = new Property("Mediterranean");
		board [0] [2] = new EventTile("C.C.");
		board [0] [3] = new Property("Baltic");
		board [0] [4] = new EventTile("Income Tax");
		board [0] [5] = new Property("Reading");
		board [0] [6] = new Property("Oriental");
		board [0] [7] = new EventTile("Chance");
		board [0] [8] = new Property("Vermont");
		board [0] [9] = new Property("Connecticut");
		//Begin 2nd Side
		board [1] [0] = new EventTile("Jail");
		board [1] [1] = new Property("St. Charles");
		board [1] [2] = new Property("Electric");
		board [1] [3] = new Property("States");
		board [1] [4] = new Property("Virginia");
		board [1] [5] = new Property("Pennsylvania R.R.");
		board [1] [6] = new Property("St. James");
		board [1] [7] = new EventTile("C.C.");
		board [1] [8] = new Property("Tennessee");
		board [1] [9] = new Property("New York");
		//Begin 3rd Side
		board [2] [0] = new EventTile("Free Parking");
		board [2] [1] = new Property("Kentucky");
		board [2] [2] = new EventTile("Chance");
		board [2] [3] = new Property("Indiana");
		board [2] [4] = new Property("Illinois");
		board [2] [5] = new Property("B&O");
		board [2] [6] = new Property("Atlantic");
		board [2] [7] = new Property("Ventnor");
		board [2] [8] = new Property("Water");
		board [2] [9] = new Property("Marvin");
		//Begin Last Side
		board [3] [0] = new EventTile("Go To Jail");
		board [3] [1] = new Property("Pacific");
		board [3] [2] = new Property("North Carolina");
		board [3] [3] = new EventTile("C.C.");
		board [3] [4] = new Property("Pennsylvania Ave");
		board [3] [5] = new Property("Short Line");
		board [3] [6] = new EventTile("Chance");
		board [3] [7] = new Property("Park Place");
		board [3] [8] = new EventTile("Luxury Tax");
		board [3] [9] = new Property("Boardwalk");
		
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