package constructor;

public class Car {
	private String colour;
	private String name;
	private int  nwheels;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNwheels() {
		return nwheels;
	}
	public void setNwheels(int nwheels) {
		this.nwheels = nwheels;
	}
	
	
	
	public Car(String colour, String name, int nwheels) {
		super();
		this.colour = colour;
		this.name = name;
		this.nwheels = nwheels;
	}
	

}
