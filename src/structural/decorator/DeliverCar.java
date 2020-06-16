package structural.decorator;

public class DeliverCar implements CarDecorator {

	@Override
	public void decorate(Car c) {
		c.isDelivered = true;
	}

}
