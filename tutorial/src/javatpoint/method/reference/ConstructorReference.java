package javatpoint.method.reference;

interface IConstructorReference {
	ConstructorReference getMessage(String msg);
}

public class ConstructorReference {
	ConstructorReference(String msg) {
		System.out.print(msg);
	}
}
