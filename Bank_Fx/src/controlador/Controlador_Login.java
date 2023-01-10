package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import bank_database.DbJava;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.Cuentas_View;
import view.Login_View;
import view.Menu_Admin_View;

public class Controlador_Login {

	private static Login_View pane;
	private Button boton;
	private PasswordField pass;

	public Controlador_Login(Login_View pane) {

		this.pane = pane;

		boton = pane.getLoginButton();
		pass = pane.getPass();

		boton.setOnAction(new Entrar());
		pass.setOnAction(new Entrar());

	}

	class Entrar implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				DbJava db = new DbJava();
				db.conectar();

				String resultado = "Error, email o contraseña son incorretos";

				String email = pane.getEmail().getText();
				String pass = pane.getPass().getText();

				if (email.equals("admin") && pass.equals("admin")) {
					VentanaAdmin();
				} else {

					if (db.getUsuarioEmail(email, pass) == null) {
						pane.getResult().setText(resultado);
						pane.getEmail().setText("");
						pane.getPass().setText("");
					} else {
						String dni = db.getUsuarioEmail(email, pass).getDni();
						CambioVentana(dni);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void CambioVentana(String dni) throws FileNotFoundException, SQLException {
		Cuentas_View root = new Cuentas_View(dni);
		Scene scene = new Scene(root, 300, 500);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Cuentas_View cc = new Controlador_Cuentas_View(root);
	}

	public static void VentanaAdmin() throws FileNotFoundException, SQLException {
		Menu_Admin_View root = new Menu_Admin_View();
		Scene scene = new Scene(root, 1000, 650);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Menu_Admin cc = new Controlador_Menu_Admin(root);
	}
}
