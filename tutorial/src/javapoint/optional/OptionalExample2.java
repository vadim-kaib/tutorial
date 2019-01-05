package javapoint.optional;

import java.util.Optional;
import java.util.StringJoiner;

public class OptionalExample2 {

	public void Test() {
		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) { // check for value is present or not
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("string value is not present");		
	}
}
