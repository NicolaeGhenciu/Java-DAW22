package Objetos2;

import java.util.Arrays;

public class Course {

	private String name;

	private String[] students;

	private int numberOfStudents;

	public Course(String name) {

		this.name = name;

		this.numberOfStudents = 0;

		this.students = new String[3];

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getNumberOfStudents() {

		return numberOfStudents;

	}

	public boolean dropStudent(String name) {

		int pos = this.isEnroll(name);

		if (pos < 0)

			return false;

		this.numberOfStudents--;

		for (int i = pos; i < this.numberOfStudents; i++)

			this.students[i] = this.students[i + 1];

		return true;

	}

	public boolean addStudent(String name) {

		if (this.numberOfStudents == this.students.length)

			return false;

		if (isEnroll(name) >= 0)

			return false;

		this.students[this.numberOfStudents] = name;

		this.numberOfStudents++;

		return true;

	}

	public int isEnroll(String name) {

		for (int i = 0; i < this.numberOfStudents; i++)

			if (students[i].equals(name))

				return i;

		return -1;

	}

	@Override

	public String toString() {

		String text = "Course [name=" + this.name + " numberOfStudents=" + numberOfStudents + "]";

		for (int i = 0; i < this.numberOfStudents; i++)

			text += "\n\t" + this.students[i];

		return text;

	}

}