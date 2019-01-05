package javapoint.lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Sayable8 {
	String say(String message);
}

public class LambdaExpressionExample8 {

	public void Test() {
		// You can pass multiple statements in lambda expression
		Sayable8 person = (message) -> {
			String str1 = "I would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.say("time is precious."));
	}
}
