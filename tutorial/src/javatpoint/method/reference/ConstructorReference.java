package javatpoint.method.reference;

interface IConstructorReference {
	ConstructorReference getMessage(String msg);
}
/*comment*/
public class ConstructorReference {
	ConstructorReference(String msg) {
		System.out.print(msg);
	}
}
