package javapoint.string.joiner;

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
//		testStringJoinerExample1();
//		testStringJoinerExample2();
		testStringJoinerExample3();
		testStringJoinerExample4();
	}

	private static void testStringJoinerExample1() {
		StringJoinerExample1 o = new StringJoinerExample1();
		o.Test();
	}
	
	private static void testStringJoinerExample2() {
		StringJoinerExample2 o = new StringJoinerExample2();
		o.Test();
	}
	
	private static void testStringJoinerExample3() {
		StringJoinerExample3 o = new StringJoinerExample3();
		o.Test();
	}
	
	private static void testStringJoinerExample4() {
		StringJoinerExample4 o = new StringJoinerExample4();
		o.Test();
	}	
}
