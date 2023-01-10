package Objetos3;

import java.util.Arrays;

public class Curso {
	private String curso;
	private String[] estudiantes;
	private int numeroEstudiantes;

	public Curso(String curso, String[] estudiantes) {
		this.curso = curso;
		this.estudiantes = estudiantes;
		this.numeroEstudiantes = 0;
	}
	
	public Curso() {
		this(null, new String[5]);
	}
	
	@Override
	public String toString() {
		return "Curso [curso=" + curso + ", estudiantes=" + Arrays.toString(estudiantes) + ", numeroEstudiantes="
				+ numeroEstudiantes + "]";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(String[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public int getNumeroEstudiantes() {
		return numeroEstudiantes;
	}

	public void setNumeroEstudiantes(int numeroEstudiantes) {
		this.numeroEstudiantes = numeroEstudiantes;
	}
	
	public void addStudent(String student, int numero) {
		estudiantes[numero] = student;
		numeroEstudiantes++;
	}
	public void dropStudent(int x) {
		estudiantes[x] = null;
		numeroEstudiantes--;
		
	}
	
}