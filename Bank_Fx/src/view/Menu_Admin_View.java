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

public class Menu_Admin_View extends GridPane {

	private Label altaUsu;
	private Label bajaUsu;
	private Label altaCue;
	private Label bajaCue;
	private Label verUsu;
	private Label verCue;
	private Label verOpe;
	private Label salir;

	private Button but_AltaUsu;
	private Button but_bajUsu;
	private Button but_AltaCue;
	private Button but_BajaCue;
	private Button but_VerUsu;
	private Button but_VerCue;
	private Button but_VerOpe;
	private Button but_Salir;

	public Menu_Admin_View() throws FileNotFoundException {

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

		this.altaUsu = new Label("Alta Usuario: ");
		this.bajaUsu = new Label("Baja Usuario: ");
		this.altaCue = new Label("Alta Cuenta: ");
		this.bajaCue = new Label("Baja Cuenta: ");
		this.verUsu = new Label("Ver Todos los Usuarios: ");
		this.verCue = new Label("Ver Todas las Cuentas:");
		this.verOpe = new Label("Ver Todas las Operaciónes: ");
		this.salir = new Label("Salir: ");

		this.but_AltaUsu = new Button("O");
		this.but_bajUsu = new Button("O");
		this.but_AltaCue = new Button("O");
		this.but_BajaCue = new Button("O");
		this.but_VerUsu = new Button("O");
		this.but_VerCue = new Button("O");
		this.but_VerOpe = new Button("O");
		this.but_Salir = new Button("O");

		this.add(imV, 2, 0);
		this.add(this.altaUsu, 2, 1);
		this.add(this.but_AltaUsu, 3, 1);
		this.add(this.bajaUsu, 2, 2);
		this.add(this.but_bajUsu, 3, 2);
		this.add(this.altaCue, 2, 3);
		this.add(this.but_AltaCue, 3, 3);
		this.add(this.bajaCue, 2, 4);
		this.add(this.but_BajaCue, 3, 4);
		this.add(this.verUsu, 2, 5);
		this.add(this.but_VerUsu, 3, 5);
		this.add(this.verCue, 2, 6);
		this.add(this.but_VerCue, 3, 6);
		this.add(this.verOpe, 2, 7);
		this.add(this.but_VerOpe, 3, 7);
		this.add(this.salir, 2, 9);
		this.add(this.but_Salir, 3, 9);

		this.altaUsu.setFont(font);
		this.bajaUsu.setFont(font);
		this.altaCue.setFont(font);
		this.bajaCue.setFont(font);
		this.verUsu.setFont(font);
		this.verCue.setFont(font);
		this.verOpe.setFont(font);
		this.salir.setFont(font);
		this.but_AltaUsu.setFont(font);
		this.but_bajUsu.setFont(font);
		this.but_BajaCue.setFont(font);
		this.but_AltaCue.setFont(font);
		this.but_BajaCue.setFont(font);
		this.but_VerUsu.setFont(font);
		this.but_VerCue.setFont(font);
		this.but_VerOpe.setFont(font);
		this.but_Salir.setFont(font);
	}

	public Button getBut_AltaUsu() {
		return but_AltaUsu;
	}

	public Button getBut_bajUsu() {
		return but_bajUsu;
	}

	public Button getBut_AltaCue() {
		return but_AltaCue;
	}

	public Button getBut_BajaCue() {
		return but_BajaCue;
	}

	public Button getBut_VerUsu() {
		return but_VerUsu;
	}

	public Button getBut_VerCue() {
		return but_VerCue;
	}

	public Button getBut_VerOpe() {
		return but_VerOpe;
	}

	public Button getBut_Salir() {
		return but_Salir;
	}
	
}
