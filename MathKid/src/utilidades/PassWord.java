package utilidades;

public class PassWord {

	private String password;

	public PassWord() {
		this.password = password;
	}

	// metodo que genera contraseña aleatoria
	public PassWord(int n) {
		do {
			this.password = "";
			for (int i = 0; i < n; i++) {
				int option = (int) (Math.random() * 4);
				switch (option) {
				case 0:
					this.password += randomChar('a', 'z');
					break;
				case 1:
					this.password += randomChar('A', 'Z');
					break;
				case 2:
					this.password += randomChar('0', '9');
					break;
				default:
					this.password += randomChar((char) 33, (char) 43);
				}
			}
		} while (!this.isStrong());
	}

	public String getPassword() {
		return password;
	}

	// Mostrar contraseña oculta
	public String getHiddenPassword() {
		String s = "";
		for (int i = 0; i < this.password.length(); i++)
			s += "*";
		return s;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Metodo para verificar que cumple los requisitos
	public boolean isStrong() {

		// boolean strong = false;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		if (this.password.length() < 8)
			return false;
		for (int i = 0; i < this.password.length(); i++) {

			char c = this.password.charAt(i);

			if (c >= '0' && c <= '9')
				c1++;

			else if (c >= 'A' && c <= 'Z')
				c2++;
			else if (c >= 'a' && c <= 'z')
				c3++;

			else
				c4++;

		}

		return (c1 >= 1) && (c2 >= 1) && (c3 >= 1) && (c4 >= 1);

	}

	// aqui generamos caracteres aleatorios
	private char randomChar(char c1, char c2) {
		char randomChar = (char) ((int) (Math.random() * (c2 - c1) + c1));
		return randomChar;

	}
}