package Hanged_Object;

public class Vidas {

	private int vidas;

	public Vidas() {
		this.vidas = 5;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int restarVida() {
		vidas = vidas - 1;
		return vidas;
	}

	public int sumarVida() {
		vidas = vidas + 1;
		return vidas;
	}

}
