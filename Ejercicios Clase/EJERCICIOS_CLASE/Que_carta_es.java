package EJERCICIOS_CLASE;

public class Que_carta_es {

	public static void main(String[] args) {
		int card = (int) (Math.random() * 40) + 1;
		System.out.println(card + " is " + cardToString(card));

	}

	public static String cardToString(int c) {
		int palo = c / 10;
		int card = c % 10;
		String result = null;

		if (card == 0)
			--palo;
		switch (palo) {
		case 0:
			result = "Bastos";
			break;
		case 1:
			result = "Espadas";
			break;
		case 2:
			result = "Oros";
			break;
		case 3:
			result = "Copas";
			break;
		}
		if (card > 7 || card == 0)
			switch (card) {
			case 0:
				result = "Rey de " + result;
				break;
			case 8:
				result = "Sota de " + result;
				break;
			case 9:
				result = "Caballo de " + result;
				break;
			}
		else
			result = card + " de " + result;
		return result;
	}

}
