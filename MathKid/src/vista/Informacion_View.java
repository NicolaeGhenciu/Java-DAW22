package vista;

import java.sql.SQLException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import utilidades.DbJava;

public class Informacion_View extends GridPane {

	private Label titulo;
	private Label nombre;
	private Label edad;
	private Label emailU;
	private Label pass;
	private Label registro;
	private Label ajustar;
	private Label ajustar2;
	private Label ajustar3;

	//private Button editar;
	private Button salir;

	public Informacion_View(String email) {
		try {

			DbJava db = new DbJava();
			db.conectar();

			this.setVgap(20);
			this.setHgap(20);

			this.setAlignment(Pos.BASELINE_CENTER);

			String diseño = ("-fx-text-fill: #F85858; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 30px; -fx-font-family: 'Impact';");
			String diseñoVerde = ("-fx-text-fill: #34D100; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 30px; -fx-font-family: 'Impact';");
			String diseñoNegro = ("-fx-text-fill: #000000; -fx-border- width: 10px; -fx-background-color: WHITE; -fx-font-size: 30px; -fx-font-family: 'Impact';");

			titulo = new Label("INFORMACION");
			nombre = new Label("Nombre: " + db.getUsuario(email).getNombre());
			edad = new Label("Edad: " + db.getUsuario(email).getEdad());
			emailU = new Label("Email: " + db.getUsuario(email).getEmail());
			pass = new Label("Contraseña: " + db.getUsuario(email).getPassword());

			ajustar = new Label("                                                                ");
			ajustar2 = new Label(" ");
			ajustar3 = new Label("                                                                                                                                                                                                                       ");

			String a = "";

			for (int i = 0; i < db.getAllRegistro(email).size(); i++) {
				a = a + "" + db.getAllRegistro(email).get(i);
			}

			registro = new Label("" + a);

			//editar = new Button("Editar Perfil");
			salir = new Button("Salir");

			titulo.setStyle(diseñoNegro);
			nombre.setStyle(diseñoNegro);
			edad.setStyle(diseñoNegro);
			emailU.setStyle(diseñoNegro);
			registro.setStyle(diseñoNegro);
			pass.setStyle(diseño);
			//editar.setStyle(diseñoVerde);
			salir.setStyle(diseño);

			this.add(titulo, 1, 1);
			this.add(nombre, 1, 2);
			this.add(edad, 1, 3);
			this.add(emailU, 1, 4);
			this.add(pass, 1, 5);
			this.add(registro, 4, 6);
			this.add(ajustar3, 4, 5);
			this.add(ajustar2, 10, 10);
			//this.add(editar, 5, 2);
			this.add(salir, 5, 3);
			this.add(ajustar, 7, 25);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	public Button getEditar() {
		return editar;
	}
	*/
	public Button getSalir() {
		return salir;
	}

}
