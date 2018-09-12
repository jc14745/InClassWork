package Examples;

public class Vehicles {
	public static void main(String [] args) {
	Car c1 = new Car("Ford", "Escape", "Purple");
	System.out.println(c1);
	HatchBack h1 = new HatchBack("Ford", "Escape", "blue", 5);
	System.out.println("My brand new hatchback " + h1);
	}
}
