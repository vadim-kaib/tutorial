package javapoint.functionalInterface;

@FunctionalInterface  
interface IFunctionalInterfaceExample1 {
	void say(String msg);
}

public class FunctionalInterfaceExample1 implements IFunctionalInterfaceExample1 {
    public void say(String msg){  
        System.out.println(msg);  
    }  
}
