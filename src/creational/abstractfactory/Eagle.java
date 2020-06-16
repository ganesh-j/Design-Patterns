package creational.abstractfactory;

public abstract class Eagle extends Flying {
	abstract public void hunt();
	public void fly() {
		System.out.println("Eagle flying");
	}
}
