package structural.composite;

public class Rectangle implements Graphics {

	@Override
	public void draw(String color) {
		System.out.println("Drawing rectangle with " + color + "color");
	}

}
