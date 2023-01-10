package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import bank_database.DbJava;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Registo_View extends GridPane {
	
	ArrayList<String> misfechas;

	private Label encabezado;
	private Label cantidadActual;
	private Label fecha;
	private Button salir;

	private String ibanx;

	public Registo_View(String ibanx) throws SQLException, FileNotFoundException {

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

		this.encabezado = new Label("Apartado Movimientos BBVA");
		this.cantidadActual = new Label("Saldo Actual: " + db.getAccount(ibanx).getSaldo() + " €");
		this.fecha = new Label(db.getAllRegistro(ibanx, ibanx).toString());
		this.salir = new Button("Salir");

		this.add(imV, 1, 0);
		this.add(encabezado, 2, 0);
		this.add(cantidadActual, 1, 1);
		this.add(fecha, 1, 2);
		this.add(salir, 1, 3);
		
		this.encabezado.setFont(font);
		this.cantidadActual.setFont(font);
		this.fecha.setFont(font);
		this.salir.setFont(font);

	}

	public Button getSalir() {
		return salir;
	}

	public void setSalir(Button salir) {
		this.salir = salir;
	}
	
	
}
