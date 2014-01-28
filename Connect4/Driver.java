import java.io.*;
import java.util.*;

public class Driver{

	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Player 1 name: ");
		String P1 = in.nextLine();
		System.out.print("Player 2 name: ");
		String P2 = in.nextLine();
		System.out.println("Making Game");
		ConnectFourBoard game = new ConnectFourBoard(P1, P2);
		System.out.println("Game Made");
		game.Play_Game();

	}

}
