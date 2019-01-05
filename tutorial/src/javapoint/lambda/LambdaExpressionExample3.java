package javapoint.lambda;

interface Sayable{  
    public String say();  
}  

public class LambdaExpressionExample3 {
	int width = 10;

	public void Test() {
	    Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}
}
