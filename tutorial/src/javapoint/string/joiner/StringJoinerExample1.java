package javapoint.string.joiner;

import java.util.StringJoiner;

public class StringJoinerExample1 {

	public void Test() {
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
        
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);  
	}
}
