package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Menu_View extends VBox {

	private Button sumas;
	private Button restas;
	private Button multiplicaciones;
	private Button divisiones;
	private Button problemas;
	private Button informacion;
	private Button salir;

	public Menu_View() {

		this.setAlignment(Pos.BASELINE_CENTER);

		this.sumas = new Button("SUMAS");
		this.restas = new Button("RESTAS");
		this.multiplicaciones = new Button("MULTIPLICACIONES");
		this.divisiones = new Button("DIVISIONES");
		this.problemas = new Button("PROBLEMAS");
		this.informacion = new Button("INFORMACION");
		this.salir = new Button("SALIR");

		VBox.setMargin(sumas, new Insets(7));
		VBox.setMargin(restas, new Insets(7));
		VBox.setMargin(multiplicaciones, new Insets(7));
		VBox.setMargin(divisiones, new Insets(7));
		VBox.setMargin(problemas, new Insets(7));
		VBox.setMargin(informacion, new Insets(7));
		VBox.setMargin(salir, new Insets(7));

		String diseño = "-fx-text-fill: #F85858; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 30px; -fx-font-family: 'Impact';";

		sumas.setStyle(diseño);
		restas.setStyle(diseño);
		multiplicaciones.setStyle(diseño);
		divisiones.setStyle(diseño);
		problemas.setStyle(diseño);
		informacion.setStyle(diseño);
		salir.setStyle(diseño);

		getChildren().add(sumas);
		getChildren().add(restas);
		getChildren().add(multiplicaciones);
		getChildren().add(divisiones);
		getChildren().add(problemas);
		getChildren().add(informacion);
		getChildren().add(salir);

	}

	public Button getSumas() {
		return sumas;
	}

	public Button getRestas() {
		return restas;
	}

	public Button getMultiplicaciones() {
		return multiplicaciones;
	}

	public Button getDivisiones() {
		return divisiones;
	}

	public Button getProblemas() {
		return problemas;
	}

	public Button getInformacion() {
		return informacion;
	}

	public Button getSalir() {
		return salir;
	}

}
