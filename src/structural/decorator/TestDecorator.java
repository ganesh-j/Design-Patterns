package structural.decorator;

public class TestDecorator {
	public static void main(String[] args) {


		Car c = new Car();
		System.out.println(c);
		CarShowRoom cs = new CarShowRoom();
		cs.decorate(c);
		System.out.println(c);

	}
}
