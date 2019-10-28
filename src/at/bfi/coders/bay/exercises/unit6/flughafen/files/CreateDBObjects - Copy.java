import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CreateDBObjects {
	
	static ArrayList<Employees> allEmployees=new ArrayList<Employees>();
	
	
	
	public static void createEmployees(Connection conn) {
		try {
		    Statement statement=conn.createStatement();;
	        String sqlQuery = "SELECT * FROM Employee"; 
	        ResultSet resultSet = statement.executeQuery(sqlQuery); 
	        int spalten = resultSet.getMetaData().getColumnCount(); 
	        System.out.println("Anzahl Spalten: " + spalten); 
	
	        while (resultSet.next()) { 
	        	Employees employee=new Employees();
	        	employee.setPersonnel_number(resultSet.getInt(1));
	        	employee.setLocation(searchLocationByZIP(resultSet.getString(2)));
	        	allEmployees.add(employee);  	
	        } 
		 } 
	    catch (SQLException sqle) { 
	        System.out.println("SQLException: " + sqle.getMessage()); 
	        System.out.println("SQLState: " + sqle.getSQLState()); 
	        System.out.println("VendorError: " + sqle.getErrorCode()); 
	        sqle.printStackTrace(); 
	    } 
	}

}
