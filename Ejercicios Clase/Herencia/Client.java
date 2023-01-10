package Herencia;

public class Client extends Person{
	private String cupon;
	
	public Client(String name, String tel, String email, String cupon) {
		super(name,tel,email);
		this.cupon = cupon;
	}

	public String getCupon() {
		return cupon;
	}

	public void setCupon(String cupon) {
		this.cupon = cupon;
	}

	@Override
	public String toString() {
		return super.toString() + "Client [cupon=" + cupon + ", name=" + name + ", tel=" + tel + "]";
	}

	
	
}
