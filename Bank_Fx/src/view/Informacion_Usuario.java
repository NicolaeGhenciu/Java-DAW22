package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
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

public class Informacion_Usuario extends GridPane {
	
	private Label encabezado;
	private Label nombre;
	private Label dni;
	private Label email;
	private Label iban;
	private Label saldo;
	private Label salir;
	
	private Button but_salir;
	
	private String ibanx;
	
	public Informacion_Usuario(String ibanx) throws SQLException, FileNotFoundException {
		
		this.ibanx = ibanx;
		
		DbJava db = new DbJava();
		db.conectar();
		
		this.setVgap(20);
		this.setHgap(20);
		this.setAlignment(Pos.BASELINE_CENTER);
		
		FileInputStream d = new FileInputStream("Fotos/logo_bbva.jpg");
		Image img = new Image(d);
		ImageView imV = new ImageView(img);
		imV.setScaleY(0.9);
		imV.setScaleX(1);
		
		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);
		BackgroundFill myBF = new BackgroundFill(Color.AQUA, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));// or
		this.setBackground(new Background(myBF));
		
		this.encabezado  = new Label("Información de la cuenta");
		String dniU = db.getAccount(ibanx).getDni();
		this.nombre = new Label("Nombre de Usuario: " + db.getUsuario(dniU).getNombre());
		this.dni = new Label("DNI: " + dniU);
		this.email = new Label("Email: " + db.getUsuario(dniU).getEmail());
		this.iban = new Label("IBAN: " + ibanx);
		float saldoActual = db.getAccount(ibanx).getSaldo();
		this.saldo = new Label("Saldo actual: " + saldoActual + " €");
		this.salir = new Label("Salir");
		this.but_salir = new Button("O");
		
		this.add(imV, 1, 0);
		this.add(encabezado, 1, 1);
		this.add(nombre, 1, 2);
		this.add(dni, 1, 3);
		this.add(email, 1, 4);
		this.add(iban, 1, 5);
		this.add(saldo, 1, 6);
		this.add(salir, 1, 7);
		this.add(but_salir, 2, 7);
		
		this.encabezado.setFont(font);
		this.nombre.setFont(font);
		this.dni.setFont(font);
		this.email.setFont(font);
		this.iban.setFont(font);
		this.saldo.setFont(font);
		this.salir.setFont(font);
		this.but_salir.setFont(font);
		
	}

	public Button getBut_salir() {
		return but_salir;
	}

	public String getIbanx() {
		return ibanx;
	}
	
}
