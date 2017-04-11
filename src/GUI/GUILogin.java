package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class GUILogin extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JLabel lblStatues;
	static boolean userIsValid;
	private JPasswordField passwordField;

	/**
	 * Create the frame.
	 */
	public GUILogin() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("نام کاربری");
		label.setBounds(75, 52, 70, 15);
		contentPane.add(label);

		usernameField = new JTextField();
		usernameField.setBounds(184, 51, 114, 19);
		contentPane.add(usernameField);
		usernameField.setColumns(10);

		
		passwordField = new JPasswordField();
		passwordField.setBounds(310, 105, -134, 25);
		contentPane.add(passwordField);
		
		JLabel label_1 = new JLabel("کلمه عبور");
		label_1.setBounds(74, 105, 70, 15);
		contentPane.add(label_1);

		JButton button = new JButton("ورود");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ConnectionDB connectDB = new ConnectionDB();
				connectDB.connection();
				

				try {
					String inputUsername = usernameField.getText();
					@SuppressWarnings("deprecation")
					char[] inputPassword = passwordField.getPassword();
					String sql = "select user.password from user where user.username= '" + inputUsername + "'; ";

					ResultSet rs;

					rs = connectDB.stmt.executeQuery(sql);
					while (rs.next()) {
						String inputPass = rs.getString("password");

						if (inputPass.equals(inputPassword)) {
							userIsValid = true;
							lblStatues.setText("خوش آمدید");
							System.out.println(userIsValid);
							User newUser = new User(inputUsername, inputPassword);

						} else {

							lblStatues.setText("شناسه عبور معتبر نیست");
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				connectDB.closing();
			}
		});
		button.setBounds(181, 161, 117, 25);
		contentPane.add(button);

		lblStatues = new JLabel("");
		lblStatues.setBounds(138, 213, 187, 15);
		contentPane.add(lblStatues);
	
	}
}
