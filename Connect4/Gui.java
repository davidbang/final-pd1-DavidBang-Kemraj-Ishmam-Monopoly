import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   

public class Gui implements ActionListener{
    private JButton[] []slot = new JButton[6] [7]; 

    public static void main(String[] args) {
        new Gui();
    }

    public Gui()
    {
	JOptionPane pane = new JOptionPane ();

	String Player =  pane.showInputDialog(this 
					      ,"Enter names for Players in this format (Player1, Player2):");

	pane.setVisible (true);
	
	int a = 0;

	for (int i = 0; i < Player.length()- 1; i ++) {
	    if (Player.substring (i, i+1).equals(",")) {
		a = i;
	    }
	}

	ConnectFourBoard board = new ConnectFourBoard (Player.substring (0, a) , Player.substring (a +1));

        JFrame guiFrame = new JFrame();
       
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Connect 4");
        guiFrame.setSize(1000,1000);
	
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(6, 7));

	for (int i=0; i< 6; i++) {
            for (int j=0; j< 7; j++) {
		slot [i] [j]  = new JButton(i + "," + j);
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
	     for (int i = 0 ; i < 6; i ++) {	 
		     for (int j = 0; j < 7; j ++) {
			 if (e.getSource () == slot [i] [j]) {
			     if (slot[i] [j].getBackground() != Color.BLACK && slot [i] [j].getBackground()!= Color.RED) {
				 slot [i] [j].setBackground (Color.RED);
			     }
			 }
		     }
	     }
	 }
}





