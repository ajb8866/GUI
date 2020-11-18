import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest1 {

	public static void main(String[] args) {
		final int W  = 400;
		final int H  = 466;
		// TODO Auto-generated method stub
		//all program sequntitial up until now
		// END
		
	
		JFrame frame = new JFrame("Dark Wave");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(W, H);
		frame.setLocationRelativeTo(null);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		JButton b1 = new JButton("Men Who Stare");
		JButton b2 = new JButton("at goats");
		JButton b3 = new JButton("at code monkey");
		JButton b14 = new JButton("at the wall");
		JButton dontPush = new JButton("my finger is on the button");
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Stop Starring!!!");
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.add(b1);
		frame.add(b2);
		frame.add(b14);
		frame.add(b3);
		frame.add(dontPush);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
	}

}
