package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import view.Informacion_Usuario;
import view.Ingreso;
import view.Sacar_Dinero_View;
import view.Transferencia;
import view.Login_View;
import view.Menu_Usuario;
import view.Registo_View;

public class Controlador_Menu_Usuario {

	private static Menu_Usuario pane;

	private Button but_Informacion;
	private Button but_Ingresar;
	private Button but_Retirar;
	private Button but_Transferencia;
	private Button but_Registro;
	private Button but_Salir;
	
	public static String iban;

	public Controlador_Menu_Usuario(Menu_Usuario pane) {

		this.pane = pane;
		this.iban = pane.getIban();

		but_Informacion = pane.getBut_Informacion();
		but_Informacion.setOnAction(new Informacion());
		
		but_Ingresar = pane.getBut_Ingresar();
		but_Ingresar.setOnAction(new Ingresar());
		
		but_Retirar = pane.getBut_Retirar();
		but_Retirar.setOnAction(new RetirarV());
		
		but_Transferencia = pane.getBut_Transferencia();
		but_Transferencia.setOnAction(new Transferencias());
		
		but_Registro = pane.getBut_Registro();
		but_Registro.setOnAction(new Registros());
		
		but_Salir = pane.getBut_Salir();
		but_Salir.setOnAction(new Salir());
		
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
	
	class Ingresar implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaIngresar();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	class RetirarV implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaRetirar();
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
	
	class Registros implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaRegistro();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	class Transferencias implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaTransferencia();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void CambioVentanaInformacion() throws FileNotFoundException, SQLException {
		Informacion_Usuario root = new Informacion_Usuario(iban);
		Scene scene = new Scene(root, 1000, 500);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Informacion cc = new Controlador_Informacion(root);
	}
	
	public static void CambioVentanaLogin() throws FileNotFoundException, SQLException {
		Login_View root = new Login_View();
		Scene scene = new Scene(root,800, 600);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Login cc = new Controlador_Login(root);
	}
	
	public static void CambioVentanaRetirar() throws FileNotFoundException, SQLException {
		Sacar_Dinero_View root = new Sacar_Dinero_View(iban);
		Scene scene = new Scene(root, 1000, 500);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Sacar_Dinero cc = new Controlador_Sacar_Dinero(root,iban);
	}
	
	public static void CambioVentanaIngresar() throws FileNotFoundException, SQLException {
		Ingreso root = new Ingreso(iban);
		Scene scene = new Scene(root, 800, 400);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Ingresos cc = new Controlador_Ingresos(root,iban);
	}
	
	public static void CambioVentanaTransferencia() throws FileNotFoundException, SQLException {
		Transferencia root = new Transferencia(iban);
		Scene scene = new Scene(root, 1000, 500);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Transferencia cc = new Controlador_Transferencia(root,iban);
	}
	
	public static void CambioVentanaRegistro() throws FileNotFoundException, SQLException {
		ScrollPane scroll = new ScrollPane();
		Registo_View root = new Registo_View(iban);
		scroll.setContent(root);
		Scene scene = new Scene(scroll, 1000, 500);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Registro cc = new Controlador_Registro(root,iban);
	}
}