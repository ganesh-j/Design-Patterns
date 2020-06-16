package creational.abstractfactory;

public class EagleFactory {
	public static Eagle createEagle(AbstractEagleFactory aef) {
		return aef.getEagle();
	}

}
