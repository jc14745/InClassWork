package ReviewA3;

public class UsingEnums {
	
	public enum nameOfDogs{Fluffy, Max, Dog};
	private nameOfDogs myDog = null;
	public static void main(String[] args) {
		UsingEnums test = new UsingEnums();
		test.setDogName(nameOfDogs.Fluffy);
		
	}
	public void setDogName(nameOfDogs dogName) {
		this.myDog = dogName;
	}
	public String whatIsTheDogsname() {
		String output = "";
		if(myDog.name().equals(nameOfDogs.Fluffy.name())) {
			//output += "Hey! It's Fluffy";
		
		}
		if(myDog.compareTo(nameOfDogs.Max) == 0) {
			output += "Come here Max";
			//System.out.println(output);
		}// option 2: using compareTo
		System.out.println(output);
		return output;
		
	}
	

}
