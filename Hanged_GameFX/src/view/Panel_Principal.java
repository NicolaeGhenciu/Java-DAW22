package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Panel_Principal extends GridPane{
	
	private Label encabezado;
	private Label pulsar;
	private Button jugar;
	private ImageView imV;
	
	public Panel_Principal() throws FileNotFoundException {
		
		this.setVgap(20);
		this.setHgap(20);
		
		this.setAlignment(Pos.BASELINE_CENTER);
		
		FileInputStream f = new FileInputStream("Fotos/Logo.png");
		ImageView imV = new ImageView(new Image(f));
		
		jugar = new Button ("Jugar");
	
		this.encabezado = new Label("Bienvenido :D");
		this.pulsar = new Label("Pulsar para Jugar");
		
		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
		
		this.add(encabezado,0,0);
		this.add(imV, 0, 1);
		this.add(pulsar, 0, 2);
		this.add(jugar, 1, 2);
		
		this.encabezado.setFont(font);
		this.pulsar.setFont(font);
		this.jugar.setFont(font);
		
		
		
		BackgroundFill myBF = new BackgroundFill(Color.BLUEVIOLET, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));
		Region myContainer;
		this.setBackground(new Background(myBF));
		
	}

	public Label getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(Label encabezado) {
		this.encabezado = encabezado;
	}

	public Label getPulsar() {
		return pulsar;
	}

	public void setPulsar(Label pulsar) {
		this.pulsar = pulsar;
	}

	public Button getJugar() {
		return jugar;
	}

	public void setJugar(Button jugar) {
		this.jugar = jugar;
	}

	public ImageView getImV() {
		return imV;
	}

	public void setImV(ImageView imV) {
		this.imV = imV;
	}
	
}
