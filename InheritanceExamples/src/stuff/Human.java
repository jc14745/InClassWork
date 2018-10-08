package stuff;

public class Human extends Animal {
	public String gender;
	public Human(String name, String gender) {
		super(name);
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
