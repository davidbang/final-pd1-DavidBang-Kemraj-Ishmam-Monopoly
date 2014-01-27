import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swag implements ActionListener{
   
    public static void addComponentsToPane(Container pane) {
	
	pane.setLayout(null);
	Insets insets = pane.getInsets();
	Dimension size;
	
	//sets up the background of the Panel
	ImageIcon img = new ImageIcon("images/Board.jpg");
	JLabel bg = new JLabel(img);
	pane.add(bg);
		size = bg.getPreferredSize();
		bg.setBounds(insets.left,
					45 + insets.top,//leaves room for TB
					600, 600);		
	//adds the toolbar
	JToolBar tb = new JToolBar();
	pane.add(tb);
	size = tb.getPreferredSize();
	tb.setBounds(insets.left, insets.top,800,45);
	addToolBarButtons(tb);
    }
	
	protected static JButton makeButton(String imgName,
								String actionCommand,
								String toolTipText) {
		//look for the image
		String imgLocation = "images/" + imgName + ".jpg";
				
		//creating and initializing the button
		JButton butt = new JButton();//lol buttocks
		butt.setActionCommand(actionCommand);
		butt.setToolTipText(toolTipText);
		//button.addActionListener(this);
		butt.setIcon(new ImageIcon(imgLocation));
		
		return butt;
	}
	
	private static void addToolBarButtons(JToolBar ToolB) {
		JButton tbb = null; 
		//first button - dice roll
		tbb = makeButton("dice", "roll", "Rolls the dice");
		ToolB.add(tbb);
		
		//second button - properties
		tbb = makeButton("prop", "checkProp", "Check a Property/Attribute");
		ToolB.add(tbb);//What should this do? - Kemraj
		
		//third button - player attributes
		tbb = makeButton("player", "checkPlayer", "Check a Player");
		ToolB.add(tbb);//What should this do? - Kemraj
		
		//Don't know what to do for those two buttons above. - Kemraj
		
		
	}
	
       private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame();
	frame.setTitle("Monopoly");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.

        addComponentsToPane(frame.getContentPane());
		
        //Size and display the window.
        Insets insets = frame.getInsets();
        frame.setSize(620 + insets.left + insets.right,
                      680 + insets.top + insets.bottom);
        frame.setVisible(true);
    }
    
	public void actionPerformed(ActionEvent e){
		if ("roll".equals(e.getActionCommand())){
			slate.turns ++;
			slate.playerTurn(slate.currentPlayer());
			//automatically moves to next player
			// graphically move the player on the GUI???
		}
	}
	
	
    
	public static void main(String[] args) {
	    new Swag ();
	    Board slate = new Board("one", "red", "two", "yellow", "three", "blue", "four", "green");
	    javax.swing.SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
			createAndShowGUI();
		    }
		});
    }
}
