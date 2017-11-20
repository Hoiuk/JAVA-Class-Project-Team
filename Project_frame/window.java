package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;

public class Window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(70, 10, 85, 23);
		panel.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(70, 42, 85, 23);
		panel.add(textField_1);
		
		Button button = new Button("Login");
		button.setBounds(170, 42, 76, 23);
		panel.add(button);
		
		Label label = new Label("ID");
		label.setBounds(20, 10, 33, 23);
		panel.add(label);
		
		Label label_1 = new Label("PW");
		label_1.setBounds(20, 42, 33, 23);
		panel.add(label_1);
	}
}
