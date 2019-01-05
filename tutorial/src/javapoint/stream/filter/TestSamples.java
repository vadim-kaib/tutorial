package javapoint.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		testJavaStreamFilterExample1();
		testJavaStreamFilterExample2();
	}

	private static void testJavaStreamFilterExample1() {
		List<JavaStreamFilterExample> productsList = new ArrayList<JavaStreamFilterExample>();
		// Adding Products
		productsList.add(new JavaStreamFilterExample(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamFilterExample(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamFilterExample(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamFilterExample(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamFilterExample(5, "Apple Laptop", 90000f));
		productsList.stream().filter(p -> p.price > 30000) // filtering price
				.map(pm -> pm.price) // fetching price
				.forEach(System.out::println); // iterating price
	}

	private static void testJavaStreamFilterExample2() {
		List<JavaStreamFilterExample> productsList = new ArrayList<JavaStreamFilterExample>();
		// Adding Products
		productsList.add(new JavaStreamFilterExample(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamFilterExample(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamFilterExample(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamFilterExample(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamFilterExample(5, "Apple Laptop", 90000f));
		List<Float> pricesList = productsList.stream().filter(p -> p.price > 30000) // filtering price
				.map(pm -> pm.price) // fetching price
				.collect(Collectors.toList());
		System.out.println(pricesList);
	}
}
