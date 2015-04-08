public class Car {
	
	private String color;
	private double horsePower;
	private double engineSize;
	private String make;
	private static int count;
	
	public Car() {
		this.color = "Green";
		this.horsePower = 134;
		this.engineSize = 1.8;
		this.make = "Toyota Pruis";
		
	}
	
	public Car(String color, double horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
	}
	
	public boolean equals(Car object) {
		return (this.color == object.color) && (this.horsePower == object.horsePower) && (this.engineSize == object.engineSize) && (this.make == object.make);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
		
	}
	
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	
	public double getHorsePower() {
		return this.horsePower;
	}
	
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	
	public double getEngineSize() {
		return this.engineSize;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public static int getCount() {
		return count;
	}

	public String toString() {
		return "You customized a " + this.color + " " + this.make + " with a horse power of " + this.horsePower
				+ " HP "  + " and a engine size of " + this.engineSize + " L" + "."; 
	}
	

}
