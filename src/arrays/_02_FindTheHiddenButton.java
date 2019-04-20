/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton buttons1;
	JButton buttons2;
	JButton buttons3;
	JButton buttons4;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) throws InterruptedException {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() throws InterruptedException {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		JOptionPane.showInputDialog("Enter a positive number");
		
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		JButton buttons[] = new JButton[4];
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < buttons.length; i++) {
		JButton[] button= new JButton[4];
		
			buttons1.addActionListener(null);
			buttons2.addActionListener(null);
			buttons3.addActionListener(null);
			buttons4.addActionListener(null);
			panel.add(buttons1);
			panel.add(buttons2);
			panel.add(buttons3);
			panel.add(buttons4);
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		JFrame.MAXIMIZED_BOTH;
		//11. set the JFrame to visible.
		window.isVisible();
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		
		//14. Set the text of the JButton located at hiddenButton the read "ME"

		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		Thread.sleep(1000);
		//16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		
		//18. else tell them to try again
	}
}
