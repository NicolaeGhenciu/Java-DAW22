package File;

import java.io.File;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {

		File f = new File("E:\\Mis Cosas\\DAW\\1 AÑO\\Programación\\2 Trimestre");

		if (f.exists())
			if (f.isDirectory()) {
				System.out.println("La carpeta existe" + f.getAbsolutePath());
				File[] lista = f.listFiles();
				System.out.println("Lista de archivos");
				for (int i = 0; i < lista.length; i++) {
					if (lista[i].isFile())
						;
					System.out.println("\t\t\t");
					System.out.println(lista[i].getName());
				}
			} else
				System.out.println("El fichero existe");
		
	}
}
