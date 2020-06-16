package behavioural.strategy;

public class Context {
	
	ArmyStrategy strategy = null;

	public Context(ArmyStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void execute() {
		strategy.doOperation();
	}
	
}
