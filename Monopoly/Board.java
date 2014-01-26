import java.util.*;
import java.io.*;

public class Board {
    public Tiles [] board;
    private boolean play, Double;
    protected Player P1, P2, P3, P4;
    protected String [] chanceC, communityC;
    protected Cards deck;
    private int doubleCount;
    
    
    public Board(String one, String t1, String two, String t2, String three, String t3, String four, String t4){
	doubleCount = 0;

	P1 = new Player(one, t1);
	P2 = new Player(two, t2);
	P3 = new Player(three, t3);
	P4 = new Player(four, t4);


	//sub classes Property and EventSquares in array of Tiles
	board = new Tiles [40];
	board [0] = new EventTile("Go");
	board [1] = new Property("Mediterranean");
	board [2] = new EventTile("C.C.");
	board [3] = new Property("Baltic");
	board [4] = new EventTile("Income Tax");
	board [5] = new Property("Reading");
	board [6] = new Property("Oriental");
	board [7] = new EventTile("Chance");
	board [8] = new Property("Vermont");
	board [9] = new Property("Connecticut");
	//Begin 2nd Side
	board [10] = new EventTile("Jail");
	board [11] = new Property("St. Charles");
	board [12] = new Property("Electric");
	board [13] = new Property("States");
	board [14] = new Property("Virginia");
	board [15] = new Property("Pennsylvania R.R.");
	board [16] = new Property("St. James");
	board [17] = new EventTile("C.C.");
	board [18] = new Property("Tennessee");
	board [19] = new Property("New York");
	//Begin 3rd Side
	board [20] = new EventTile("Free Parking");
	board [21] = new Property("Kentucky");
	board [22] = new EventTile("Chance");
	board [23] = new Property("Indiana");
	board [24] = new Property("Illinois");
	board [25] = new Property("B&O");
	board [26] = new Property("Atlantic");
	board [27] = new Property("Ventnor");
	board [28] = new Property("Water");
	board [29] = new Property("Marvin");
	//Begin Last Side
	board [30] = new EventTile("Go To Jail");
	board [31] = new Property("Pacific");
	board [32] = new Property("North Carolina");
	board [33] = new EventTile("C.C.");
	board [34] = new Property("Pennsylvania Ave");
	board [35] = new Property("Short Line");
	board [36] = new EventTile("Chance");
	board [37] = new Property("Park Place");
	board [38] = new EventTile("Luxury Tax");
	board [39] = new Property("Boardwalk");
	
 	//creates cards
	chanceC = new String [16];
	deck = new Cards ();
	
	for (int i = 0; i < 16; i ++) {
	    chanceC [i] = deck.makechancedeck (i);
	}
	
	String [] communityc = new String [16];
	
	for (int i = 0; i < 16; i ++) {
	    communityC [i] = deck.makecommunitydeck (i);
	}	
    
    }
    
    
    
    public int rollDie () {
	Random R = new Random ();
	return R.nextInt (6) + 1;
	//int die2 = R.nextInt (6) + 1;
	//need location variable for player
	//a.changelocation();
    }
    
    public void playGame (){
	while (play) {
	    //	P1.playerTurn;
	    //	P2.playerTurn;
	    //	P3.playerTurn;
	    //	P4.playerTurn;
	}
	//System.out.println ("Game Over");
    }

    public void move (Player playah, int spaces){
	int prevLoc = playah.location;
	playah.location = playah.location + spaces;
	if (playah.location%40 <prevLoc%40)
	    playah.addMoney(200);
	
    }

    public void playerTurn (Player thing){
	int die1 = rollDie();
	int die2 = rollDie();
	int roll = die1 + die2;
	Double = false;
	
	if (die1 == die2){
	    Double = true;
	    doubleCount ++;
	}
	this.move(thing, roll);

	
	if (Double == true && doubleCount < 3)
	    playerTurn (thing);

	doubleCount=0;

	//then add stuff for property management etc.
	 
    }
    
}
