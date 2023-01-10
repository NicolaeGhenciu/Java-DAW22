package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class RegistroView extends GridPane {

	private Label nombreLabel;
	private Label edadLabel;
	private Label emailLabel;
	private Label passLabel;
	private Label resultado;
	private Label resultado2;

	private TextField nombre;
	private TextField edad;
	private TextField email;
	private PasswordField pass;

	private Button registrarse;
	private Button salir;

	public RegistroView() throws FileNotFoundException {

		Font font = Font.font("Impact", FontWeight.EXTRA_BOLD, 15);

		this.setVgap(20);
		this.setHgap(20);

		this.setAlignment(Pos.BASELINE_CENTER);

		this.nombreLabel = new Label("Nombre de Usuario: ");
		this.edadLabel = new Label("Edad: ");
		this.emailLabel = new Label("Email:");
		this.passLabel = new Label("Contraseña: ");
		this.resultado = new Label("");
		this.resultado2 = new Label("");

		this.nombre = new TextField();
		this.edad = new TextField();
		this.email = new TextField();
		this.pass = new PasswordField();

		this.registrarse = new Button("Registrarse");
		this.salir = new Button("Salir");

		FileInputStream d = new FileInputStream("src/Fotos/200.gif");
		Image img = new Image(d);
		ImageView imV = new ImageView(img);
		imV.setScaleY(0.9);
		imV.setScaleX(1);

		registrarse.setStyle(
				"-fx-text-fill: #2ECC71; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 20px; -fx-font-family: 'Impact';");

		salir.setStyle(
				"-fx-text-fill: #F85858; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 20px; -fx-font-family: 'Impact';");

		resultado.setStyle("-fx-text-fill: #F85858");
		resultado2.setStyle("-fx-text-fill: #F85858");

		this.add(this.resultado, 2, 4);
		this.add(this.nombreLabel, 0, 2);
		this.add(this.edadLabel, 0, 3);
		this.add(this.emailLabel, 0, 4);
		this.add(this.passLabel, 0, 5);
		this.add(this.nombre, 1, 2);
		this.add(this.edad, 1, 3);
		this.add(this.email, 1, 4);
		this.add(this.pass, 1, 5);
		this.add(this.registrarse, 2, 5);
		this.add(this.resultado2, 1, 6);
		this.add(this.salir, 2, 10);
		this.add(imV, 1, 10);

		this.nombreLabel.setFont(font);
		this.nombre.setFont(font);
		this.edad.setFont(font);
		this.edadLabel.setFont(font);
		this.emailLabel.setFont(font);
		this.email.setFont(font);
		this.passLabel.setFont(font);
		this.pass.setFont(font);
		this.resultado.setFont(font);
		this.resultado2.setFont(font);

	}

	public TextField getEmail() {
		return email;
	}

	public PasswordField getPass() {
		return pass;
	}

	public TextField getNombre() {
		return nombre;
	}

	public TextField getEdad() {
		return edad;
	}

	public void setEdad(TextField edad) {
		this.edad = edad;
	}

	public Button getRegistrarse() {
		return registrarse;
	}

	public Button getSalir() {
		return salir;
	}

	public Label getResultado() {
		return resultado;
	}

	public Label getResultado2() {
		return resultado2;
	}

}
