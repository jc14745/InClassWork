package Examples;

public class HatchBack extends Car{
	private int luggageNum;
	public HatchBack (String make, String model, String color, int numOfLuggageInBack) {
		super(make, model, color);
		this.luggageNum = numOfLuggageInBack;
	}
	public int getLuggageNum() {
		return luggageNum;
	}
	public void setLuggageNum(int luggageNum) {
		this.luggageNum = luggageNum;
	}

}
