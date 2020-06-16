package structural.decorator;

public class Accessories implements CarDecorator {

	@Override
	public void decorate(Car c) {
		c.isAccesoriesFitted = true;

	}

}
