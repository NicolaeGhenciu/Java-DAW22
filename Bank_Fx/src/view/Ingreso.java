package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import bank_database.DbJava;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Ingreso extends GridPane {

	private Label encabezado;
	private Label cantidadActual;
	private Label texto;
	private Label texto2;
	private Label texto3;
	private Button salir;

	private TextField cantidad;

	private String ibanx;

	public Ingreso(String ibanx) throws SQLException, FileNotFoundException {

		this.ibanx = ibanx;

		DbJava db = new DbJava();
		db.conectar();

		this.setVgap(20);
		this.setHgap(20);
		this.setAlignment(Pos.BASELINE_CENTER);

		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);
		BackgroundFill myBF = new BackgroundFill(Color.AQUA, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));// or
		this.setBackground(new Background(myBF));

		FileInputStream d = new FileInputStream("Fotos/logo_bbva.jpg");
		Image img = new Image(d);
		ImageView imV = new ImageView(img);
		imV.setScaleY(0.9);
		imV.setScaleX(1);

		this.encabezado = new Label("Apartado Ingresos");
		this.cantidadActual = new Label("Saldo Actual: " + db.getAccount(ibanx).getSaldo() + " €");
		this.texto = new Label("Cantidad a Ingresar: ");
		this.texto2 = new Label("Salir: ");
		this.texto3 = new Label("€");
		this.cantidad = new TextField();
		this.salir = new Button("O");

		this.add(imV, 1, 0);
		this.add(encabezado, 0, 0);
		this.add(cantidadActual, 1, 2);
		this.add(texto, 0, 3);
		this.add(cantidad, 1, 3);
		this.add(texto3, 2, 3);
		this.add(texto2, 1, 5);
		this.add(salir, 2, 5);
		
		this.encabezado.setFont(font);
		this.cantidadActual.setFont(font);
		this.texto.setFont(font);
		this.texto2.setFont(font);
		this.texto3.setFont(font);
		this.cantidad.setFont(font);
		this.salir.setFont(font);

	}

	public Label getCantidadActual() {
		return cantidadActual;
	}

	public Button getSalir() {
		return salir;
	}

	public TextField getCantidad() {
		return cantidad;
	}

	public void setCantidad(TextField cantidad) {
		this.cantidad = cantidad;
	}

}
