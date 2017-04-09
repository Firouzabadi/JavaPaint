import java.awt.EventQueue;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin();
					frame.setVisible(true);
					if(GUILogin.userIsValid == true){
						System.out.println("man");
					GUIpaint frame1 = new GUIpaint();
					frame1.setVisible(true);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
		});
	
	
	
	
	}
	
	
}
