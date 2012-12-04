import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.FlowLayout;


public class PersonGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonGUI frame = new PersonGUI();
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
	public PersonGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnFortst = new JButton("Forts\u00E6t");
		panel.add(btnFortst);
		
		JButton btnLuk = new JButton("Luk");
		panel.add(btnLuk);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblFornavn = new JLabel("Fornavn");
		lblFornavn.setBounds(0, 0, 40, 14);
		panel_1.add(lblFornavn);
		
		textField = new JTextField();
		textField.setBounds(0, 14, 184, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblEfternavn = new JLabel("Efternavn");
		lblEfternavn.setBounds(0, 42, 48, 14);
		panel_1.add(lblEfternavn);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 56, 184, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(0, 84, 39, 14);
		panel_1.add(lblAdresse);
		
		textField_2 = new JTextField();
		textField_2.setBounds(0, 98, 184, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPostnummer = new JLabel("Postnummer");
		lblPostnummer.setBounds(0, 126, 59, 14);
		panel_1.add(lblPostnummer);
		
		textField_5 = new JTextField();
		textField_5.setBounds(0, 140, 184, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblLand = new JLabel("Land");
		lblLand.setBounds(0, 168, 23, 14);
		panel_1.add(lblLand);
		
		textField_4 = new JTextField();
		textField_4.setBounds(0, 182, 184, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setBounds(0, 210, 74, 14);
		panel_1.add(lblTelefonnummer);
		
		textField_3 = new JTextField();
		textField_3.setBounds(0, 224, 184, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAntalPassagerer = new JLabel("Antal passagerer");
		lblAntalPassagerer.setBounds(0, 252, 82, 14);
		panel_1.add(lblAntalPassagerer);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(0, 266, 74, 20);
		panel_1.add(spinner);
	}
}
