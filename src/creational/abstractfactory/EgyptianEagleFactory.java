package creational.abstractfactory;

public class EgyptianEagleFactory extends AbstractEagleFactory {

	@Override
	public Eagle getEagle() {
		// TODO Auto-generated method stub
		return new EgyptianEagle();
	}

}
