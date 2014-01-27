import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   

public class GuiSample implements ActionListener{

    public static void main(String[] args) {
        
        new GuiSample();
	
    }

    public GuiSample()
    {
        JFrame guiFrame = new JFrame();
       
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Monopoly");
        guiFrame.setSize(900,900);
  
	String [] PlayerNumber = {"1Player", "2Players", "3Players", "4Players"};

	JComboBox Players = new JComboBox(PlayerNumber);

	JPanel panel = new JPanel ();
	//	panel.addActionListener (this);
	panel.add (Players);
	panel.setVisible (true);
	guiFrame.add ( panel, BorderLayout.NORTH);
	
	ImageIcon img = new ImageIcon("images/Board.jpg");
	JLabel label = new JLabel(" ", img, JLabel.CENTER);		
	guiFrame.getContentPane().add(label);

	guiFrame.validate();
	guiFrame.setVisible(true);
    
    }
	 @Override 
	     public void actionPerformed (ActionEvent e) {
	     /*if (event.getSource() == panel) {
	       panel.setVisible (false);	
	       JOptionPane.showMessageDialog(null, "You have selected" );
	       }*/
	 }
    
}

