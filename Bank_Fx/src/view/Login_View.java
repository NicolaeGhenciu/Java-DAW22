package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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

public class Login_View extends GridPane {

	private Label encabezado;
	private Label emailLabel;
	private Label passLabel;
	private Label result;

	private TextField email;
	private PasswordField pass;

	private Button loginButton;

	private ImageView imV;

	public Login_View() throws FileNotFoundException {

		FileInputStream d = new FileInputStream("Fotos/bbva.jpg");
		Image img = new Image(d);
		imV = new ImageView(img);

		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);
		BackgroundFill myBF = new BackgroundFill(Color.AQUA, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));// or
		this.setBackground(new Background(myBF));

		this.setVgap(20);
		this.setHgap(20);

		this.setAlignment(Pos.BASELINE_CENTER);

		this.encabezado = new Label("Bienvenido al Banco BBVA");
		this.emailLabel = new Label("Email:");
		this.passLabel = new Label("Contraseña:");
		this.result = new Label("");

		this.email = new TextField();
		this.pass = new PasswordField();

		loginButton = new Button("Login");

		this.add(this.encabezado, 1, 0);
		this.add(this.emailLabel, 0, 1);
		this.add(this.email, 1, 1);
		this.add(this.passLabel, 0, 2);
		this.add(this.pass, 1, 2);
		this.add(this.result, 1, 3);
		this.add(this.loginButton, 2, 2);
		this.add(this.imV, 1, 4);

		this.encabezado.setFont(font);
		this.emailLabel.setFont(font);
		this.email.setFont(font);
		this.passLabel.setFont(font);
		this.pass.setFont(font);
		this.result.setFont(font);
		this.loginButton.setFont(font);

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

	public Label getResult() {
		return result;
	}

	public void setResult(Label result) {
		this.result = result;
	}

}
