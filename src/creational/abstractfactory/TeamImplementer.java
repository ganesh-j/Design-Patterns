package creational.abstractfactory;

public class TeamImplementer {

	public AbstractEagleFactory getRef() {
		AbstractEagleFactory aef = new HawkFactory();
		return aef;
	}
}
