import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {
	//Connection class field
	private Connection connection;
	
//    //The columns in the respective tables.
//    public final String PERSON = "PersonID ";
//    public final String RESERVATION = ;
//    public final String ROUTE;
//    public final String SEAT;
//    public final String TICKET;
    
    
    
    
    /**
     * Database connection Constructor opens a new 
     * connection to the MySQL database.
     */
    public DatabaseConnection()
    {
        openDB();
    }
    
    /**
     * Try connecting to the database connection or throw an exception
     */
    private void openDB()
    {
        //Try-catch block in case something goes wrong during runtime
        try
        {
            //Make a reference to the connector
            Class.forName("com.mysql.jdbc.Driver");
            //Establish connection to the Database location using a username and password
            connection = DriverManager.getConnection("jdbc:mysql://mysql.itu.dk/Test_osterone", "testosterone", "osterone");
        }
        //This is thrown if anything goes wrong with the connection setup
        catch(SQLException exn)
        {
            System.out.println("Kan ikke Âbne databaseforbindelsen: " + exn);
        }
        //Get this exception if the connector is not included in the library and referenced properly
        catch(ClassNotFoundException cE)
        {
            System.out.print("Class not found Exception: " + cE);
        }
    }
    
    /**
     * Create a table
     */
    public void Create(String tableName, String columns)
    {
    	sendQuery("CREATE TABLE " + tableName + " (" + columns + ")");
    }
    
    public void InsertPerson(String First_name, String Last_name)
    {
    	sendQuery("INSERT INTO Person (First_name, Last_name) VALUES('" + First_name + "','" + Last_name + "')");
    	
    	
    	//sendQuery("INSERT INTO (" + columns + ") VALUES(" + values + ")");
    }
    
    
    
    
    /**
     * Add some data to the database table
     */
    public ResultSet sendQuery(String query)
    {
    	ResultSet resultSet = null;
        try
        {
            //Create a statement for sending queries to the database
            Statement dbStatement = connection.createStatement();
            //Execute the statement with the query and return true/false
            boolean ok = dbStatement.execute(query);
            //this if block will execute if the returns a resultset(if we did a SELECT query)
            if(ok)
            {
                resultSet = dbStatement.getResultSet();
            }
            else
            {
            	//Is this needed
            	resultSet = null;
            }
        }
        catch(SQLException exn)
        {
        	JOptionPane.showMessageDialog(null,"Error while trying to parse query:" + exn);
            System.out.println("SQLException: " + exn);
        }
        return resultSet;
    }
}
