package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import utilidades.DbJava;
import vista.Login_View;
import vista.PanelMenu;
import vista.PanelRegistro;

public class Login_Controlador {

	private static Login_View pane;

	private Button but_Regitrarse;
	private Button but_Acceder;
	private PasswordField passw;

	public Login_Controlador(Login_View pane) {

		this.pane = pane;

		but_Regitrarse = pane.getRegisterButton();
		but_Regitrarse.setOnAction(new Regitrarse());

		but_Acceder = pane.getLoginButton();
		but_Acceder.setOnAction(new Acceder());

		passw = pane.getPass();
		passw.setOnAction(new Acceder());
	}

	class Acceder implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {

				DbJava db = new DbJava();
				db.conectar();

				String email = pane.getEmail().getText();
				String pass = pane.getPass().getText();

				if (db.getUsuario(email, pass) == null || email.equals("") || pass.equals("")) {
					pane.getEmail().setText("");
					pane.getPass().setText("");
				} else {
					CambioVentanaUsuario();
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

	class Regitrarse implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentana();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void CambioVentana() throws FileNotFoundException, SQLException {
		PanelRegistro root = new PanelRegistro();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}

	public static void CambioVentanaUsuario() throws FileNotFoundException, SQLException {
		// ScrollPane scroll = new ScrollPane();
		String email = pane.getEmail().getText();
		PanelMenu root = new PanelMenu(email);
		// scroll.setContent(root);
		Scene scene = new Scene(root, 1300, 800);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}
}
