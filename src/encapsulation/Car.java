package encapsulation;

public class Car {
	public String name;
	private String price;
	private String  toSpeed;

	public Car(String name, String price, String toSpeed) {
		this.name = name;
		this.price = price;
		this.toSpeed = toSpeed;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getToSpeed() {
		return toSpeed;
	}

	public void setToSpeed(String  toSpeed) {
		this.toSpeed = toSpeed;
	}

	
	
	

}
