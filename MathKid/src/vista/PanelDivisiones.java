package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import controlador.Divisiones_Controlador;
import controlador.Restas_Controlador;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import utilidades.MathO;

public class PanelDivisiones extends BorderPane {

	Header hPane;
	Divisiones_View Divisiones;
	Foot hFoot;
	MathO o;

	public PanelDivisiones(String email) throws FileNotFoundException {
		o = new MathO();
		hPane = new Header("MathKid");
		Divisiones = new Divisiones_View(o);
		hFoot = new Foot("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Divisiones_Controlador c = new Divisiones_Controlador(Divisiones, o, email);

		this.setTop(hPane);
		this.setCenter(Divisiones);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/Fotos2.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Divisiones.setBackground(bGround);
	}
}
