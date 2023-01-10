package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import view.Informacion_Usuario;
import view.Login_View;
import view.Menu_Admin_View;

public class Controlador_Menu_Admin {

	private static Menu_Admin_View pane;

	private Button but_AltaUsu;
	private Button but_bajUsu;
	private Button but_AltaCue;
	private Button but_BajaCue;
	private Button but_VerUsu;
	private Button but_VerCue;
	private Button but_VerOpe;
	private Button but_Salir;

	public Controlador_Menu_Admin(Menu_Admin_View pane) {

		this.pane = pane;

		but_AltaUsu = pane.getBut_AltaUsu();
		but_Salir = pane.getBut_Salir();
		but_Salir.setOnAction(new Salir());
		// but_AltaUsu.setOnAction(new AltaUsuario());

	}

	class Salir implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaLogin();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/*
	 * class AltaUsuario implements EventHandler<ActionEvent> {
	 * 
	 * @Override public void handle(ActionEvent arg0) { try { VentanaAltaUsuario();
	 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (SQLException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } } }
	 * 
	 * public static void VentanaAltaUsuario() throws FileNotFoundException,
	 * SQLException { //Informacion_Usuario root = new Informacion_Usuario(iban);
	 * Scene scene = new Scene(root, 1000, 500); Stage stage = new Stage(); stage =
	 * (Stage) pane.getScene().getWindow(); stage.setScene(scene);
	 * //Controlador_Informacion cc = new Controlador_Informacion(root); }
	 */
	public static void CambioVentanaLogin() throws FileNotFoundException, SQLException {
		Login_View root = new Login_View();
		Scene scene = new Scene(root, 800, 600);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Login cc = new Controlador_Login(root);
	}
}
