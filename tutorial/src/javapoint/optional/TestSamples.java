package javapoint.optional;

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
//		testOptionalExample1();
//		testOptionalExample2();
//		testOptionalExample3();
//		testOptionalExample4();
		testOptionalExample5();
	}

	private static void testOptionalExample1() {
		OptionalExample1 o = new OptionalExample1();
		o.Test();
	}
	
	private static void testOptionalExample2() {
		OptionalExample2 o = new OptionalExample2();
		o.Test();
	}	
	
	private static void testOptionalExample3() {
		OptionalExample3 o = new OptionalExample3();
		o.Test();
	}	
	
	private static void testOptionalExample4() {
		OptionalExample4 o = new OptionalExample4();
		o.Test();
	}	
	
	private static void testOptionalExample5() {
		OptionalExample5 o = new OptionalExample5();
		o.Test();
	}		
}
