package curs17;

import java.sql.Connection;

import curs16.DbConnection;
import curs16.DbQueries;

public class TestDB {

	static String URL = PropertiesFileProcessor.readPropertiesFile("hostname", "db.properties");
	static String USER = PropertiesFileProcessor.readPropertiesFile("user", "db.properties");
	static String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "db.properties");
	
	public static void main(String[] args) {
		
		Connection conn = DbConnection.openDbConnection(URL, USER, PASS);
		
		
		
		String selectQuery = "select * from products";
		String updateQuery = "update products set ProductName = 'Krantz' where ProductName = 'Pavlova'";
		String deleteQuery = "delete from products where ProductName = 'Krantz'";
		
		System.out.println(DbQueries.dbSelectQuery(conn, selectQuery));
		
		System.out.println("-----------------------------------------------------------------------------");
		
		DbQueries.DbUpdateQuery(conn, updateQuery);
		System.out.println(DbQueries.dbSelectQuery(conn, selectQuery));
		
		System.out.println("-----------------------------------------------------------------------------");
		
		DbQueries.DbDeleteQuery(conn, deleteQuery);
		System.out.println(DbQueries.dbSelectQuery(conn, selectQuery));
		
		DbConnection.closeDbConnection(conn);
	}

}
