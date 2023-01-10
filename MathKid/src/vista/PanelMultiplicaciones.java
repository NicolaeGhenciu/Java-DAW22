package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import controlador.Multiplicaciones_Controlador;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import utilidades.MathO;

public class PanelMultiplicaciones extends BorderPane {

	Header hPane;
	Multiplicaciones_View Multiplicaciones;
	Foot hFoot;
	MathO o;

	public PanelMultiplicaciones(String email) throws FileNotFoundException {
		o = new MathO();
		hPane = new Header("MathKid");
		Multiplicaciones = new Multiplicaciones_View(o);
		hFoot = new Foot("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Multiplicaciones_Controlador c = new Multiplicaciones_Controlador(Multiplicaciones, o, email);

		this.setTop(hPane);
		this.setCenter(Multiplicaciones);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/Fotos2.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Multiplicaciones.setBackground(bGround);
	}
}
