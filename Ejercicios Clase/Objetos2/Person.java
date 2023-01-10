package Objetos2;

public class Person {
	private String name;
	private String tel;
	private int age;
	private PassWord password;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", tel=" + tel + ", age=" + age +" , password="+password.getHiddenPassword()+ "]";
	}

	public Person(String name,String tel,int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
		this.password = new PassWord();
	}
	public PassWord getPassword() {
		return password;
	}

	public Person(String name) {
		this(name,"",0);
		
	}
    public boolean isAdult() {
    	if (age >= 18)
    		return true;
    	return false;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}