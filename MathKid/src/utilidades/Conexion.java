package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	Connection con = null;

	public void conectar() throws SQLException {

		String db = "mat";
		String password = "";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/" + db;

		con = DriverManager.getConnection(url, usuario, password);
	}
}
