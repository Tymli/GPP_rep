import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	public JFrame frame;
	public Container contentPane;
	DatabaseConnection db;
	
	public TestGUI(DatabaseConnection db)
	{
		this.db = db;
		Init();
		frame.setVisible(true);
	}
	
	public void Init()
	{
		frame = new JFrame("Booking System");
		frame.setSize(getPreferredSize());
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		//frame.add(menuBar); //don't use this!!
		
		contentPane = frame.getContentPane();
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		JMenuItem item = new JMenuItem("New");
		menu.add(item);
		
		makeContent();
		
		makeStatusBar();
		//frame.pack();	//Resizes the window to fit the components
	}
		
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
	
	class insertPersonActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			db.InsertPerson("Carl", "Johnson");
		}
	}
	
	
	public void makeContent()
	{
		JButton insertPerson = new JButton("Insert Person");
		insertPerson.addActionListener(new insertPersonActionListener());
		contentPane.add(insertPerson);
	}
		
	private Dimension getPreferredSize()
	{
		return getMinimumSize();
	}
	
	private Dimension getMinimumSize()
	{
		return new Dimension(640, 480);
	}
	
}
