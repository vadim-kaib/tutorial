package javapoint.typeInference;

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
//		testTypeInferenceExample1();
		testTypeInferenceExample2();
	}

	private static void testTypeInferenceExample1() {
		TypeInferenceExample1 o = new TypeInferenceExample1();
		o.Test();
	}
	
	private static void testTypeInferenceExample2() {
		TypeInferenceExample2 o = new TypeInferenceExample2();
		o.Test();
	}		
}
