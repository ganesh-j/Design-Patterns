package creational.abstractfactory;

public class Test {

	public static void main(String[] args) {
		//Factory of Factories
		TeamImplementer ti = new TeamImplementer();
		AbstractEagleFactory aef = ti.getRef();
		TeamUsers tu = new TeamUsers();
		tu.processEagle(aef);
				
				
	}

}
