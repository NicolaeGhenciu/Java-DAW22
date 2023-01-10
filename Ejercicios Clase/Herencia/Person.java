package Herencia;

public class Person {
	protected String name;
	protected String tel;
	private String email;

	public Person(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public Person() {
		
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", tel=" + tel + ", email=" + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
