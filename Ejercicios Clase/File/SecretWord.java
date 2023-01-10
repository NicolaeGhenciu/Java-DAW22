package File;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SecretWord {

	public static String leerTxt(String direccion) {
		
		String texto = "";
		try {
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temp = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null) {
				//hacer el ciclo mientras BfRead tenga datos
				temp = temp + bfRead; //guardamos temporalmente el texto del archivo
				System.out.println(temp);
			}
			texto = temp;
				
		} catch (Exception e) {
			System.out.println("No se encontro el archivo"); 
		}
		return texto;
	}
}