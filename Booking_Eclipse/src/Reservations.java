import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Reservations {
	public JFrame frame;
	public Container contentPane;
	DatabaseConnection db;
	
	/**
	 * Creates a new reservations window
	 * @param db	the open database connection
	 */
	public Reservations(DatabaseConnection db)
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
		frame = new JFrame("Reservations");
		frame.setMinimumSize(getMinimumSize());
		frame.setSize(getPreferredSize());
		contentPane = frame.getContentPane();
		//contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		makeContent();
		
		makeStatusBar();
		//frame.pack();	//Resizes the window to fit the components, not currently in use
	}

	/**
	 * Creates the statusbar that displays information.
	 */
	public void makeStatusBar()
	{
		JPanel statusPanel = new JPanel();
		statusPanel.setMinimumSize(new Dimension(640, 20));
		statusPanel.setMaximumSize(statusPanel.getMinimumSize());
		statusPanel.setBackground(Color.LIGHT_GRAY);
		statusPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(statusPanel, BorderLayout.SOUTH);
		
		JLabel statusLabel = new JLabel("Label");
		statusPanel.add(statusLabel, FlowLayout.LEFT);
		//statusLabel.setText(statusPanel.getLayout().toString());
		
	}
	
	
	
	public void makeContent()
	{
		JPanel searchPanel = new JPanel();
		contentPane.add(searchPanel);	
		
		createTable();
	}
	
	public void createTable()
	{		
		JPanel tablePanel = new JPanel();
		contentPane.add(tablePanel);
		//Define the columns in the tablemodel
		DefaultTableModel reservations = new DefaultTableModel();
		String[] columnNames = {"PersonID","First name", "Last name"};
		for(int i = 0; i < columnNames.length; i++)
		{
			reservations.addColumn(columnNames[i]);
		}
		
				
		//add the tablemodel to the table
		JTable table = new JTable(reservations);
		//Make the table scrollable
		JScrollPane scrollPane = new JScrollPane(table);
		//Add it to the window	
		tablePanel.add(scrollPane);
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
