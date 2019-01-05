package javapoint.lambda;

public class LambdaExpressionExample2 {
	int width = 10;

	public void Test() {
		Drawable d = ()-> {
				System.out.println("Drawing " + width);
		};
		d.draw();
	}
}
