package javapoint.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {

	public void Test() {
		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");

		list.forEach((n) -> System.out.println(n));
	}
}
