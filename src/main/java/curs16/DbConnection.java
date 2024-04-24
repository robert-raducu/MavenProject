package curs16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	//clasa speciala doar pentru a deschide si de a inchide o conexiune, nothing more 
	
	public static Connection openDbConnection(String hostname, String user, String pass) {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(hostname, user, pass);
			System.out.println("Conexiune cu succes!");
			
		
		}catch(SQLException e) {
			System.out.println("Nu am putut face conexiunea la baza de date"); // implementare reala -> log
			e.printStackTrace();
		}
		
		
		return conn;
	}
	
	public static void closeDbConnection(Connection conn) {
		
		try {
			
			System.out.println("Incerc sa inchid conexiunea");
			conn.close();
			System.out.println("Conexiunea a fost inchisa cu succes!");
			
		}catch(SQLException e) {
			System.out.println("Nu am reusit sa inchid conexiunea"); // implementare reala -> log
			e.printStackTrace();
		}
	}
}
