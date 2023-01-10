package Objetos2;

public class ListOfRationalNumber {

	private int pos = 0;
	private RationalNumber[] array;

	public ListOfRationalNumber() {
		array = new RationalNumber[5];
	}

	public ListOfRationalNumber(int n) {
		array = new RationalNumber[n];
	}

	public void add(RationalNumber f) {
		if (pos == array.length) {
			array = copy();
		}
		array[pos++] = f;

	}

	public RationalNumber getItem(int i) {
		if (i >= 0 && i < pos)
			return array[i];
		return null;
	}

	public int searchElement(RationalNumber r) {

		for (int i = 0; i < pos; i++)
			if (array[i].equals(r))
				return i;
		return -1;
	}

	public int size() {
		return pos;
	}

	private RationalNumber[] copy() {
		RationalNumber[] arrayaux = new RationalNumber[pos + 5];
		for (int i = 0; i < pos; i++)
			arrayaux[i] = array[i];
		return arrayaux;
	}

	public boolean deleteElement(RationalNumber f) {
		int k = this.searchElement(f);

		if (k == -1)
			return false;

		for (int i = k; i < pos - 1; i++)
			this.array[i] = this.array[i + 1];

		--pos;
		return true;

	}

	public String toString() {
		String text = "";
		for (int i = 0; i < pos; i++)
			text += array[i].toString() + " - ";
		return text;
	}

}
