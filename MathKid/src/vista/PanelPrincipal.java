package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import controlador.Login_Controlador;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;

public class PanelPrincipal extends BorderPane {

	Header hPane;
	Login_View Login;
	Foot hFoot;

	public PanelPrincipal() throws FileNotFoundException {
		hPane = new Header("MathKid");
		Login = new Login_View();
		hFoot = new Foot("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Login_Controlador lc = new Login_Controlador(Login);

		this.setTop(hPane);
		this.setCenter(Login);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/Fotos2.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Login.setBackground(bGround);
	}
}
