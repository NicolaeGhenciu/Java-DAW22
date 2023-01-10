package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import controlador.Problemas_Controlador;
import controlador.Sumas_Controlador;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import utilidades.MathO;

public class PanelProblemas extends BorderPane {

	Header hPane;
	Problemas_View Problemas;
	Foot hFoot;
	MathO o;

	public PanelProblemas(String email) throws FileNotFoundException {
		o = new MathO();
		hPane = new Header("MathKid");
		Problemas = new Problemas_View(o);
		hFoot = new Foot("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Problemas_Controlador c = new Problemas_Controlador(Problemas, o, email);

		this.setTop(hPane);
		this.setCenter(Problemas);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/Fotos2.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Problemas.setBackground(bGround);
	}
}
