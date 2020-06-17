package FactoryMethod;

public class Driver {
	public static void main(String[] args) {
		Shape line = ShapeFactory.getShape("Line");
		if (line != null) {
			line.draw();
		} else {
			System.out.println("This shape can not be drawn.");
		}

		Shape triangle = ShapeFactory.getShape("Triangle");
		if (triangle != null) {
			triangle.draw();
		} else {
			System.out.println("This shape can not be drawn.");
		}
	}
}
