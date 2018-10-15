
public class PetBear extends Bear implements Pet {
	private String owner = null;
	private String name = null;
	public void setOwner(String owner) {
		this.owner = owner;
		
	}
	@Override
	public String getOwner() {
		
		return this.owner;
	}

	@Override
	public String getname() {
		
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

}
