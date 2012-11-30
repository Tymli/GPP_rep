import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Flyafgange {
	public JFrame frame;
	public Container contentPane;
	DatabaseConnection db;
	
	/**
	 * Creates a new reservations window
	 * @param db	the open database connection
	 */
	public Flyafgange(DatabaseConnection db)
	{
		this.db = db;
		Init();
		frame.setVisible(true);
	}
	
	/**
	 * This method has all the setup code for the window, sets the menubar, contentpane and statusbar.
	 */
	public void Init()
	{
		frame = new JFrame("Flyafgange");
		frame.setSize(getPreferredSize());
		contentPane = frame.getContentPane();
		
		makeContent();
		
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		
		makeStatusBar();
		//frame.pack();	//Resizes the window to fit the components, not currently in use
	}

	/**
	 * Creates the statusbar that displays information.
	 */
	public void makeStatusBar()
	{
		JPanel statusPanel = new JPanel();
		statusPanel.setBackground(Color.LIGHT_GRAY);
		statusPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(statusPanel, BorderLayout.SOUTH);
		
		JLabel statusLabel = new JLabel("Label");
		statusPanel.add(statusLabel, FlowLayout.LEFT);
		//statusLabel.setText(statusPanel.getLayout().toString());
		
	}
	
	
	
	public void makeContent()
	{
		{
			JPanel searchPanel = new JPanel();
			contentPane.add(searchPanel, BorderLayout.NORTH);
			JLabel fraLabel = new JLabel("Afgang fra:");
			JTextField afgangFra = new JTextField(10);
			searchPanel.add(fraLabel);
			searchPanel.add(afgangFra);
		}
		
		createTable();
	}
	
	public void createTable()
	{
		//Define the columns in the tablemodel
		DefaultTableModel flyafgange = new DefaultTableModel();
		String[] columnNames = {"RuteID","Afgang fra", "Afgang til", "Tidspunkt fra", "Tidspunkt til", "Ledige pladser"};
		for(int i = 0; i < columnNames.length; i++)
		{
			flyafgange.addColumn(columnNames[i]);
		}
		
		//Add the rows to the table
		
		
		
		
		//add the tablemodel to the table
		JTable table = new JTable(flyafgange);
		//Make the table scrollable
		JScrollPane scrollPane = new JScrollPane(table);
		//Add it to the window	
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}
	
	/**
	 * Gets the preferred window size
	 * @return	The preferred window size.
	 */
	private Dimension getPreferredSize()
	{
		return getMinimumSize();
	}
	
	/**
	 * Gets the minimum window size to work in windows safe mode.
	 * @return	the minimum dimensions for safe mode
	 */
	private Dimension getMinimumSize()
	{
		return new Dimension(640, 480);
	}
}
