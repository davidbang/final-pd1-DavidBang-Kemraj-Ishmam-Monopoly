import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   

public class Gui implements ActionListener{

    public static void main(String[] args) {
        
        new Gui();
	
    }

    public Gui()
    {
        JFrame guiFrame = new JFrame();
       
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Connect 4");
        guiFrame.setSize(900,900);
	
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(6, 7));

	for (int i=1; i<=6; i++) {
            for (int j=1; j<=7; j++) {
		JButton slot  = new JButton();
		slot.addActionListener(this);
		slot.setPreferredSize (new Dimension (20, 20));
		panel.add(slot);
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
	     // button.setIcon (icon)
	 }
    
}

