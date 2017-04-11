package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class GUILogin extends JFrame {

  private JPanel contentPane;
  private JTextField username;
  private JTextField password;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          GUILogin frame = new GUILogin();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

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
    
    username = new JTextField();
    username.setBounds(191, 55, 143, 20);
    contentPane.add(username);
    username.setColumns(10);
    
    password = new JTextField();
    password.setBounds(191, 113, 143, 20);
    contentPane.add(password);
    password.setColumns(10);
    
    JLabel lblUsername = new JLabel("Username");
    lblUsername.setBounds(24, 57, 83, 14);
    contentPane.add(lblUsername);
    
    JLabel lblPassword = new JLabel("Password");
    lblPassword.setBounds(24, 115, 83, 14);
    contentPane.add(lblPassword);
    
    JButton btnLogin = new JButton("Login");
    btnLogin.setBounds(96, 197, 89, 23);
    contentPane.add(btnLogin);
    
    JButton btnCancel = new JButton("Cancel");
    btnCancel.setBounds(224, 197, 89, 23);
    contentPane.add(btnCancel);
  }
}