package vista;

import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Login_View extends GridPane {

	private Label emailLabel;
	private Label passLabel;
	private Label mensaje;

	private TextField email;
	private PasswordField pass;

	private Button loginButton;
	private Button registerButton;

	// private ImageView imV;

	public Login_View() throws FileNotFoundException {

		Font font = Font.font("Impact", FontWeight.EXTRA_BOLD, 15);

		this.setVgap(20);
		this.setHgap(20);

		this.setAlignment(Pos.BASELINE_CENTER);

		this.emailLabel = new Label("Email:");
		this.passLabel = new Label("Contraseña:");
		this.mensaje = new Label("¿No eres usuario todavia?");

		this.email = new TextField();
		this.pass = new PasswordField();
		/*
		 * FileInputStream i1 = new FileInputStream("src/Fotos/GIF1.gif"); Image i = new
		 * Image(i1); ImageView imV = new ImageView(i); imV.resize(0.1, 0.1);
		 */
		loginButton = new Button("Acceder");
		registerButton = new Button("REGISTRARSE");
		registerButton.setStyle(
				"-fx-text-fill: #F85858; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 25px;  -fx-font-family: 'Impact';");
		loginButton.setStyle(
				"-fx-text-fill: #2ECC71; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 20px;  -fx-font-family: 'Impact';");
		mensaje.setStyle("-fx-background-color: rgba(255,255,255, 0.4)");

		this.add(this.emailLabel, 2, 3);
		this.add(this.email, 3, 3);
		this.add(this.passLabel, 2, 4);
		this.add(this.pass, 3, 4);
		this.add(this.mensaje, 3, 5);
		this.add(this.loginButton, 4, 4);
		this.add(this.registerButton, 3, 6);

		this.emailLabel.setFont(font);
		this.email.setFont(font);
		this.passLabel.setFont(font);
		this.pass.setFont(font);
		this.mensaje.setFont(font);
		this.loginButton.setFont(font);
		this.registerButton.setFont(font);

	}

	public TextField getEmail() {
		return email;
	}

	public void setEmail(TextField email) {
		this.email = email;
	}

	public PasswordField getPass() {
		return pass;
	}

	public void setPass(PasswordField pass) {
		this.pass = pass;
	}

	public Button getLoginButton() {
		return loginButton;
	}

	public Button getRegisterButton() {
		return registerButton;
	}

}
