package File;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Prueba3 {

	public static void main(String[] args) {
		File f = new File("dict.txt");
		Scanner dict = null;
		
		if (f.exists()) {
			System.out.println("Existe");
		}

	}

}
