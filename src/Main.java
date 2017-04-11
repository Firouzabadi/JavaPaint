import GUI.*;

import java.awt.EventQueue;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {

				//GUILogin frame = new GUILogin();
				//frame.setVisible(true);
				//System.out.println("man");
				GUIpaint paintGUI = new GUIpaint();
				paintGUI.setVisible(true);

			}

		});

	}

}
