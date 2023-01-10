package bank_database;

import java.sql.ResultSet;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DbJava extends Conexion {

	private Statement stm = null;

	public DbJava() throws SQLException {
		this.conectar();
	}

	public boolean addUser(Person p) throws SQLException {
		if (this.getUsuario(p.getDni(), p.getEmail()) != null)
			return false; // Ya existe ese email y pass
		String valores = "'" + p.getNombre() + "','" + p.getDni() + "','" + p.getEmail() + "','" + p.getPassword()
				+ "'";
		String slq = "insert into usuarios values(" + valores + ")";
		stm = this.con.createStatement();
		return stm.execute(slq);
	}

	public boolean deleteUser(String dni) throws SQLException {
		String valores = "'" + dni + "'";
		String slq = "delete from usuarios where dni = '" + dni + "'";
		stm = this.con.createStatement();
		return stm.execute(slq);
	}

	public boolean addAccount(BankAccount b) throws SQLException {
		String valores = "'" + b.getIban() + "','" + b.getDni() + "','" + b.getSaldo() + "'";
		String slq = "insert into cuentas values(" + valores + ")";
		stm = this.con.createStatement();
		return stm.execute(slq);
	}

	public boolean addRegistro(Registro r) throws SQLException {
		String valores = "'" + r.getId() + "','" + r.getFecha() + "','" + r.getTipo() + "','" + r.getRemitente() + "','"
				+ r.getDestinatario() + "','" + r.getCantidad() + "'";
		String slq = "insert into registro values(" + valores + ")";
		stm = this.con.createStatement();
		return stm.execute(slq);
	}

	public boolean deleteAccount(String iban) throws SQLException {
		String valores = "'" + iban + "'";
		String slq = "delete from cuentas where iban = '" + iban + "'";
		stm = this.con.createStatement();
		return stm.execute(slq);
	}

	public ArrayList<Person> getAllUsers() throws SQLException {
		ArrayList<Person> list = new ArrayList<Person>();
		// list = null;
		String sql = "select * from usuarios";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			String dni = rs.getString(2);
			String emailu = rs.getString(3);
			String nombre = rs.getString(1);
			String passw = rs.getString(4);
			list.add(new Person(nombre, dni, emailu, passw));
		}
		return list;
	}

	public ArrayList<BankAccount> getAllAccounts() throws SQLException {
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		// list=null;
		String sql = "select * from cuentas";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			String iban = rs.getString(1);
			String dni = rs.getString(2);
			float saldo = rs.getFloat(3);
			list.add(new BankAccount(iban, dni, saldo));
		}
		return list;
	}

	public ArrayList<String> getAllIban(String dni) throws SQLException {
		ArrayList<String> list = new ArrayList<String>();
		// list=null;
		String sql = "select iban from cuentas where dni ='" + dni + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			String iban = rs.getString(1);
			list.add(iban);
		}
		return list;
	}

	public ArrayList<String> getAllIban() throws SQLException {
		ArrayList<String> list = new ArrayList<String>();
		// list=null;
		String sql = "select iban from cuentas";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			String iban = rs.getString(1);
			list.add(iban);
		}
		return list;
	}

	public ArrayList<Registro> getAllRegistro() throws SQLException {
		ArrayList<Registro> list = new ArrayList<Registro>();
		String sql = "select * from registro";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt(1);
			Date fecha = rs.getDate(2);
			String tipo = rs.getString(3);
			String remitente = rs.getString(4);
			String destinatario = rs.getString(5);
			float cantidad = rs.getFloat(6);
			list.add(new Registro(id, fecha, tipo, remitente, destinatario, cantidad));
		}
		return list;
	}

	public ArrayList<Registro> getAllRegistro(String remitente, String destinatario) throws SQLException {
		ArrayList<Registro> list = new ArrayList<Registro>();
		String sql = "select * from registro where remitente='" + remitente + "'or destinatario='" + destinatario + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt(1);
			Date fecha = rs.getDate(2);
			String tipo = rs.getString(3);
			String remitenteU1 = rs.getString(4);
			String destinatarioU = rs.getString(5);
			float cantidad = rs.getFloat(6);
			list.add(new Registro(id, fecha, tipo, remitenteU1, destinatarioU, cantidad));
		}
		return list;
	}

	public Person getUsuario(String dni, String email) throws SQLException { // Busca al usuario u en la BD. Null sino
																				// esta
		String sql = "select * from usuarios where dni ='" + dni + "'and email='" + email + "'";
		stm = this.con.createStatement(); // stm es temporal y lo que hace es usar el tubo
		ResultSet rs = stm.executeQuery(sql); // en el rs se guardan los valores devueltos poco a poco hay que meterlos
												// en un array ya que es temporal
		if (rs.next()) {
			String dniu = rs.getString(1);
			String emailu = rs.getString(2);
			String nombre = rs.getString(3);
			String passw = rs.getString(4);
			return new Person(dniu, emailu, nombre, passw);
		}
		return null;
	}

	public Person getUsuario(String dni) throws SQLException { // Busca al usuario u en la BD. Null sino
		// esta
		String sql = "select * from usuarios where dni ='" + dni + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			String dniu = rs.getString(1);
			String emailu = rs.getString(2);
			String nombre = rs.getString(3);
			String passw = rs.getString(4);
			return new Person(dniu, emailu, nombre, passw);
		}
		return null;
	}

	public Person getUsuarioEmail(String email, String pass) throws SQLException { // Busca al usuario u en la BD. Null
																					// sino
		// esta
		String sql = "select * from usuarios where email ='" + email + "'and pass='" + pass + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			String dniu = rs.getString(1);
			String emailu = rs.getString(2);
			String nombre = rs.getString(3);
			String passw = rs.getString(4);
			return new Person(dniu, emailu, nombre, passw);
		}
		return null;
	}

	public Person getUsuarioPassword(String dni, String password) throws SQLException { // Busca al usuario u en la BD.
																						// Null sino
		// esta
		String sql = "select * from usuarios where dni ='" + dni + "'and pass='" + password + "'";
		stm = this.con.createStatement(); // stm es temporal y lo que hace es usar el tubo
		ResultSet rs = stm.executeQuery(sql); // en el rs se guardan los valores devueltos poco a poco hay que meterlos
		// en un array ya que es temporal
		if (rs.next()) {
			String dniu = rs.getString(1);
			String emailu = rs.getString(2);
			String nombre = rs.getString(3);
			String passw = rs.getString(4);
			return new Person(dniu, emailu, nombre, passw);
		}
		return null;
	}

	public BankAccount getAccount(String iban, String dni) throws SQLException { // Busca al usuario u en la BD. Null
																					// sino
		// esta
		String sql = "select * from cuentas where iban ='" + iban + "'and dni='" + dni + "'";
		stm = this.con.createStatement(); // stm es temporal y lo que hace es usar el tubo
		ResultSet rs = stm.executeQuery(sql); // en el rs se guardan los valores devueltos poco a poco hay que meterlos
		// en un array ya que es temporal
		if (rs.next()) {
			String ibanu = rs.getString(1);
			String dniu = rs.getString(2);
			float saldo = rs.getFloat(3);
			return new BankAccount(dniu, ibanu, saldo);
		}
		return null;
	}

	public BankAccount getAccount(String iban) throws SQLException {
		String sql = "select * from cuentas where iban ='" + iban + "'";
		stm = this.con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if (rs.next()) {
			String ibanu = rs.getString(1);
			String dniu = rs.getString(2);
			float saldo = rs.getFloat(3);
			return new BankAccount(ibanu, dniu, saldo);
		}
		return null;
	}

	public boolean saldo(String iban, float saldo) throws SQLException {
		String sql = "update cuentas set saldo = " + saldo + " where iban ='" + iban + "'";
		stm = this.con.createStatement();
		return stm.execute(sql);
	}
}
