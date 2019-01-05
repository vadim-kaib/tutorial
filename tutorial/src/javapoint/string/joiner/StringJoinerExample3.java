package javapoint.string.joiner;

import java.util.StringJoiner;

public class StringJoinerExample3 {

	public void Test() {
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
        
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
  
        // Creating StringJoiner with :(colon) delimiter  
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
          
        // Adding values to StringJoiner  
        joinNames2.add("Peter");  
        joinNames2.add("Raheem");  
  
        // Merging two StringJoiner  
        StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println(merge);    
	}
}
