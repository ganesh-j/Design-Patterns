package behavioural.command;

public class WashingMachine {
	Command c;

	public void setCommand(Command c) {

		this.c = c;
	}

	public void wash() {

		switch (c.mode) {
		case GENTLE:
					preWash();
					rinse();
					if(c.spin.equals(Spin.SPIN))
						spinMachine();
					break;
		case HEAVY:
					preWash();
					rinse();
					if(c.spin.equals(Spin.SPIN))
					spinMachine();
					heayWash();
					break;
		case NORMAL:
					preWash();
					rinse();
					if(c.spin.equals(Spin.SPIN))
						spinMachine();
					normalWash();
		
					break;

		default:
			break;
		}

	}

	private void heayWash() {
		System.out.println("Heavywash done");
		
	}

	private void rinse() {
		System.out.println("Rinsing done");
		
	}

	private void normalWash() {
		System.out.println("Noraml wash done");
		
	}

	private void spinMachine() {
		System.out.println("Spinning done");
		
	}

	private void preWash() {
		System.out.println("PreWash done");
		}

}
