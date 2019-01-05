package javapoint.functionalInterface;

public class TestSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testFunctionalInterfaceExample1();
		testFunctionalInterfaceExample2();
		testFunctionalInterfaceExample3();
	}

	private static void testFunctionalInterfaceExample1() {
		FunctionalInterfaceExample1 fie = new FunctionalInterfaceExample1();
		fie.say("Hello there");
	}

	private static void testFunctionalInterfaceExample2() {
		FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
		fie.say("Hello there");
	}
	
	private static void testFunctionalInterfaceExample3() {
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();  
        fie.say("Hello there");  
        fie.doIt();  
	}	
}
