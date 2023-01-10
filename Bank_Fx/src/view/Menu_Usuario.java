package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Menu_Usuario extends GridPane {
	
	private String iban;
	
	private Label informacion;
	private Label ingresar;
	private Label retirar;
	private Label transferencia;
	private Label registro;
	private Label salir;
	
	private Button but_Informacion;
	private Button but_Ingresar;
	private Button but_Retirar;
	private Button but_Transferencia;
	private Button but_Registro;
	private Button but_Salir;
	
	public Menu_Usuario(String iban) throws FileNotFoundException {
		
		this.iban = iban;
		this.setVgap(20);
		this.setHgap(20);

		this.setAlignment(Pos.BASELINE_CENTER);
		
		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);
		BackgroundFill myBF = new BackgroundFill(Color.AQUA, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));// or
		this.setBackground(new Background(myBF));
		
		FileInputStream d = new FileInputStream("Fotos/logo_bbva.jpg");
		Image img = new Image(d);
		ImageView imV = new ImageView(img);
		imV.setScaleY(0.8);
		imV.setScaleX(0.8);
		
		this.informacion = new Label("Informacion de la Cuenta: ");
		this.ingresar = new Label("Realizar un Ingreso: ");
		this.retirar = new Label("Sacar Dinero del Cajero:");
		this.transferencia = new Label("Hacer una Transferencia: ");
		this.registro = new Label("Ver Movimientos: ");
		this.salir = new Label("Salir:");
		
		this.but_Informacion = new Button("O");
		this.but_Ingresar = new Button("O");
		this.but_Registro = new Button("O");
		this.but_Transferencia = new Button("O");
		this.but_Retirar = new Button("O");
		this.but_Salir = new Button("O");
		
		this.add(imV, 2, 0);
		this.add(this.informacion, 2, 1);
		this.add(this.but_Informacion, 3, 1);
		this.add(this.ingresar, 2, 2);
		this.add(this.but_Ingresar, 3, 2);
		this.add(this.retirar, 2, 3);
		this.add(this.but_Retirar, 3, 3);
		this.add(this.transferencia, 2, 4);
		this.add(this.but_Transferencia, 3, 4);
		this.add(this.registro, 2, 5);
		this.add(this.but_Registro, 3, 5);
		this.add(this.salir, 3, 7);
		this.add(this.but_Salir, 4, 7);
		
		this.informacion.setFont(font);
		this.ingresar.setFont(font);
		this.retirar.setFont(font);
		this.transferencia.setFont(font);
		this.registro.setFont(font);
		this.registro.setFont(font);
		this.salir.setFont(font);
		this.but_Informacion.setFont(font);
		this.but_Ingresar.setFont(font);
		this.but_Registro.setFont(font);
		this.but_Transferencia.setFont(font);
		this.but_Retirar.setFont(font);
		this.but_Salir.setFont(font);
		
	}

	public Button getBut_Informacion() {
		return but_Informacion;
	}

	public Button getBut_Ingresar() {
		return but_Ingresar;
	}

	public Button getBut_Retirar() {
		return but_Retirar;
	}

	public Button getBut_Transferencia() {
		return but_Transferencia;
	}

	public Button getBut_Registro() {
		return but_Registro;
	}

	public Button getBut_Salir() {
		return but_Salir;
	}

	public String getIban() {
		return iban;
	}
	
}
