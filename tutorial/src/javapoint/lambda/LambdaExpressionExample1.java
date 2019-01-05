package javapoint.lambda;

interface Drawable {
	public void draw();
}

public class LambdaExpressionExample1 {
	int width = 10;

	public void Test() {
		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();
	}
}
