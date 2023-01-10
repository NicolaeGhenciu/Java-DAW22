package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import controlador.Restas_Controlador;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import utilidades.MathO;

public class PanelRestas extends BorderPane {

	Header hPane;
	Restas_View Restas;
	Foot hFoot;
	MathO o;

	public PanelRestas(String email) throws FileNotFoundException {
		o = new MathO();
		hPane = new Header("MathKid");
		Restas = new Restas_View(o);
		hFoot = new Foot("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Restas_Controlador c = new Restas_Controlador(Restas, o, email);

		this.setTop(hPane);
		this.setCenter(Restas);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/Fotos2.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Restas.setBackground(bGround);
	}
}
