package PWDRegistrationForm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.SpinnerListModel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;

public class PWDRegistrationForm extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PWDRegistrationForm frame = new PWDRegistrationForm();
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
	public PWDRegistrationForm() {
		setFont(new Font("Times New Roman", Font.BOLD, 20));
		setTitle("PWUD Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1350, 1050);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(12, 12, 12, 12, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 11, 1314, 989);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(12, 12, 12, 12, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(37, 35, 1243, 142);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("PWUD Registration Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 85));
		lblNewLabel.setBounds(108, 26, 1028, 92);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(37, 855, 1093, 98);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_2_1.setBackground(new Color(176, 224, 230));
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(541, 188, 739, 656);
		panel.add(panel_2_2);
		panel_2_2.setBorder(new MatteBorder(12, 12, 12, 12, (Color) new Color(95, 158, 160)));
		panel_2_2.setBackground(new Color(176, 224, 230));
		panel_2_2.setLayout(null);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(712, 12, 17, 630);
		panel_2_2.add(scrollBar_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 11, 719, 634);
		panel_2_2.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(12, 12, 12, 12, (Color) new Color(176, 196, 222)));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(37, 188, 494, 656);
		panel.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Surename:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(26, 27, 88, 21);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("Type Your Surname");
		textField.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(171, 27, 261, 21);
		panel_2.add(textField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Firstname:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(26, 59, 88, 21);
		panel_2.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Type Your Firstname");
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(171, 59, 261, 21);
		panel_2.add(textField_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Middle Name:");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(26, 91, 115, 21);
		panel_2.add(lblNewLabel_1_2_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Type Your Middle Name");
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(171, 93, 261, 21);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Age:");
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1.setBounds(26, 123, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setText("Type Your Age");
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(171, 125, 261, 21);
		panel_2.add(textField_3);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Date of Birth:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1.setBounds(26, 191, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("Gender:");
		lblNewLabel_1_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_1.setBounds(26, 155, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setBounds(171, 157, 106, 22);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_1.setBounds(171, 190, 47, 22);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_1_1.setBounds(228, 190, 47, 22);
		panel_2.add(comboBox_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_1_1_1.setBounds(285, 191, 69, 22);
		panel_2.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_2 = new JLabel("Address:");
		lblNewLabel_1_2_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2.setBounds(26, 223, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setText("Type Your Address");
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(171, 223, 261, 21);
		panel_2.add(textField_4);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1 = new JLabel("Phone No.:");
		lblNewLabel_1_2_1_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1.setBounds(26, 255, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1);
		
		textField_5 = new JTextField();
		textField_5.setText("Type Your Phone Number");
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(171, 255, 261, 21);
		panel_2.add(textField_5);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1_1 = new JLabel("Mother Maiden Name:");
		lblNewLabel_1_2_1_1_1_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1_1_1.setBounds(26, 319, 182, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setText("Type Your Phone Number");
		textField_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(171, 351, 261, 21);
		panel_2.add(textField_6);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1_1_1 = new JLabel("Surname:");
		lblNewLabel_1_2_1_1_1_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1_1_1_1.setBounds(26, 351, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1_1_1_1 = new JLabel("Firstname:");
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1.setBounds(26, 383, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setText("Type Your Phone Number");
		textField_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(171, 383, 261, 21);
		panel_2.add(textField_7);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1 = new JLabel("Middle Name:");
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1.setBounds(26, 415, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setText("Type Your Phone Number");
		textField_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(171, 415, 261, 21);
		panel_2.add(textField_8);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_1 = new JLabel("Father's Name:");
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_1.setBounds(26, 479, 124, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2 = new JLabel("Surname:");
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2.setBounds(26, 508, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2);
		
		textField_9 = new JTextField();
		textField_9.setText("Type Your Phone Number");
		textField_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_9.setColumns(10);
		textField_9.setBounds(171, 508, 261, 21);
		panel_2.add(textField_9);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2_1 = new JLabel("Firstname:");
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2_1.setBounds(26, 540, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2_1);
		
		textField_10 = new JTextField();
		textField_10.setText("Type Your Phone Number");
		textField_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_10.setColumns(10);
		textField_10.setBounds(171, 540, 261, 21);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("Type Your Phone Number");
		textField_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(171, 572, 261, 21);
		panel_2.add(textField_11);
		
		JLabel lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2_1_1 = new JLabel("Middle Name:");
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2_1_1.setBounds(26, 572, 115, 21);
		panel_2.add(lblNewLabel_1_2_1_1_1_2_1_1_1_1_1_1_1_2_1_1);

		
		
		
		
	}
}