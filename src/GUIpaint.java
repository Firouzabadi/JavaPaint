import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIpaint extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	int xStart, yStart,xEnd,yEnd,shape_iduser;
	String type,shapeColor;
	/**
	 * Create the frame.
	 */
	public GUIpaint() {
		
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button_1 = new JButton("دایره");
		button_1.setBounds(556, 91, 87, 25);
		contentPane.add(button_1);

		JButton button = new JButton("مستطیل");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(556, 19, 89, 25);
		contentPane.add(button);

		JButton button_2 = new JButton("خط");
		button_2.setBounds(556, 56, 89, 25);
		contentPane.add(button_2);

		JRadioButton radioButton = new JRadioButton("قرمز");
		buttonGroup.add(radioButton);
		radioButton.setBounds(544, 210, 93, 23);
		contentPane.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("آبی");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(543, 159, 95, 25);
		contentPane.add(radioButton_1);
		

		JRadioButton radioButton_2 = new JRadioButton("مشکی");
		buttonGroup.add(radioButton_2);
		radioButton_2.setSelected(true);
		radioButton_2.setBounds(543, 185, 87, 23);
		contentPane.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("سبز");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(544, 237, 149, 23);
		contentPane.add(radioButton_3);

		JButton button_3 = new JButton("خروج");
		button_3.setBounds(538, 371, 117, 25);
		contentPane.add(button_3);

		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				xStart = e.getX();
				yStart = e.getY();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				xEnd = e.getX();
				yEnd = e.getY();
			}
			Shape newShape = new Shape(xStart, yStart, xEnd, yEnd, type, shapeColor, shape_iduser);
		});
		panel.setBackground(Color.WHITE);
		panel.setBounds(6, 1, 500, 500);
		contentPane.add(panel);
	}
}
