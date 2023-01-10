package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import utilidades.DbJava;
import utilidades.MathO;
import utilidades.RegistrosOperaciones;
import vista.PanelMenu;
import vista.Sumas_View;

public class Sumas_Controlador {

	private static Sumas_View pane;
	MathO o;

	private Button but_Cero;
	private Button but_Uno;
	private Button but_Dos;
	private Button but_Tres;
	private Button but_Cuatro;
	private Button but_Cinco;
	private Button but_Seis;
	private Button but_Siete;
	private Button but_Ocho;
	private Button but_Nueve;

	private Button but_Salir;
	private Button but_Comprobar;
	private Button but_Borrar;

	private static String email;

	public Sumas_Controlador(Sumas_View pane, MathO o, String email) {

		this.pane = pane;
		this.o = o;
		this.email = email;
		System.out.println(email);

		but_Salir = pane.getSalir();
		but_Salir.setOnAction(new Salir());

		but_Borrar = pane.getBorrar();
		but_Borrar.setOnAction(new Borrar());

		but_Comprobar = pane.getComprobar();
		but_Comprobar.setOnAction(new Comprobar());

		but_Cero = pane.getCero();
		but_Cero.setOnAction(new Cero());

		but_Uno = pane.getUno();
		but_Uno.setOnAction(new Uno());

		but_Dos = pane.getDos();
		but_Dos.setOnAction(new Dos());

		but_Tres = pane.getTres();
		but_Tres.setOnAction(new Tres());

		but_Cuatro = pane.getCuatro();
		but_Cuatro.setOnAction(new Cuatro());

		but_Cinco = pane.getCinco();
		but_Cinco.setOnAction(new Cinco());

		but_Seis = pane.getSeis();
		but_Seis.setOnAction(new Seis());

		but_Siete = pane.getSiete();
		but_Siete.setOnAction(new Siete());

		but_Ocho = pane.getOcho();
		but_Ocho.setOnAction(new Ocho());

		but_Nueve = pane.getNueve();
		but_Nueve.setOnAction(new Nueve());

	}

	class Cero implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 0);
		}
	}

	class Uno implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 1);
		}
	}

	class Dos implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 2);
		}
	}

	class Tres implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 3);
		}
	}

	class Cuatro implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 4);
		}
	}

	class Cinco implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 5);
		}
	}

	class Seis implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 6);
		}
	}

	class Siete implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 7);
		}
	}

	class Ocho implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 8);
		}
	}

	class Nueve implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText(pane.getResultado().getText() + "" + 9);
		}
	}

	class Borrar implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			pane.getResultado().setText("");
		}
	}

	class Salir implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {
				CambioVentanaUsuario();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Comprobar implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			try {

				String numeroString = pane.getResultado().getText();
				if (numeroString.equals("")) {

				} else {
					int resultadoUsuario = Integer.parseInt(numeroString);
					int resultado = o.getResultadoSuma();

					if (resultadoUsuario == resultado) {
						pane.getMensaje().setText("Correcto");
						o.sumTriplete();
						if (o.getTriplete() >= 3) {
							pane.getMensaje().setText("Triplete!");
							o.sumTripleteTotal();
							o.zeroTriplete();
						}
					} else {
						o.sumFallos();
						o.zeroTriplete();
						pane.getMensaje().setText("Ui, Casi!");
					}
					pane.getContador().setText(o.getContador());
					if (o.getIntentos() >= 11) {
						DbJava db = new DbJava();
						RegistrosOperaciones rO = new RegistrosOperaciones(email, o.fecha(), "Sumas",
								o.getTripleteTotal(), o.getFallos());
						db.addRegistro(rO);
						CambioVentanaUsuario();
					}
					o.genNumeroUno(0);
					o.genNumeroDos(0);
					pane.getOperacion().setText("" + o.getNumeroUno() + " + " + o.getNumeroDos() + "");
					System.out.println(o.getResultadoSuma());
					pane.getResultado().setText("");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void CambioVentanaUsuario() throws FileNotFoundException, SQLException {
		// ScrollPane scroll = new ScrollPane();
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
