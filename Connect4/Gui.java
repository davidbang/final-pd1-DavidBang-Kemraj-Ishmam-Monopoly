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
        guiFrame.setSize(1000,1000);
        
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




        // set it to some image of a connect 4 piece, maybe put in action listener
        //ImageIcon icon = new    ImageIcon(this.getClass().getResource("/imagesg"));
        //slot.setIcon(icon);




        guiFrame.getContentPane().add(panel, BorderLayout.CENTER);


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
