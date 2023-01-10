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
import view.Sacar_Dinero_View;

public class Controlador_Sacar_Dinero {

	private static Sacar_Dinero_View pane;

	private TextField cantidad;
	private Label cantidadActual;
	private Button salir;

	private static String ibanx;

	public Controlador_Sacar_Dinero(Sacar_Dinero_View pane, String ibanx) {

		this.pane = pane;
		this.ibanx = ibanx;

		salir = pane.getSalir();
		salir.setOnAction(new Salir());

		cantidad = pane.getCantidad();
		cantidad.setOnAction(new Retirar());

	}

	class Retirar implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {

				DbJava db = new DbJava();
				db.conectar();
				int id = 0;
				String tipoReintego = "Reintegro";

				String cantidadString = cantidad.getText();

				float cantidadRetirar = Float.parseFloat(cantidadString);

				if (cantidadRetirar > 3000) {
					Limite();
					pane.getCantidad().setText("");
				} else {

					float saldoActual = db.getAccount(ibanx).getSaldo();

					if (cantidadRetirar > saldoActual) {
						pane.getCantidadActual().setText("No dispone usted de tanto dinero,\nSaldo Actual: " + saldoActual + "€");
						pane.getCantidad().setText("");
					} else {

						float saldoNuevo = saldoActual - cantidadRetirar;

						db.saldo(ibanx, saldoNuevo);
						db.addRegistro(new Registro(id, fecha(), tipoReintego, ibanx, ibanx, cantidadRetirar));

						pane.getCantidadActual().setText("" + saldoNuevo + "€");

						pane.getCantidad().setText("");
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
				"El limite para sacar son 3000€, si deseas sacar mas dinero acercate a tu sucursal mas cercana. Disculpe las molestias.",
				"¡Has superado el Limire! ", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void Invalido() throws FileNotFoundException {
		JOptionPane.showMessageDialog(null, "¡Solo se admiten caracteres numericos!", "¡Error! ",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
