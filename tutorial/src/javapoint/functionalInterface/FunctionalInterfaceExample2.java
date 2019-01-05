package javapoint.functionalInterface;

@FunctionalInterface  
interface IFunctionalInterfaceExample2 {
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}


public class FunctionalInterfaceExample2 implements IFunctionalInterfaceExample2 {
    public void say(String msg){  
        System.out.println(msg);  
    }  
}