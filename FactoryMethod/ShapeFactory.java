package FactoryMethod;

public abstract class ShapeFactory {
	public static Shape getShape(String name) {
		Shape shape = null;

		if ("Line".equals(name))
			shape = new Line();
		else if ("CIRCLE".equals(name))
			shape = new Circle();
		else if ("RECTANGLE".equals(name))
			shape = new Rectangle();
		return shape;
	}
}
