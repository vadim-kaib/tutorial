package javapoint.parameterReflection;

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
		testParameterReflection1();
	}

	private static void testParameterReflection1() {
		ParameterReflection1 o = new ParameterReflection1();
		o.Test();
	}
}
