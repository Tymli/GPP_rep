import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
/**
 * This class creates a Main menu GUI
 * @author Hin Pang
 *
 */
public class Main_menu {
	public JFrame frame;
	public Container contentPane;
	DatabaseConnection db;
	
	/**
	 * Creates a new main menu window
	 * @param db	the open database connection
	 */
	public Main_menu(DatabaseConnection db)
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
		frame = new JFrame("Booking System");
		frame.setSize(getPreferredSize());
		frame.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		//Add a menu and its items to the menubar
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		JMenuItem itemNew = new JMenuItem("New");
		menu.add(itemNew);
		JMenuItem itemHelp = new JMenuItem("Help");
		menu.add(itemHelp);
		JMenuItem itemSettings = new JMenuItem("Settings");
		menu.add(itemSettings);
		JMenuItem itemQuit = new JMenuItem("Quit");
		menu.add(itemQuit);
		
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
		//Add a JPanel to the contentpane.
		JPanel statusPanel = new JPanel();
		statusPanel.setBackground(Color.LIGHT_GRAY);
		statusPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		//contentPane.add(statusPanel, BorderLayout.SOUTH);
		
		//Add a label to display the information
		JLabel statusLabel = new JLabel("Label");
		statusPanel.add(statusLabel, FlowLayout.LEFT);
	}
	
	//TODO: EventListener template
	class TemplateActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
		}
	}
	
	class ReservationsActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			new Reservations(db);
			
		}
	}
	
	
	/**
	 * Add the content to the pane.
	 */
	public void makeContent()
	{
		//JPanel with grid to line up the components, use empty labels to fill the empty spaces
		JPanel bookPanel = new JPanel(new GridLayout(5, 2));
		JLabel fraLabel = new JLabel("Fra");
		bookPanel.add(fraLabel);
		bookPanel.add(new JLabel(""));
		JTextField afgangFra = new JTextField(20);
		bookPanel.add(afgangFra);
		bookPanel.add(new JLabel(""));
		bookPanel.add(new JLabel(""));
		bookPanel.add(new JLabel(""));
		JLabel tilLabel = new JLabel("Til");
		bookPanel.add(tilLabel);
		bookPanel.add(new JLabel(""));
		JTextField afgangTil = new JTextField(20);
		bookPanel.add(afgangTil);
		//bookPanel.add(new JLabel(""));
		JButton searchBook = new JButton("Søg");
		searchBook.setPreferredSize(new Dimension(20, 10));
		searchBook.setAlignmentX(0);
		bookPanel.add(searchBook);
		bookPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(bookPanel, BorderLayout.NORTH);
		
		JPanel reservationPanel = new JPanel(new BorderLayout());
		JButton reservations = new JButton("Reservations");
		//Frame border uses about 5 pixels that the contentpane can't use
		//reservations.setPreferredSize(new Dimension(455, 135));
		reservations.addActionListener(new ReservationsActionListener());
		reservationPanel.add(reservations, BorderLayout.CENTER);
		reservationPanel.setBorder(new EmptyBorder(0, 10, 10, 10));
		contentPane.add(reservationPanel);
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
		return new Dimension(480, 320);
	}
}
