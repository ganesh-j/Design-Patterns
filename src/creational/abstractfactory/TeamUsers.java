package creational.abstractfactory;

public class TeamUsers {
	
	public void processEagle(AbstractEagleFactory aef) {
	Eagle e = EagleFactory.createEagle(aef);
	e.fly();
	e.hunt();
	}
}
