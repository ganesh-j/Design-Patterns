package behavioural.strategy;

public class TestStrategy {

	public static void main(String[] args) {

		Context ctx = new Context (new IsraelStrategy());
		ctx.execute();

	}

}
