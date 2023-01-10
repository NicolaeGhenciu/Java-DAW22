package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import controlador.Informacion_Controlador;
import controlador.Restas_Controlador;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import utilidades.MathO;

public class PanelInformacion extends BorderPane {

	Header hPane;
	Informacion_View Informacion;
	Foot hFoot;
	MathO o;

	public PanelInformacion(String email) throws FileNotFoundException {
		hPane = new Header("MathKid");
		Informacion = new Informacion_View(email);
		hFoot = new Foot("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Informacion_Controlador c = new Informacion_Controlador(Informacion, email);

		ScrollPane sc = new ScrollPane();
		sc.setContent(Informacion);

		this.setTop(hPane);
		this.setCenter(sc);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/Fotos2.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Informacion.setBackground(bGround);
	}
}
