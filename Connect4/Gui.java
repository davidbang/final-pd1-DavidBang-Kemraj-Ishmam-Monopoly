import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   

public class Gui implements ActionListener{
    private JButton[] []slot = new JButton[6] [7]; 
    private ConnectFourBoard board;
    private String Player1, Player2;


    public static void main(String[] args) {
        new Gui();
    }

    public void reset () {
	for (int i=0; i< 6; i++) {
	    for (int j=0; j< 7; j++) {
		slot [i] [j].setBackground (null);
	    }
	}
	board = new ConnectFourBoard (Player1,Player2);
    }

    public myJButton makeButton(String imgName,
				String actionCommand,
				String toolTipText) {
	//look for the image
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

        JOptionPane pane = new JOptionPane ();

	try{

	    Player1 =  pane.showInputDialog("Enter name for Player1:");
	    pane.setVisible (true);
	    if (Player1.equals ("")){
		System.exit (0);
	    }
	}
	catch  (Exception NullPointerException) {
	    System.exit (0);
	}


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


        board = new ConnectFourBoard (Player1 , Player2);


        JFrame guiFrame = new JFrame();
       
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Connect 4");
        guiFrame.setSize(500,500);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 7));


        for (int i=0; i< 6; i++) {
            for (int j=0; j< 7; j++) {
                slot [i] [j]  = new myJButton(i, j);
                slot [i] [j].addActionListener(this);
                slot [i] [j].setPreferredSize (new Dimension (20, 20));
                panel.add(slot[i] [j]);
            }
        }

	JToolBar toolbar = new JToolBar();
	toolbar.setFloatable(false); //can't move the toolbar anymore
	//new game
	JButton b = makeButton("new_game", "New game", "Starts a new game");
	toolbar.add(b);

	JTextPane display = new JTextPane();
	display.setSize(5, 5);

	display.setEditable(false);
	display.setBackground (Color.RED);
	display.setForeground(Color.BLUE);
	display.setText ("Player 1:" + Player1);
	
	
	JTextPane display2 = new JTextPane();
	display2.setSize(5, 5);

	display2.setEditable(false);
	display2.setBackground (Color.BLACK);
	display2.setForeground(Color.WHITE);
	display2.setText ("Player 2:" + Player2);
	
	toolbar.add (display);
	toolbar.add (display2);
	


        // set it to some image of a connect 4 piece, maybe put in action listener
        //ImageIcon icon = new    ImageIcon(this.getClass().getResource("/imagesg"));
        //slot.setIcon(icon);




        guiFrame.getContentPane().add(panel, BorderLayout.CENTER);
	guiFrame.getContentPane().add(toolbar, BorderLayout.PAGE_START);

        guiFrame.validate();
        guiFrame.setVisible(true);
    
    }
        
    @Override 
    public void actionPerformed (ActionEvent e) {
	myJButton b = (myJButton)e.getSource();
	int buttonCol = b.getCol();
	for (int i = 5; //starting at bottom of board
	     i > -1; 
	     i--) {
	    if (slot [i] [buttonCol].getBackground() != Color.BLACK && slot [i] [buttonCol].getBackground()!= Color.RED) {
		if (board.isPlayerOneTurn()) {
		    slot [i] [buttonCol].setBackground(Color.RED);
		    board.aidMove ('X', i, buttonCol);
		    board.swapTurns();
		    break;
		}
		else {
		    slot [i] [buttonCol].setBackground(Color.BLACK);
		    board.aidMove ('O', i, buttonCol);
		    board.swapTurns();
		    break;
		}
	    }
	}
	if (e.getActionCommand().equals("New game")) {
	    reset();
	}
	int n = - 1;
	if( board.checkAll ('X')) {
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
    }

}
