package javatpoint.method.reference;

import java.util.function.BiFunction;

public class TestSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		testMethodReference1();
//		testMethodReference2();
//		testMethodReference3();
//		testMethodReference4();
//		testInstanceMethodReference1();
//		testInstanceMethodReference2();
//		testInstanceMethodReference3();
		testConstructorReference();
	}

	private static void testMethodReference1() {
		// Referring static method
		Sayable sayable = MethodReference1::saySomething;
		// Calling interface method
		sayable.say();
	}

	private static void testMethodReference2() {
		Thread t2 = new Thread(MethodReference2::ThreadStatus);
		t2.start();
	}

	private static void testMethodReference3() {
		BiFunction<Integer, Integer, Integer> adder = MethodReference3::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}

	private static void testMethodReference4() {
		BiFunction<Integer, Integer, Integer> adder1 = MethodReference4::add;
		BiFunction<Integer, Float, Float> adder2 = MethodReference4::add;
		BiFunction<Float, Float, Float> adder3 = MethodReference4::add;
		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	private static void testInstanceMethodReference1() {
		InstanceMethodReference1 methodReference = new InstanceMethodReference1(); // Creating object
		// Referring non-static method using reference
		Sayable sayable = methodReference::saySomething;
		// Calling interface method
		sayable.say();
		// Referring non-static method using anonymous object
		Sayable sayable2 = new InstanceMethodReference1()::saySomething; // You can use anonymous object also
		// Calling interface method
		sayable2.say();
	}

	private static void testInstanceMethodReference2() {
		Thread t2 = new Thread(new InstanceMethodReference2()::printnMsg);
		t2.start();
	}
	
	private static void testInstanceMethodReference3() {
		BiFunction<Integer, Integer, Integer>adder = new InstanceMethodReference3()::add;  
		int result = adder.apply(10, 20);  
		System.out.println(result);  
	}	
	
	private static void testConstructorReference() {
        IConstructorReference hello = ConstructorReference::new;  
        hello.getMessage("Hello");  
	}		
}
