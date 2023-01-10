package ArrayBidimensionales;

import java.util.Scanner;

public class TemperaturesV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] temperatures = getTemperatures(12, 10);
		double[] average = null;

		int[] pos = null;
		int op = 0;

		while (op != 5) {
			op = menu();
			switch (op) {
			case 1:
				System.out.println(arrayToString(temperatures));
				break;

			case 2:
				if (average == null)
					average = average(temperatures);
				int year = getHottestYear(average);
				System.out.println("Hottest year : " + yearTo(year));
				break;
			case 3:
				if (average == null)
					average = average(temperatures);
				pos = getColdestMoment(temperatures);
				int m = pos[0];
				System.out.println("Coldest Moment : " + monthToString(pos[0]) + "( " + yearTo(pos[1]));
				break;
			case 4:
				if (average == null)
					average = average(temperatures);
				System.out.println(averageToString(average));
			}
		}

	}

	public static String averageToString(double[] average) {
		String text = "\n Temperatures (Average)\n";

		for (int i = 0; i < average.length; i++)
			text += yearTo(i) + " ----- " + average[i] + "\n";
		return text;
	}

	public static String monthToString(int number) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return months[number];
	}

	public static int yearTo(int number) {
		return number + 2010;
	}

	public static int[] getColdestMoment(double[][] t) {
		int[] pos = new int[2];
		int fMenor = 0;
		int cMenor = 0;
		for (int f = 0; f < t.length; f++)
			for (int c = 0; c < t[f].length; c++)
				if (t[f][c] < t[fMenor][cMenor]) {
					fMenor = f;
					cMenor = c;
				}
		pos[0] = fMenor;
		pos[1] = cMenor;
		return pos;
	}

	public static int getHottestYear(double[] average) {
		int mayor = 0;
		for (int i = 1; i < average.length; i++)
			if (average[i] > average[mayor])
				mayor = i;
		return mayor;

	}

	public static double getHottestYearTemp(double[] average) {

		return average[getHottestYear(average)];

	}

	public static double[] average(double[][] t) {
		double[] average = new double[t[0].length];
		for (int c = 0; c < t[0].length; c++) {
			for (int f = 0; f < t.length; f++)
				average[c] += t[f][c];
			average[c] /= 12;
			average[c] = ((int) average[c] * 100) / 100.0;
		}
		return average;

	}

	public static String printHead() {
		String texto = "\n\tTemperatures in a decade\n\t_________________________\n";
		for (int i = 2010; i <= 2019; i++)
			texto += i + "\t";
		return texto + "\n";
	}

	public static String arrayToString(double[][] t) {
		String texto = printHead() + "\t";

		for (int f = 0; f < t.length; f++) {

			texto += "\n";
			for (int c = 0; c < t[f].length; c++)
				texto += t[f][c] + "\t";
			texto += monthToString(f) + "\t\t";
		}
		return texto;
	}

	public static double[][] getTemperatures(int m, int y) {
		double[][] t = new double[m][y];
		for (int f = 0; f < t.length; f++)
			for (int c = 0; c < t[f].length; c++)
				t[f][c] = ((int) (Math.random() * 40 * 100)) / 100.0;
		return t;
	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("\t\tMenu: ");
		System.out.println("\t--------------- ");
		System.out.println("1 .- Print Temperatures");

		System.out.println("2.- The hottest year ");
		System.out.println("3.- The coldest moment");
		System.out.println("4.- Average (Years)");
		System.out.println("5.- Exit");
		System.out.print("Option: ");
		int op = input.nextInt();
		return op;
	}

}
