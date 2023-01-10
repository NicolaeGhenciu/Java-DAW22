package Objetos3;

import java.util.Scanner;

public class CursoTest {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int op = 0;
		
		Curso c = new Curso();
		
		while (op != 5) {
			op = menu();
			switch (op) {
			case 1:System.out.println(c);break;
			case 2:
				String curso = i.next();
				c.setCurso(curso);break;
			case 3:
				System.out.println("Introduce el nombre");
				String student = i.next();
				System.out.println("Introduce el numero de estudiante");
				int numero = i.nextInt();
				c.addStudent(student, numero);break;
			case 4:
				System.out.println("Introduce el numero de estudiante");
				int x = i.nextInt();
				c.dropStudent(x);break;
			case 5:
			}
		}
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Ver todo");
		System.out.println("2. Cambiar nombre del curso.");
		System.out.println("3. Añadir Estudiante");
		System.out.println("4. Eliminar Estudiante");
		int op = input.nextInt();
		return op;
	}
}