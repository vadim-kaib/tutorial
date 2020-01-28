package javatpoint.method.reference;

interface IConstructorReference {
	ConstructorReference getMessage(String msg);
}
/*
 * ConstructorReference
 * */
public class ConstructorReference {
	ConstructorReference(String msg) {
		System.out.print(msg);
	}
}
