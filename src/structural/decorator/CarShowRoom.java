package structural.decorator;

public class CarShowRoom {
	Accessories a = new Accessories();
	ServiceCar sc = new ServiceCar();
	RegisterCar rc = new RegisterCar();
	DeliverCar dc = new DeliverCar();
	public void decorate(Car c) {
		a.decorate(c);
		sc.decorate(c);
		rc.decorate(c);
		dc.decorate(c);
		
	}

}
