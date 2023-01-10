package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import vista.Menu_View;
import vista.PanelDivisiones;
import vista.PanelInformacion;
import vista.PanelMultiplicaciones;
import vista.PanelPrincipal;
import vista.PanelProblemas;
import vista.PanelRestas;
import vista.PanelSumas;

public class Menu_Controlador {

	private static Menu_View pane;

	private Button but_Sumas;
	private Button but_Restas;
	private Button but_Multiplicaciones;
	private Button but_Divisiones;
	private Button but_Problemas;
	private Button but_Informacion;
	private Button but_Salir;

	private static String email;

	public Menu_Controlador(Menu_View pane, String email) {

		this.email = email;
		this.pane = pane;

		but_Sumas = pane.getSumas();
		but_Sumas.setOnAction(new Sumas());

		but_Restas = pane.getRestas();
		but_Restas.setOnAction(new Restas());

		but_Salir = pane.getSalir();
		but_Salir.setOnAction(new Salir());

		but_Multiplicaciones = pane.getMultiplicaciones();
		but_Multiplicaciones.setOnAction(new Multiplicaciones());

		but_Divisiones = pane.getDivisiones();
		but_Divisiones.setOnAction(new Divisiones());

		but_Problemas = pane.getProblemas();
		but_Problemas.setOnAction(new Problemas());

		but_Informacion = pane.getInformacion();
		but_Informacion.setOnAction(new Informacion());

	}

	class Sumas implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaSumas();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Restas implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaRestas();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Multiplicaciones implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaMultiplicaciones();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Divisiones implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaDivisiones();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Problemas implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaProblemas();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Informacion implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaInformacion();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Salir implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaSalir();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void CambioVentanaSumas() throws FileNotFoundException, SQLException {
		PanelSumas root = new PanelSumas(email);
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}

	public static void CambioVentanaRestas() throws FileNotFoundException, SQLException {
		PanelRestas root = new PanelRestas(email);
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}

	public static void CambioVentanaMultiplicaciones() throws FileNotFoundException, SQLException {
		PanelMultiplicaciones root = new PanelMultiplicaciones(email);
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}

	public static void CambioVentanaDivisiones() throws FileNotFoundException, SQLException {
		PanelDivisiones root = new PanelDivisiones(email);
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}

	public static void CambioVentanaProblemas() throws FileNotFoundException, SQLException {
		PanelProblemas root = new PanelProblemas(email);
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}

	public static void CambioVentanaInformacion() throws FileNotFoundException, SQLException {
		PanelInformacion root = new PanelInformacion(email);
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}

	public static void CambioVentanaSalir() throws FileNotFoundException, SQLException {
		PanelPrincipal root = new PanelPrincipal();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		stage.setFullScreen(true);
		stage.setResizable(false);
	}

}
