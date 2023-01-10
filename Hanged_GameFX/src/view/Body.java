package view;

import java.io.FileInputStream;
import ahorcado.Hanged;
import diccionario.Diccionario;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;

public class Body extends GridPane {

	private Label mascara;
	private Label introduce;
	private Label letrasUsadas;
	private Label numero;
	private Label encabezado;
	private Button enviar;
	private ImageView imV;
	private TextField texto;
	private Hanged mask;
	private int vidas;
	private String palabraSecreta;

	public Body() throws Exception {

		/*
		 * FileInputStream i2 = new FileInputStream("Fotos/mou.gif"); Image i3 = new
		 * Image(i2); ImageView imV2 = new ImageView(i3);
		 * 
		 * FileInputStream i5 = new FileInputStream("Fotos/mou2.gif"); Image i6 = new
		 * Image(i5); ImageView imV3 = new ImageView(i6);
		 */

		vidas = 6;

		Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
		BackgroundFill myBF = new BackgroundFill(Color.BLUEVIOLET, new CornerRadii(1), new Insets(0.0, 0.0, 0.0, 0.0));// or
		this.setBackground(new Background(myBF));
		this.setVgap(20);
		this.setHgap(20);
		this.setAlignment(Pos.BASELINE_CENTER);
		// diseño
		String direccion = ("doc/Words.txt.txt");
		Diccionario dic = new Diccionario(direccion);
		palabraSecreta = dic.getRandomWord().toUpperCase();
		System.out.println(palabraSecreta);
		// palabra
		mask = new Hanged(palabraSecreta);
		String maskara = mask.printMask();
		// mascara

		FileInputStream d = new FileInputStream("Fotos/6 Vidas.jpg");
		Image img = new Image(d);
		imV = new ImageView(img);

		this.encabezado = new Label("The Hanged Game");
		this.mascara = new Label(maskara);
		this.introduce = new Label("Introduce una letra");
		this.letrasUsadas = new Label(" ");
		this.numero = new Label("Vidas: " + vidas);
		this.texto = new TextField();
		this.enviar = new Button("Enviar");

		this.mascara.setFont(font);
		this.introduce.setFont(font);
		this.letrasUsadas.setFont(font);
		this.numero.setFont(font);
		this.texto.setFont(font);
		this.enviar.setFont(font);
		this.encabezado.setFont(font);

		this.add(encabezado, 1, 0);
		this.add(numero, 0, 1);
		this.add(mascara, 1, 1);
		this.add(introduce, 0, 2);
		this.add(texto, 1, 2);
		this.add(enviar, 2, 2);
		this.add(letrasUsadas, 1, 3);
		this.add(imV, 1, 4);

	}

	public Label getMascara() {
		return mascara;
	}

	public void setMascara(Label mascara) {
		this.mascara = mascara;
	}

	public Label getIntroduce() {
		return introduce;
	}

	public void setIntroduce(Label introduce) {
		this.introduce = introduce;
	}

	public Label getLetrasUsadas() {
		return letrasUsadas;
	}

	public void setLetrasUsadas(Label letrasUsadas) {
		this.letrasUsadas = letrasUsadas;
	}

	public Button getEnviar() {
		return enviar;
	}

	public void setEnviar(Button enviar) {
		this.enviar = enviar;
	}

	public ImageView getImV() {
		return imV;
	}

	public void setImV(ImageView imV) {
		this.imV = imV;
	}

	public TextField getTexto() {
		return texto;
	}

	public void setTexto(TextField texto) {
		this.texto = texto;
	}

	public int getVidas() {
		return vidas;
	}

	public int setVidas(int vidas) {
		return this.vidas = vidas;
	}

	public Label getNumero() {
		return numero;
	}

	public void setNumero(Label numero) {
		this.numero = numero;
	}

	public Label getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(Label encabezado) {
		this.encabezado = encabezado;
	}

	public Hanged getMask() {
		return mask;
	}

	public void setMask(Hanged mask) {
		this.mask = mask;
	}

	public String getPalabraSecreta() {
		return palabraSecreta;
	}

	public void setPalabraSecreta(String palabraSecreta) {
		this.palabraSecreta = palabraSecreta;
	}

}
