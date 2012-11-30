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
		frame = new JFrame("Reservations");
		frame.setSize(getPreferredSize());
		/*
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		//frame.add(menuBar); //don't use this!!
			
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		JMenuItem item = new JMenuItem("New");
		menu.add(item);
		*/
		contentPane = frame.getContentPane();
		
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
		statusPanel.setBackground(Color.LIGHT_GRAY);
		statusPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(statusPanel, BorderLayout.SOUTH);
		
		JLabel statusLabel = new JLabel("Label");
		statusPanel.add(statusLabel, FlowLayout.LEFT);
		//statusLabel.setText(statusPanel.getLayout().toString());
		
	}
	
	
	
	public void makeContent()
	{
		
		
		createCell();
	}
	
	public void createCell()
	{
		DefaultTableModel reservations = new DefaultTableModel();
		String[] columnNames = {"PersonID","First name", "Last name"};
		for(int i = 0; i < columnNames.length; i++)
		{
			reservations.addColumn(columnNames[i]);
		}
		
				
		JTable table = new JTable(reservations);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		
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
