package stuff;

import java.util.ArrayList;

public class MyClient {

	public static void main(String[] args) {
		
		ArrayList<Animal> allThings = new ArrayList<Animal>();
		//allThings.add(new Object());
		allThings.add(new Dog("Fluffy", "Brown"));
		//Dog fluffy = new Dog("Fluffy", "Brown");
		allThings.add(new Dog ("Wags", "Black and white"));
		//Dog was = new Dog("Wags", "Black and White");
		
		allThings.add(new Human("Molly", "female"));
		//Human molly = new Human("Molly", "female");
		for(int i = 0; i<allThings.size(); i++) {
			System.out.println(allThings.get(i).getName());
		}
		for(int i = 0; i<allThings.size(); i++) {
			Animal temp = allThings.get(i);
			if( temp instanceof Human) {
				System.out.println(temp.getName() + " " + ((Human)temp).getGender());
			}
		}
		
		for(int i = 0; i<allThings.size(); i++) {//has casting exception error since you cant cast human to dog
			Animal temp = allThings.get(i);
			if( temp instanceof Dog) {
				System.out.println(temp.getName() + " " + ((Human)temp).getGender());
			}
		}
		
		
		
	}

}
