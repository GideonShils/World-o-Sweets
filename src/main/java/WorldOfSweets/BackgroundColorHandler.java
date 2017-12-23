package WorldOfSweets;

import javax.swing.*;
import java.awt.event.*;

public class BackgroundColorHandler {
	private JMenuItem red;
	private JMenuItem blue;
	private JMenuItem green;

	WorldOfSweets wos;

	public BackgroundColorHandler(WorldOfSweets wos) {
		this.wos = wos;
	}

	public JMenuItem backgroundRed() {

		red = new JMenuItem("Red");

		red.getAccessibleContext().setAccessibleDescription("Change background to red.");

		ActionListener redlistener = new RedListener();
		red.addActionListener(redlistener);

		return red;
	}

	public JMenuItem backgroundBlue() {

		blue = new JMenuItem("Blue");

		blue.getAccessibleContext().setAccessibleDescription("Change background to blue.");

		ActionListener bluelistener = new BlueListener();
		blue.addActionListener(bluelistener);

		return blue;
	}

	public JMenuItem backgroundGreen() {

		green = new JMenuItem("Green");

		green.getAccessibleContext().setAccessibleDescription("Change background to green.");

		ActionListener greenlistener = new GreenListener();
		green.addActionListener(greenlistener);

		return green;
	}

	private class RedListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			wos.board_panel.setBackground(new java.awt.Color(255, 143, 143));
		}
	}

	private class BlueListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			wos.board_panel.setBackground(new java.awt.Color(143, 236, 255));
		}
	}

	private class GreenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			wos.board_panel.setBackground(new java.awt.Color(181, 255, 143));
		}
	}

}
