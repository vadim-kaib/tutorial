package javapoint.stream;

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
//		testJavaStreamExample1();
//		testJavaStreamExample2();
//		testJavaStreamExample3();
//		testJavaStreamExample4();
//		testJavaStreamExample5();
//		testJavaStreamExample6();
//		testJavaStreamExample7();
//		testJavaStreamExample8();
//		testJavaStreamExample9();
//		testJavaStreamExample10();
		testJavaStreamExample11();
	}

	private static void testJavaStreamExample1() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));
		List<Float> productPriceList = new ArrayList<Float>();
		for (JavaStreamExample1 product : productsList) {

			// filtering data of list
			if (product.price < 30000) {
				productPriceList.add(product.price); // adding price to a productPriceList
			}
		}
		System.out.println(productPriceList); // displaying data
	}

	private static void testJavaStreamExample2() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));
		List<JavaStreamExample> productPriceList = productsList.stream().filter(p -> p.price > 30000)
				.map(p -> new JavaStreamExample(p.name, p.price)).collect(Collectors.toList());
		List<Integer> productPriceListId = productsList.stream().filter(p -> p.price > 30000).map(p -> p.id)
				.collect(Collectors.toList());
		List<String> productPriceListName = productsList.stream().filter(p -> p.price > 30000).map(p -> p.name)
				.collect(Collectors.toList());
		List<Float> productPriceListPrice = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList);
		System.out.println(productPriceListId);
		System.out.println(productPriceListName);
		System.out.println(productPriceListPrice);
	}

	private static void testJavaStreamExample3() {
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);
	}

	private static void testJavaStreamExample4() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));

		// This is more compact approach for filtering data
		productsList.stream().filter(product -> product.price == 30000).forEach(product -> System.out.println(product));
	}

	private static void testJavaStreamExample5() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));

		// This is more compact approach for filtering data
		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);
		// More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum);
		// accumulating price, by referring method of Float class
		System.out.println(totalPrice2);

		Integer totalId = productsList.stream().map(product -> product.id).reduce(0, (sum, id) -> sum + id);
		System.out.println(totalId);
		Integer totalId2 = productsList.stream().map(product -> product.id).reduce(0, Integer::sum);
		System.out.println(totalId2);

		String totalName = productsList.stream().map(product -> product.name).reduce("",
				(total, name) -> total + ", " + name);
		System.out.println(totalName);
		String totalName2 = productsList.stream().map(product -> product.name).reduce("", String::concat);
		System.out.println(totalName2);

	}

	private static void testJavaStreamExample6() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));

		// Using Collectors's method to sum the prices.
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println(totalPrice3);
	}

	private static void testJavaStreamExample7() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));

		// max() method to get max Product price
		JavaStreamExample1 productA = productsList.stream()
				.max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();

		System.out.println(productA.price);
		// min() method to get min Product price
		JavaStreamExample1 productB = productsList.stream()
				.max((product1, product2) -> product1.price < product2.price ? 1 : -1).get();
		System.out.println(productB.price);
	}

	private static void testJavaStreamExample8() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));

		// count number of products based on the filter
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		System.out.println(count);
	}

	private static void testJavaStreamExample9() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));

		// Converting product List into Set
		Set<Float> productPriceList = productsList.stream().filter(product -> product.price < 30000) // filter product
																										// on the base
																										// of price
				.map(product -> product.price).collect(Collectors.toSet()); // collect it as Set(remove duplicate
																			// elements)
		System.out.println(productPriceList);
	}

	private static void testJavaStreamExample10() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));

		// Converting Product List into a Map
		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));

		System.out.println(productPriceMap);

		Map<Integer, JavaStreamExample1> productPriceMap2 = productsList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p));

		System.out.println(productPriceMap2);
	}

	private static void testJavaStreamExample11() {
		List<JavaStreamExample1> productsList = new ArrayList<JavaStreamExample1>();
		// Adding Products
		productsList.add(new JavaStreamExample1(1, "HP Laptop", 25000f));
		productsList.add(new JavaStreamExample1(2, "Dell Laptop", 30000f));
		productsList.add(new JavaStreamExample1(3, "Lenevo Laptop", 28000f));
		productsList.add(new JavaStreamExample1(4, "Sony Laptop", 28000f));
		productsList.add(new JavaStreamExample1(5, "Apple Laptop", 90000f));

		List<Float> productPriceList = productsList.stream().filter(p -> p.price > 30000) // filtering data
				.map(JavaStreamExample1::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList);
	}
}
