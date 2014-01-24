import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swag {
    
    public static void addComponentsToPane(Container pane) {
	
	pane.setLayout(null);
	
	JButton b1 = new JButton("one");
        JButton b2 = new JButton("two");
        JButton b3 = new JButton("three");
	
        pane.add(b1);
        pane.add(b2);
        pane.add(b3);
	
	Insets insets = pane.getInsets();
        Dimension size = b1.getPreferredSize();
        b1.setBounds(insets.left, //shifts to right. Higher # -> farther to right (Xcor)
		     insets.top, //shifts down. Higher # -> farther down (Ycor)
                     size.width, //new width
		     size.height); //new height
        size = b2.getPreferredSize();
        b2.setBounds(55 + insets.left, 40 + insets.top,
                     size.width, size.height);
        size = b3.getPreferredSize();
        b3.setBounds(150 + insets.left, 15 + insets.top,
                     size.width, size.height);
    }
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Monopoly");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
	
        //Size and display the window.
        Insets insets = frame.getInsets();
        frame.setSize(300 + insets.left + insets.right,
                      125 + insets.top + insets.bottom);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
		    createAndShowGUI();
		}
 	    }
        }
    }