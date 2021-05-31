package Page;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DatabasePage {

public static String getData(String columnName) throws SQLException, ClassNotFoundException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String sqlUrl = "jdbc:mysql://localhost:3306/jan_2021_batch";
	String username = "root";
	String password = "root";
	String quary = "select * from users";
	

	Connection connection = DriverManager.getConnection(sqlUrl,username,password);
	Statement statement  = connection.createStatement();
	ResultSet resultset = statement.executeQuery(quary);

	while(resultset.next()) {
		return resultset.getString(columnName);
	}
	return columnName;
}	
}
