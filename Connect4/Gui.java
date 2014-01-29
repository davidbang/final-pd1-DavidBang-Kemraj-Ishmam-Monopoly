import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   


public class Gui implements ActionListener{
    private JButton[] []slot = new JButton[6] [7]; 
    private ConnectFourBoard board;


    public static void main(String[] args) {
        new Gui();
    }


    public Gui()
    {

        JOptionPane pane = new JOptionPane ();


        String Player1 =  pane.showInputDialog("Enter name for Player1:");


        pane.setVisible (true);

        JOptionPane pane2 = new JOptionPane ();


        String Player2 =  pane2.showInputDialog("Enter name for Player2:");
     
	pane2.setVisible (true);

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
		if( board.checkAll ('X')) {
		    JOptionPane.showMessageDialog(null, "Player 1 WINS");
        
		}
		if (board.checkAll ('O') ){
		    JOptionPane.showMessageDialog(null, "Player 2 WINS");

		}
	}
}

						   
					
      
