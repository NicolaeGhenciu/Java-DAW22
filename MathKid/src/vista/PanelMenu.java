package vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import controlador.Menu_Controlador;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;

public class PanelMenu extends BorderPane {

	HeaderRed hPane;
	Menu_View Menu;
	FootRed hFoot;

	public PanelMenu(String email) throws FileNotFoundException {

		hPane = new HeaderRed("MathKid");
		Menu = new Menu_View();
		hFoot = new FootRed("MATHKID® 2022 By Ghenciu Nicolae Adrian");
		Menu_Controlador c = new Menu_Controlador(Menu, email);

		this.setTop(hPane);
		this.setCenter(Menu);
		this.setBottom(hFoot);

		FileInputStream d = new FileInputStream("src/Fotos/fondo.jpg");

		Image img = new Image(d);
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background bGround = new Background(bImg);
		Menu.setBackground(bGround);
	}

}
