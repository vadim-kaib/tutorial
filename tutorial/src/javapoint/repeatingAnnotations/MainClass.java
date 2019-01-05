package javapoint.repeatingAnnotations;

//A simple annotation type.
@interface MyAnnotation {
	String stringValue();

	int intValue();
}

public class MainClass {
	// Annotate a method.
	@MyAnnotation(stringValue = "Annotation Example", intValue = 100)
	public static void myMethod() {
	}
}
