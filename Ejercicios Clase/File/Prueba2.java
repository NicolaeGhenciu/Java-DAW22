package File;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Prueba2 {
	public static void main(String[] args) {
		
		File f= new File ("dict.txt.txt") ;
		Scanner dict = null;
		try {
			dict= new Scanner (f);
		}
		catch (Exception e) {
			System.out.println("Problema con el fichero " +e.getMessage());
		}
		ArrayList<String> words =new ArrayList<String>();
		while(dict.hasNext()) {
			words.add(dict.next());
			}
		for(int i=0;i<words.size();i++) {
			System.out.println(words);
		}
		
	}

}
