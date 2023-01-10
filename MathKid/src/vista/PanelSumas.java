package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import controlador.Sumas_Controlador;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import utilidades.MathO;

public class PanelSumas extends BorderPane {

	Header hPane;
	Sumas_View Sumas;
	Foot hFoot;
	MathO o;

	public PanelSumas(String email) throws FileNotFoundException {
		o = new MathO();
		hPane = new Header("MathKid");
		Sumas = new Sumas_View(o);
		hFoot = new Foot("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Sumas_Controlador c = new Sumas_Controlador(Sumas, o, email);

		this.setTop(hPane);
		this.setCenter(Sumas);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/Fotos2.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Sumas.setBackground(bGround);
	}
}
