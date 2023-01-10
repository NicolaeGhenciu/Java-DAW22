package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utilidades.DbJava;
import utilidades.Person;
import vista.PanelPrincipal;
import vista.RegistroView;

public class Register_Controlador {

	private static RegistroView pane;

	private Button but_Salir;
	private Button but_Registrarse;

	public Register_Controlador(RegistroView pane) {

		this.pane = pane;

		but_Salir = pane.getSalir();
		but_Salir.setOnAction(new Salir());

		but_Registrarse = pane.getRegistrarse();
		but_Registrarse.setOnAction(new Registrarse());

	}

	class Registrarse implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {

				DbJava db = new DbJava();
				db.conectar();

				String nombre = pane.getNombre().getText();
				String e = pane.getEdad().getText();
				String email = pane.getEmail().getText();
				String pass = pane.getPass().getText();

				if (nombre.equals("") || e.equals("") || email.equals("") || pass.equals("")) {

				} else {
					if (pass.length() < 8) {
						pane.getResultado2().setText("La contraseña es demasiado corta\nMinimo 8 Caracteres");
					} else {
						if (db.getUsuario(email) == null) {
							int edad = Integer.parseInt(e);
							Person pn = new Person(nombre, edad, email, pass);
							db.addUser(pn);
							CambioVentana();
						} else {
							pane.getResultado().setText("El correo ya pertenece a un Usuario");
							pane.getNombre().setText("");
							pane.getEdad().setText("");
							pane.getEmail().setText("");
							pane.getPass().setText("");
						}
					}

				}
			} catch (SQLException | FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Salir implements EventHandler<ActionEvent> {

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
		PanelPrincipal root = new PanelPrincipal();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}
}