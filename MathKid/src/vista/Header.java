package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Header extends FlowPane {

	private Label lTexto = new Label();

	public Header(String texto) {

		this.lTexto.setText(texto);
		this.getChildren().add(lTexto);
		this.setAlignment(Pos.CENTER);
		Font font = Font.font("Impact", FontWeight.EXTRA_BOLD, 45);
		this.lTexto.setFont(font);

		BackgroundFill myBF = new BackgroundFill(Color.LIMEGREEN, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));// or
		this.setBackground(new Background(myBF));

	}
}
