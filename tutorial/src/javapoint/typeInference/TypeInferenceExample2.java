package javapoint.typeInference;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

class GenericClass<X> {  
    X name;  
  public void setName(X name){  
      this.name = name;  
    }  
  public X getName(){  
      return name;  
    }  
  public String genericMethod(GenericClass<String> x){  
      x.setName("John");  
      return x.name;  
    }  
} 

public class TypeInferenceExample2 {
	
    public static void showList(List<Integer>list){  
        if(!list.isEmpty()){  
            list.forEach(System.out::println);  
        }else System.out.println("list is empty");  
    }  	

	public void Test() {
        GenericClass<String> genericClass = new GenericClass<String>();  
        genericClass.setName("Peter");  
        System.out.println(genericClass.getName());  
          
        GenericClass<String> genericClass2 = new GenericClass<>();  
        genericClass2.setName("peter");  
        System.out.println(genericClass2.getName());  
      
        // New improved type inference  
        System.out.println(genericClass2.genericMethod(new GenericClass<>()));  
	}
}
