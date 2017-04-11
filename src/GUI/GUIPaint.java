package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Shape.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.invoke.SwitchPoint;

public class GUIPaint extends JFrame {

	Graphics g = getGraphics();
	private String selectedShape;
	private String selectedColor;
	private int xStart, xEnd, yStart, yEnd;
	int user_id = 1;

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIPaint frame = new GUIPaint();
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
	public GUIPaint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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

				switch (selectedShape) {
				case "Circle":
					Circle circle = new Circle(xStart, yStart, xEnd, yEnd, selectedColor, user_id);
					circle.drawShape();
					break;
				case "Rectangle":

					Rectangle rectangle = new Rectangle(xStart, yStart, Math.abs(xEnd - xStart),
							Math.abs(yEnd - yStart), selectedColor, user_id);
					rectangle.drawShape();
					break;
				case "Line":
					Line line = new Line(xStart, yStart, xEnd, yEnd, selectedColor, user_id);
					line.drawShape(g);
					break;
				}

			}
		});
		panel.setBackground(Color.WHITE);
		panel.setBounds(28, 31, 460, 374);
		contentPane.add(panel);

		// Line Button ===========================

		JButton btnLine = new JButton("Line");
		btnLine.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedShape = "Line";
			}
		});
		btnLine.setBounds(518, 31, 109, 23);
		contentPane.add(btnLine);

		// Circle Buttton ========================

		JButton btnCircle = new JButton("Circle");
		btnCircle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedShape = "Cirlcle";
			}
		});
		btnCircle.setBounds(518, 65, 109, 23);
		contentPane.add(btnCircle);

		// Rectangle Button======================

		JButton btnRectangle = new JButton("Rectangle");
		btnRectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedShape = "Rectangle";
			}
		});
		btnRectangle.setBounds(518, 104, 109, 23);
		contentPane.add(btnRectangle);

		// Colores radio bottin===================

		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedColor = "Red";
				g.setColor(Color.RED);
			}
		});
		buttonGroup.add(rdbtnRed);
		rdbtnRed.setBounds(496, 172, 109, 23);
		contentPane.add(rdbtnRed);

		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnRed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedColor = "Blue";
				g.setColor(Color.BLUE);
			}
		});
		buttonGroup.add(rdbtnBlue);
		rdbtnBlue.setBounds(498, 199, 109, 23);
		contentPane.add(rdbtnBlue);

		JRadioButton rdbtnYellow = new JRadioButton("Yellow");
		rdbtnRed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedColor = "Yellow";
				g.setColor(Color.YELLOW);
			}
		});
		buttonGroup.add(rdbtnYellow);
		rdbtnYellow.setBounds(498, 226, 109, 23);
		contentPane.add(rdbtnYellow);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(518, 366, 89, 23);
		contentPane.add(btnExit);
	}
}