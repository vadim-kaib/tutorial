package javapoint.stream;

public class JavaStreamExample1 {
	int id;
	String name;
	float price;

	public JavaStreamExample1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + price;
	}
}
