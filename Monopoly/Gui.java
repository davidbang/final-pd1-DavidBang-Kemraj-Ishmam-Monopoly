import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JFrame implements ActionListener{
	JPanel mypanel;
	JButton mybutton;
	JLabel mylabel;
	
	public Gui(){
		//this is the frame overall
		mypanel = new JPanel();
		
		/* this is a clickable button, 
		but needs an action listener to do something about it */
		mybutton = new JButton("OK");
		mybutton.addActionListener(this);
		
		//this puts a label next to the button
		mylabel = new JLabel("show something");
		
		//adds the parts to the overall button
		mypanel.add(mybutton);
		mypanel.add(mylabel);
		this.add(mypanel);
	}

	public static void main(String[] args) {
		//instantiates the Gui
		Gui first = new Gui();
		//sets the name on the Title Bar - This is Monopoly
		first.setTitle("Monopoly");
		//sets size in pixels, length x width
		first.setSize(700,700);
		/* 
		Sets the operation that will happen by default when the user initiates a "close" on this frame. You must specify one of the following choices:
		DO_NOTHING_ON_CLOSE (defined in WindowConstants): Don't do anything; require the program to handle the operation in the windowClosing method of a registered WindowListener object.
		HIDE_ON_CLOSE (defined in WindowConstants): Automatically hide the frame after invoking any registered WindowListener objects.
		DISPOSE_ON_CLOSE (defined in WindowConstants): Automatically hide and dispose the frame after invoking any registered WindowListener objects.
		EXIT_ON_CLOSE (defined in JFrame): Exit the application using the System exit method. Use this only in applications
		*/
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* sets whether the frame is visible when its parent is visible.
		Components are initially visible, except top level Components
		such as Frame Objects. (From Oracle docs) */
		first.setVisible(true);
	} 
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == mybutton) { //if where the event originated is the button
			//mylabel.setText("My button clicked"); //puts a label next to the button
			System.exit(0);
		}
	}
}

