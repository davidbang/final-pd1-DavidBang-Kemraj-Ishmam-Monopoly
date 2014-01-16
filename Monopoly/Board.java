import java.util.*;
import java.io.*;

public class Board {
    protected Property [][] board;
    private boolean play;
    protected Player P1, P2, P3, P4;

    
    public Board {
	board = new char [4] [10];
	board [0] [0] = new Propert("Start");
	// will add more to board later, with each square having a different property
    }
	    

    Random R = new Random ();
    public void move (Player a) {
	int b = r.nextInt (11) + 2;
	//need location variable for player
	//a.changelocation();
    }
    
    public boolean Game (){
	while (play) {
	    P1.move;
	    P2.move;
	    P3.move;
	    P4.move;
	}
	return play;
	System.out.println ("Game Over");
    }
	
