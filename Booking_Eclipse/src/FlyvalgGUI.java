import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class FlyvalgGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlyvalgGUI frame = new FlyvalgGUI();
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
	public FlyvalgGUI() {
		setTitle("Flyafgange");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 10, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 6, 0, 0));
		
		JLabel lblFra = new JLabel("Fra");
		panel.add(lblFra);
		
		JLabel lblNewLabel = new JLabel("Til");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Dato fra");
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Dato til");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Tidspunkt");
		panel.add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		panel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		panel.add(comboBox_4);
		
		JButton btnNewButton = new JButton("S\u00F8g");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(10, 0, 0, 0));
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnSlet = new JButton("Vis pladser");
		panel_1.add(btnSlet);
		
		JButton btnRediger = new JButton("Book s\u00E6de(r)");
		panel_1.add(btnRediger);
		
		JButton btnTilbage = new JButton("Luk");
		panel_1.add(btnTilbage);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
	}

}
