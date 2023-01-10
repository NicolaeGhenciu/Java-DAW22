package utilidades;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DbJava extends Conexion {

	private Statement stm = null;

	public DbJava() throws SQLException {
		this.conectar();
	}

	public boolean addUser(Person p) throws SQLException {
		/*
		 * if (this.getUsuario(p.getEmail()) != null) return false;
		 */
		String valores = "'" + p.getNombre() + "','" + p.getEdad() + "','" + p.getEmail() + "','" + p.getPassword()
				+ "'";
		String slq = "insert into usuarios values(" + valores + ")";
		stm = this.con.createStatement();
		return stm.execute(slq);
	}

	public boolean deleteUser(String email) throws SQLException {
		String valores = "'" + email + "'";
		String slq = "delete from usuarios where dni = '" + email + "'";
		stm = this.con.createStatement();
		return stm.execute(slq);
	}

	public Person getUsuario(String email) throws SQLException {
		String sql = "select * from usuarios where email ='" + email + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			String emailu = rs.getString(3);
			int edadu = rs.getInt(2);
			String nombre = rs.getString(1);
			String passw = rs.getString(4);
			return new Person(emailu, edadu, nombre, passw);
		}
		return null;
	}

	public Person getUsuario(String email, String pass) throws SQLException {
		String sql = "select * from usuarios where email ='" + email + "'and pass='" + pass + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			String emailu = rs.getString(3);
			int edadu = rs.getInt(2);
			String nombre = rs.getString(1);
			String passw = rs.getString(4);
			return new Person(emailu, edadu, nombre, passw);
		}
		return null;
	}

	public boolean addRegistro(RegistrosOperaciones o) throws SQLException {
		String valores = "'" + o.getEmail() + "','" + o.getFecha() + "','" + o.getTipoOperacion() + "','"
				+ o.getTripletes() + "','" + o.getFallos() + "'";
		String slq = "insert into registros values(" + valores + ")";
		stm = this.con.createStatement();
		return stm.execute(slq);
	}

	public RegistrosOperaciones getRegistro(String email) throws SQLException {
		String sql = "select * from registros where email ='" + email + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			String emailu = rs.getString(1);
			Date fecha = rs.getDate(2);
			String tipoOperacion = rs.getString(3);
			int tripletes = rs.getInt(4);
			int fallos = rs.getInt(5);
			return new RegistrosOperaciones(emailu, fecha, tipoOperacion, tripletes, fallos);
		}
		return null;
	}

	public ArrayList<RegistrosOperaciones> getAllRegistro(String email) throws SQLException {
		ArrayList<RegistrosOperaciones> list = new ArrayList<RegistrosOperaciones>();
		String sql = "select * from registros where email ='" + email + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			String emailu = rs.getString(1);
			Date fecha = rs.getDate(2);
			String tipoOperacion = rs.getString(3);
			int tripletes = rs.getInt(4);
			int fallos = rs.getInt(5);
			list.add(new RegistrosOperaciones(emailu, fecha, tipoOperacion, tripletes, fallos));
		}
		return list;
	}

}
