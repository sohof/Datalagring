/*
 * Datalagring IV1351 A small example to show how JDBC works.
 * It uses the JDBC driver for mysql. 
 * There is no error management, instead exceptions are thrown. 
 */
package datalagring;

// Import statements
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


/**
 *
 * @author sohof
 */
public class JDBCLabb {

    // DB connection variables
    static protected Connection con;
    // DB access variables
    private static final String URL = "jdbc:mysql:///labb";  // labb is the name of the database 
    private static final String driver ="com.mysql.jdbc.Driver"; 
    private static final String userID ="root";
    private static final String passWord ="Mazdak123";
    
    // method for establishing connection to the database
    public void connect(){
    
    }
    
    public void simpleSelect() throws Exception {
    
    }
    
      public void parameterizedSelect() throws Exception {
          
          // Local variables
          String query;
          ResultSet rs;
          PreparedStatement stmt;
          String brandparam;
          
         // Create a Scanner in order to allow the user to provide input.
        Scanner in = new Scanner(System.in);
        // Ask use for input
        System.out.print("Please provide brand: ");
        // Save string input  into brandparam
        brandparam = in.nextLine();
    }
    
    // Insert values into the database
    public void insert() throws Exception {
        
        // Local variales;
        String query;
        PreparedStatement stmt;
        String fnameparam;
        String lnameparam;
        String cityparam;
        
        // Create a Scanner in order to allow the user to provide input.
        Scanner in = new Scanner(System.in);
        // Ask user to specify first name for input
        System.out.print("Please enter first name: ");
        // Save string input  into fnameparam
        fnameparam = in.nextLine();
         // Ask user to specify last name for input
        System.out.print("Please enter last name: ");
        // Save string input into lnameparam
        lnameparam = in.nextLine();
        // Ask user to specify city 
        System.out.print("Please enter city name: ");
        // Save string input into cityparam
        cityparam = in.nextLine();
        
    }  
      
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        // create a new of this class
        JDBCLabb t = new JDBCLabb(); 
        
        // Call methods on the object t.
	System.out.println("-------- connect() ---------");
        t.connect();
        System.out.println("-------- simpleselect() ---------");
        t.simpleSelect();
        System.out.println("-------- parameterizedselect() ---------");
        t.parameterizedSelect();
        System.out.println("-------- insert() ---------");
        t.insert();

        // Commit the changes made to the database through this connection.
        con.commit();
        // Close the connection.
        con.close();
        
    }
    
}
