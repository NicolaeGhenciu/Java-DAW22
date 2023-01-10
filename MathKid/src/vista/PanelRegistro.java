package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import controlador.Register_Controlador;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;

public class PanelRegistro extends BorderPane {

	Header hPane;
	RegistroView Registro;
	Foot hFoot;

	public PanelRegistro() throws FileNotFoundException {
		hPane = new Header("MathKid");
		Registro = new RegistroView();
		hFoot = new Foot("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Register_Controlador rc = new Register_Controlador(Registro);

		this.setTop(hPane);
		this.setCenter(Registro);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/Fotos2.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Registro.setBackground(bGround);
	}
}
