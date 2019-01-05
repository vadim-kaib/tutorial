package javapoint.functionalInterface;

interface IFunctionalInterfaceExample3 {
	default void doIt() {
		System.out.println("Do it now");
	}
}

@FunctionalInterface
interface FInterface extends IFunctionalInterfaceExample3 {
	void say(String msg); // abstract method
}

public class FunctionalInterfaceExample3 implements FInterface {
	public void say(String msg) {
		System.out.println(msg);
	}
}
