package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

import bank_database.DbJava;
import bank_database.Registro;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import view.Menu_Usuario;
import view.Transferencia;

public class Controlador_Transferencia {

	private static Transferencia pane;

	private TextField cantidadaEnviar;
	private TextField ibanEnvio;
	private Label cantidadActual;
	private Button salir;

	private static String ibanx;

	public Controlador_Transferencia(Transferencia pane, String ibanx) {

		this.pane = pane;
		this.ibanx = ibanx;

		salir = pane.getSalir();
		salir.setOnAction(new Salir());

		cantidadaEnviar = pane.getCantidadTransferir();
		cantidadaEnviar.setOnAction(new Transferencias());

		ibanEnvio = pane.getCuentaDestinataria();
		ibanEnvio.setOnAction(new Transferencias());

	}

	class Transferencias implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {

				DbJava db = new DbJava();
				db.conectar();

				int id = 0;
				String tipo_Transferencia = "Transferencia";

				String ibanEnvioString = pane.getCuentaDestinataria().getText().toUpperCase();

				if (db.getAccount(ibanEnvioString) == null) {
					Iban();
					pane.getCantidadTransferir().setText("");
					pane.getCuentaDestinataria().setText("");
				} else {

					String cantidadaEnviarString = cantidadaEnviar.getText();
					float cantidadaEnviarFloat = Float.parseFloat(cantidadaEnviarString);

					if (cantidadaEnviarFloat > 3000) {
						Limite();
						pane.getCantidadTransferir().setText("");
						pane.getCuentaDestinataria().setText("");
					} else {

						float saldoActual = db.getAccount(ibanx).getSaldo();

						if (cantidadaEnviarFloat > saldoActual) {
							Limite2();
							pane.getCantidadTransferir().setText("");
							pane.getCuentaDestinataria().setText("");
						} else {

							float saldoNuevo = saldoActual - cantidadaEnviarFloat;

							db.saldo(ibanx, saldoNuevo);

							float saldoActualDestinatario = db.getAccount(ibanEnvioString).getSaldo();
							float SaldoNuevoDestinatario = cantidadaEnviarFloat + saldoActualDestinatario;

							db.saldo(ibanEnvioString, SaldoNuevoDestinatario);

							db.addRegistro(new Registro(id, fecha(), tipo_Transferencia, ibanx, ibanEnvioString,
									cantidadaEnviarFloat));

							pane.getCantidadActual().setText("" + saldoNuevo + "€");
							pane.getCantidadTransferir().setText("");
							pane.getCuentaDestinataria().setText("");

						}
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
		Menu_Usuario root = new Menu_Usuario(ibanx);
		Scene scene = new Scene(root, 1000, 500);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Menu_Usuario cc = new Controlador_Menu_Usuario(root);

	}

	public static Date fecha() {
		Date fecha = new Date();
		long timeInMilliSeconds = fecha.getTime();
		java.sql.Date fecha1 = new java.sql.Date(timeInMilliSeconds);
		return fecha1;
	}

	public static void Limite() throws FileNotFoundException {
		JOptionPane.showMessageDialog(null,
				"El limite para transferir son 3000€, si deseas transferir mas dinero acercate a tu sucursal mas cercana. Disculpe las molestias.",
				"¡Has superado el Limite! ", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void Limite2() throws FileNotFoundException {
		JOptionPane.showMessageDialog(null, "No dispone de tantos fondos, haga un ingreso",
				"¡Ha ocurrido un incidente! ", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void Iban() throws FileNotFoundException {
		JOptionPane.showMessageDialog(null, "El iban introducido es incorrecto", "¡Ha ocurrido un incidente! ",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
