package bank_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	Connection con = null;
	public void conectar() throws SQLException {
		
		String db = "bank_bbva";
		String password = "";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/" + db;
		
		con = DriverManager.getConnection(url,usuario,password);
	}
}
