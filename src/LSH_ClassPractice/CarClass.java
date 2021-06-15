package LSH_ClassPractice;

class Car {
	private String name;
	private String maker;
	private String model;
	private int speed;

	Car(String inputName) {
		this.name = inputName;
	}

	public void doStart() {
		this.speed = 1;
	}

	public void doStop() {
		this.speed = 0;
	}

	public void stepAccelerate() {
		this.speed += 10;
	}

	public void stepBreak() {
		this.speed -= 10;
		if (this.speed < 0)
			this.speed = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

}

public class CarClass {

}
