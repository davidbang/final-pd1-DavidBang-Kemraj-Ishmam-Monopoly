import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiTest extends JFrame implements ActionListener{
    JPanel mypanel;
    JButton P1, P2, P3, P4;
    JLabel mylabel;
    
    public GuiTest(){
	//this is the frame overall
	mypanel = new JPanel(new BorderLayout());
	
	/* this is a clickable button, 
	   but needs an action listener to do something about it */
	P1 = new JButton("One Player");
	P2 = new JButton("Two Player");
	P3 = new JButton("Three Player");
	P4 = new JButton("Four Player");
	
	P1.addActionListener(this);
	
	//this puts a label next to the button
	mylabel = new JLabel("show something");
	
	//adds the parts to the overall button
	mypanel.add(P1, BorderLayout.PAGE_START);
	mypanel.add(P3, BorderLayout.LINE_END);
	mypanel.add(P2, BorderLayout.LINE_START);
	mypanel.add(P4, BorderLayout.PAGE_END);
	mypanel.add(mylabel);
	this.add(mypanel);
    }
    
    public static void main(String[] args) {
	//instantiates the Gui
	GuiTest first = new GuiTest();
	//sets the name on the Title Bar - This is Monopoly
	first.setTitle("Monopoly");
	//sets size in pixels, length x width
	first.setSize(700,700);
	first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	/* sets whether the frame is visible when its parent is visible.
	   Components are initially visible, except top level Components
	   such as Frame Objects. (From Oracle docs) */
	first.setVisible(true);
    } 
    
    public void actionPerformed(ActionEvent event) {
	if (event.getSource() == P1) { //if where the event originated is the button
	    mylabel.setText("initiate one Player Game"); //puts a label next to the button
	}
    }
}

