package controlador;

import java.io.FileNotFoundException;

import ahorcado.Hanged;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import view.Body;
import view.Panel_Principal;

public class Controlador_Pp {

	Body root;
	Panel_Principal pane;
	private Button jugar;

	public Controlador_Pp(Panel_Principal pane) {

		this.pane = pane;
		
		jugar = pane.getJugar();

		jugar.setOnAction(new Manejador());
		
	}

	class Manejador implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent e) {
			try {
				root = new Body();
				Scene scene = new Scene(root, 1000, 500);
				Stage stage = new Stage(); 
				stage = (Stage) pane.getScene().getWindow();
				stage.setScene(scene);
				Controlador_MyPane cc = new Controlador_MyPane(root);
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
