import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame /* implements ActionListener */{
	
	public Gui(){
	JPanel pane = new JPanel();
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	c.fill = GridBagConstraints.HORIZONTAL;
	
	
	//For each component to be added to this container:
	//...Create the component...
	//...Set instance variables in the GridBagConstraints instance...
	JButton roll;
	roll = new JButton("Roll");
	c.gridx = 0;
	c.gridy = 0; 
	c.weightx = 0.5;
	//c.weighty = 0.5;
	pane.add(roll, c);
	}
	
	public static void main(String[] args) {
		Gui one = new Gui();
		one.setTitle("Monopoly");
		one.pack(); //auto-sizes instead of setsize(width, height);
		one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		one.setVisible(true);
	}
}

//http://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html