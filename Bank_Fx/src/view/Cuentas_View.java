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

public class Cuentas_View extends GridPane {

	private static String dni;

	private Label encabezado;

	private ImageView imV;

	ArrayList<Button> cuentas = new ArrayList<Button>();
	ArrayList<String> misCuentas;

	public Cuentas_View(String dni) throws SQLException, FileNotFoundException {

		this.setVgap(20);
		this.setHgap(20);
		this.setAlignment(Pos.BASELINE_CENTER);

		FileInputStream d = new FileInputStream("Fotos/logo_bbva.jpg");
		Image img = new Image(d);
		imV = new ImageView(img);
		imV.setScaleY(0.8);
		imV.setScaleX(0.8);

		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);
		BackgroundFill myBF = new BackgroundFill(Color.AQUA, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));// or
		this.setBackground(new Background(myBF));

		this.dni = dni;

		setBody(font);

		this.encabezado = new Label("Cuentas Disponibles");

		this.add(this.encabezado, 1, 1);
		this.add(this.imV, 1, 0);
		this.encabezado.setFont(font);
		this.encabezado.setTranslateX(30);
	}

	public void setBody(Font font) throws SQLException {

		DbJava db = new DbJava();
		db.conectar();

		misCuentas = db.getAllIban(dni);

		for (int i = 0; i < misCuentas.size(); i++) {
			cuentas.add(new Button(misCuentas.get(i)));
			this.add(cuentas.get(i), 1, 2 + i);
			this.cuentas.get(i).setFont(font);
			this.cuentas.get(i).setTranslateX(70);
		}
	}

	public ArrayList<Button> getCuentas() {
		return cuentas;
	}

}
