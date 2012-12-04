import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.ScrollPane;
import javax.swing.BoxLayout;
import java.awt.Component;


public class seatingsGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					seatingsGUI frame = new seatingsGUI();
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
	public seatingsGUI() {
		setTitle("Choose seats");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Canvas canvas = new Canvas();
		contentPane.add(canvas, BorderLayout.CENTER);
		
		JPanel panelRight = new JPanel();
		contentPane.add(panelRight, BorderLayout.EAST);
		panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.PAGE_AXIS));
		
		JPanel panelLabels = new JPanel();
		panelLabels.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panelRight.add(panelLabels);
		panelLabels.setLayout(new BoxLayout(panelLabels, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_3 = new JLabel("Fra:");
		panelLabels.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Til:");
		panelLabels.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rejsedato: ");
		panelLabels.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tidspunkt:");
		panelLabels.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fly nr.");
		panelLabels.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		panelLabels.add(lblNewLabel_8);
		
		ScrollPane scrollPane = new ScrollPane();
		panelRight.add(scrollPane);
		
		JPanel panelBottom = new JPanel();
		contentPane.add(panelBottom, BorderLayout.SOUTH);
		panelBottom.setLayout(new BorderLayout(0, 0));
		
		JPanel panelLegend = new JPanel();
		FlowLayout fl_panelLegend = (FlowLayout) panelLegend.getLayout();
		fl_panelLegend.setAlignment(FlowLayout.LEFT);
		panelBottom.add(panelLegend, BorderLayout.WEST);
		
		JLabel lblNewLabel4 = new JLabel(new ImageIcon("Images/Seat_free.png"));
		panelLegend.add(lblNewLabel4);
		
		JLabel lblNewLabel = new JLabel("Free");
		panelLegend.add(lblNewLabel);
		
		JLabel lblNewLabel5 = new JLabel(new ImageIcon("Images/Seat_selected.png"));
		panelLegend.add(lblNewLabel5);
		
		JLabel lblNewLabel_1 = new JLabel("Selected");
		panelLegend.add(lblNewLabel_1);
		
		JLabel lblNewLabel6 = new JLabel(new ImageIcon("Images/Seat_occupied.png"));
		panelLegend.add(lblNewLabel6);
		
		JLabel lblNewLabel_2 = new JLabel("Reserved");
		panelLegend.add(lblNewLabel_2);
		
		JPanel panelButtons = new JPanel();
		FlowLayout fl_panelButtons = (FlowLayout) panelButtons.getLayout();
		fl_panelButtons.setAlignment(FlowLayout.RIGHT);
		panelBottom.add(panelButtons, BorderLayout.EAST);
		
		JButton btnNewButton_1 = new JButton("Gem");
		panelButtons.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Luk");
		panelButtons.add(btnNewButton);
	}

}
