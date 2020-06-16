package structural.decorator;

public class ServiceCar implements CarDecorator {

	@Override
	public void decorate(Car c) {
		c.isWashed = true;
		
	}

}
