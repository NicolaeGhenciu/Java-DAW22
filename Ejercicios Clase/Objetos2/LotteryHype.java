package Objetos2;

public class LotteryHype {

	private int[] hype;

	private int top = 0;

	public LotteryHype() {

		this(1000);

	}

	public LotteryHype(int number) {

		hype = new int[number];

		fillHype();

		shuffling();

	}

	private void fillHype() {

		for (int i = 0; i < hype.length; i++)

			hype[i] = i;

	}

	public void shuffling() {

		for (int i = top; i < hype.length; i++) {

			int p = (int) (Math.random() * (hype.length - top) + top);

			int aux = hype[i];

			hype[i] = hype[p];

			hype[p] = aux;

		}

	}

	public boolean isEmpty() {

		if (top == hype.length)

			return true;

		return false;

	}

	public int getNumber() {

		int n = hype[top];

		top++;

		return n;

	}

}