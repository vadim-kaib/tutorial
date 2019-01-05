package javapoint.parallelArraySorting;

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
//		testParallelArraySorting1();
		testParallelArraySorting2();
	}

	private static void testParallelArraySorting1() {
		ParallelArraySorting1 o = new ParallelArraySorting1();
		o.Test();
	}
		
	private static void testParallelArraySorting2() {
		ParallelArraySorting2 o = new ParallelArraySorting2();
		o.Test();
	}	
}
