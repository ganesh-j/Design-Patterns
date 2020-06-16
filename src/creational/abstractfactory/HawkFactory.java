package creational.abstractfactory;

public class HawkFactory extends AbstractEagleFactory {

	@Override
	public Eagle getEagle() {
		return new HawkEagle();
	}

}
