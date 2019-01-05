package javapoint.lambda;

interface Sayable4 {
	public String say(String name);
}

public class LambdaExpressionExample4 {

	public void Test() {
		// Lambda expression with single parameter.
		Sayable4 s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

		// You can omit function parentheses
		Sayable4 s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));
	}
}
