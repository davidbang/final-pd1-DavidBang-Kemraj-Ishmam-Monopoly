import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   

public class Gui implements ActionListener{
    //these will be the individual buttons that correspond as a connect 4 piece (they will turn red or black)
    private JButton[] []slot = new JButton[6] [7]; 

    private ConnectFourBoard board;
    private String Player1, Player2;

    //this will keep track of the player's name and turn.
    private JTextPane display, display2;

    //calls Gui interface
    public static void main(String[] args) {
        new Gui();
    }
   

 //resets the Gui interface to a clean connect 4 board
    public void reset () {
	for (int i=0; i< 6; i++) {
	    for (int j=0; j< 7; j++) {
		//makes all the buttons back to its default color
		slot [i] [j].setBackground (null);
	    }
	}
	board = new ConnectFourBoard (Player1,Player2);
    }

    public myJButton makeButton(String imgName,
				String actionCommand,
				String toolTipText) {
	//looks for the image
	String imgLocation = "images/" + imgName + ".jpg";
				
	//creating and initializing the button
	myJButton button = new myJButton();
	button.setActionCommand(actionCommand);
	button.setToolTipText(toolTipText);
	button.addActionListener(this);
	button.setIcon(new ImageIcon(imgLocation));
		
	return button;
    }

    public Gui()
    {
	//intializes pane, that will be used to make the input boxes.
        JOptionPane pane = new JOptionPane ();

	//lets a player enter his or her name
	try{
	    Player1 =  pane.showInputDialog("Enter name for Player1:");
	    pane.setVisible (true);
	    // if a name is not entered or the person closes the input box or presses cancel, the game will exit.
	    if (Player1.equals ("")){
		System.exit (0);
	    }
	}
	//catches nullpointerexception errors
	catch  (Exception NullPointerException) {
	    System.exit (0);
	}

	//same thing but for player 2
        JOptionPane pane2 = new JOptionPane ();

	try{
	    Player2 =  pane2.showInputDialog("Enter name for Player2:");
	    pane2.setVisible (true);

	    if (Player1.equals ("")){
		System.exit (0);
	    }
	}
	catch (Exception NullPointerException) {
	    System.exit (0);
	}

	//intializes board, with player names
        board = new ConnectFourBoard (Player1 , Player2);

        JFrame guiFrame = new JFrame();
	//sets up interface
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Connect 4");
        guiFrame.setSize(500,500);
        
	//sets up panel layout for board, so that it is 6 by 7.
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 7));

	//sets up each button into the panel/grid to make up the board. (click the buttons to change the color)
        for (int i=0; i< 6; i++) {
            for (int j=0; j< 7; j++) {
                slot [i] [j]  = new myJButton(i, j);
		//enables us to see if the button is clicked and then to perform an action if it is.
                slot [i] [j].addActionListener(this);
                slot [i] [j].setPreferredSize (new Dimension (20, 20));
		//add button to the panel/grid
                panel.add(slot[i] [j]);
            }
        }
	
	//creates the toolbar, that has the new game/restart button and the display for the players' name and turn.
	JToolBar toolbar = new JToolBar();
	toolbar.setFloatable(false); //can't move the toolbar anymore
	//new game
	JButton b = makeButton("new_game", "New game", "Starts a new game");
	toolbar.add(b);

	//creates the display/textpane for each player.
	display = new JTextPane();
	display.setSize(5, 5);

	//sets it so that the text in the textpane cannot be typed over
	display.setEditable(false);
	display.setBackground (Color.RED);
	display.setForeground(Color.BLUE);
	display.setText ("Player 1:" + Player1);
	
	
	display2 = new JTextPane();
	display2.setSize(5, 5);

	display2.setEditable(false);
	display2.setBackground (Color.BLACK);
	display2.setForeground(Color.WHITE);
	display2.setText ("Player 2:" + Player2);
	
	//adds display to the toolbars
	toolbar.add (display);
	toolbar.add (display2);

	//centers the board/grid/panel, puts the toolbar at the top of the Gui.
        guiFrame.getContentPane().add(panel, BorderLayout.CENTER);
	guiFrame.getContentPane().add(toolbar, BorderLayout.PAGE_START);

	//makes the Gui interface visible and workable
        guiFrame.validate();
        guiFrame.setVisible(true);
    
    }
    // overrides actionPerformed so that when the buttons (slots) are clicked, they will change colors depending on what player's turn it was.
    @Override 
    public void actionPerformed (ActionEvent e) {
	myJButton b = (myJButton)e.getSource();
	int buttonCol = b.getCol();
	for (int i = 5; i > -1; i--) { //starts at the bottom of the board
	    //checks if the bottom of the board already has been marked or been taken by a player, so it looks for closes to the bottom empty button in that column
	    if (slot [i] [buttonCol].getBackground() != Color.BLACK && slot [i] [buttonCol].getBackground()!= Color.RED) {
		//if it is Player1's turn, the button turns red and the player has added a connect 4 piece to the column.
		if (board.isPlayerOneTurn()) {
		    slot [i] [buttonCol].setBackground(Color.RED);
		    board.aidMove ('X', i, buttonCol);
		    //swaps turn and changes the display to match whose turn it is now.
		    board.swapTurns();
		    display2.setText ("Player 2:" + Player2 + "'s Turn");
		    display.setText ("Player 1:" + Player1);
		    break;
		}
		else {
		    //if it is Player2's turn, the button turns black
		    slot [i] [buttonCol].setBackground(Color.BLACK);
		    board.aidMove ('O', i, buttonCol);
		    board.swapTurns();
		    display2.setText ("Player 2:" + Player2);
		    display.setText ("Player 1:" + Player1 + "'s Turn");
		    break;
		}
	    }
	}
	//if the new game/restart button (the one in the top left corner in the toolbard) is pressed, the board resets.
	if (e.getActionCommand().equals("New game")) {
	    reset();
	}
	int n = - 1;
	//checks if there is a row, column, or diagonal of 4, and if so, that player wins.
	if( board.checkAll ('X')) {
	    //you may choose to play again and reset the board or to not play again  and the game will exit
	    n = JOptionPane.showConfirmDialog(null, Player1 + " WINS. Play Again?", Player1 + " WINS", JOptionPane.YES_NO_OPTION);
	    if (n == 0) {
		reset();
	    }
	    else {
		System.exit (0);
	    }

	}
	if (board.checkAll ('O') ){
		    
	    n = JOptionPane.showConfirmDialog(null, Player2 + " WINS. Play Again?", Player2 + " WINS", JOptionPane.YES_NO_OPTION);
	    if (n == 0) {
		reset();
	    }
	    else {
		System.exit (0);
	    }
	}
	//if the board is full or 42 moves have been made, and noone has won yet, the game is declared a draw and you can choose to play again.
	if (board.getMoves() >= 42) {
			n = JOptionPane.showConfirmDialog(null, "It's a draw! Play Again?", "DRAW!", JOptionPane.YES_NO_OPTION);
			if (n == 0) {
			reset();
		    }
		    else {
			System.exit (0);
		    }
        }

    }

}

