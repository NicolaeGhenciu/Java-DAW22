package EJERCICIOS_CLASE;

import java.util.Scanner;

public class Palabras_Palindromas {

	public static void main(String[] args) {
		
		System.out.println("\t\t\tIntroduce una texto para saber si es Palindroma:  ");
		
		Scanner p = new Scanner (System.in);
		String text = p.next();
		
		int first = 0;
		int last = text.length()-1;
		
		boolean pali = true;
		while ( first < last && pali) {
			if (text.charAt(first)!=text.charAt(last))
				pali = false;
			first++;
			last--;
		}
		if (pali )
			System.out.println("Palindrome");
		else 
			System.out.println("No es Palindrome");
		}
	}