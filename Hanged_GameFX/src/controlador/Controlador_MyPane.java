package controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import ahorcado.Hanged;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import view.Body;
import view.Panel_Principal;

public class Controlador_MyPane {

	private static Body pane;
	private TextField texto;
	private Button enviar;
	private Hanged han;

	public Controlador_MyPane(Body pane) {
		this.pane = pane;
		han = new Hanged(pane.getPalabraSecreta());
		enviar = pane.getEnviar();
		texto = pane.getTexto();
		texto.setOnAction(new Manejador());
		enviar.setOnAction(new Manejador());
	}

	class Manejador implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {

			try {

				TextField texto = new TextField();

				if (pane.getTexto().getText() == texto.getText()) {

				} else {
					
					if (pane.getVidas() != 0) {

						if (!pane.getPalabraSecreta().equals(pane.getTexto().getText().toUpperCase())) {

							String a = pane.getTexto().getText().toUpperCase();
							char letra = a.charAt(0);

							String mascara = pane.getMascara().getText();

							String newMask = han.verification(letra, mascara);

							if (han.mascaraPlabra().equals(newMask)) {
								Victoria();
								CambioVentana();
							}

							pane.getMascara().setText(newMask);

							String labelLetrasUsadas = pane.getLetrasUsadas().getText();

							String letrasUsadas = han.letrasUsadas(letra, labelLetrasUsadas);

							pane.getLetrasUsadas().setText(letrasUsadas);

							pane.getTexto().setText("");

							boolean vida = han.isA();
							int vidas = pane.getVidas();

							if (vida == false) {
								vidas = pane.setVidas(vidas - 1);
								pane.getNumero().setText("Vidas: " + vidas);
								FileInputStream i1 = new FileInputStream("Fotos/" + vidas + " Vidas.jpg");
								Image i = new Image(i1);
								ImageView imV = new ImageView(i);
								pane.getImV().setImage(i);
							}
						} else {
							Victoria();
							CambioVentana();
						}
					} else {
						Derrota();
						CambioVentana();
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Victoria() throws Exception {
		JOptionPane.showMessageDialog(null, "¡Victoria!", "Eres un Mastodonte", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void Derrota() throws FileNotFoundException {
		JOptionPane.showMessageDialog(null, "¡Derrota! ", "Eres un Minion", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void CambioVentana() throws FileNotFoundException {
		Panel_Principal root = new Panel_Principal();
		Scene scene = new Scene(root, 1000, 500);
		Stage stage = new Stage();
		stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
		Controlador_Pp cc = new Controlador_Pp(root);
	}
}
