package vista;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import utilidades.MathO;

public class Divisiones_View extends GridPane {

	private Label tituloOperacion;
	private Label contador;
	private Label mensaje;
	private Label operacion;
	private Label resultado;

	private Button cero;
	private Button uno;
	private Button dos;
	private Button tres;
	private Button cuatro;
	private Button cinco;
	private Button seis;
	private Button siete;
	private Button ocho;
	private Button nueve;

	private Button borrar;
	private Button comprobar;
	private Button salir;

	public Divisiones_View(MathO o) {

		this.setVgap(20);
		this.setHgap(20);

		this.setAlignment(Pos.BASELINE_CENTER);

		String diseño = ("-fx-text-fill: #F85858; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 30px; -fx-font-family: 'Impact';");
		String diseñoVerde = ("-fx-text-fill: #34D100; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 30px; -fx-font-family: 'Impact';");
		String diseñoNegro = ("-fx-text-fill: #000000; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 30px; -fx-font-family: 'Impact';");
		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);

		tituloOperacion = new Label("DIVISIONES");
		contador = new Label(o.getContador());
		mensaje = new Label("");

		o.genNumeroUno(0);
		o.genNumeroDos(0);

		o.getAjusteDivisiones();

		System.out.println(o.getResultadoDivisiones());

		resultado = new Label("");
		operacion = new Label(" " + o.getNumeroUno() + " / " + o.getNumeroDos() + " ");

		cero = new Button("0");
		uno = new Button("1");
		dos = new Button("2");
		tres = new Button("3");
		cuatro = new Button("4");
		cinco = new Button("5");
		seis = new Button("6");
		siete = new Button("7");
		ocho = new Button("8");
		nueve = new Button("9");

		borrar = new Button("Borrar");
		comprobar = new Button("Comprobar");
		salir = new Button("Salir");

		tituloOperacion.setStyle(diseño);
		contador.setStyle(diseñoNegro);
		mensaje.setStyle(diseñoVerde);
		resultado.setStyle(diseñoNegro);
		operacion.setStyle(diseñoNegro);

		cero.setStyle(diseñoNegro);
		uno.setStyle(diseñoNegro);
		dos.setStyle(diseñoNegro);
		tres.setStyle(diseñoNegro);
		cuatro.setStyle(diseñoNegro);
		cinco.setStyle(diseñoNegro);
		seis.setStyle(diseñoNegro);
		siete.setStyle(diseñoNegro);
		ocho.setStyle(diseñoNegro);
		nueve.setStyle(diseñoNegro);

		borrar.setStyle(diseño);
		comprobar.setStyle(diseñoVerde);
		salir.setStyle(diseño);

		this.add(tituloOperacion, 3, 2);
		this.add(contador, 0, 3);
		this.add(operacion, 3, 3);
		this.add(resultado, 3, 5);
		this.add(mensaje, 3, 6);
		this.add(comprobar, 3, 10);
		this.add(borrar, 1, 10);
		this.add(salir, 1, 20);
		this.add(cero, 4, 3);
		this.add(uno, 5, 3);
		this.add(dos, 6, 3);
		this.add(tres, 7, 3);
		this.add(cuatro, 4, 4);
		this.add(cinco, 5, 4);
		this.add(seis, 6, 4);
		this.add(siete, 7, 4);
		this.add(ocho, 5, 5);
		this.add(nueve, 6, 5);

	}

	public Button getBorrar() {
		return borrar;
	}

	public Button getComprobar() {
		return comprobar;
	}

	public Button getSalir() {
		return salir;
	}

	public Label getMensaje() {
		return mensaje;
	}

	public Label getResultado() {
		return resultado;
	}

	public Label getContador() {
		return contador;
	}

	public Label getOperacion() {
		return operacion;
	}

	public Button getCero() {
		return cero;
	}

	public Button getUno() {
		return uno;
	}

	public Button getDos() {
		return dos;
	}

	public Button getTres() {
		return tres;
	}

	public Button getCuatro() {
		return cuatro;
	}

	public Button getCinco() {
		return cinco;
	}

	public Button getSeis() {
		return seis;
	}

	public Button getSiete() {
		return siete;
	}

	public Button getOcho() {
		return ocho;
	}

	public Button getNueve() {
		return nueve;
	}

}
