package javapoint.stream.filter;

public class JavaStreamFilterExample {
	int id;
	String name;
	float price;

	public JavaStreamFilterExample(int id, String name, float price) {
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
