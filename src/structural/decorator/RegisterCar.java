package structural.decorator;

public class RegisterCar implements CarDecorator {

	@Override
	public void decorate(Car c) {
		c.isRegistered = true;
		
	}

}
