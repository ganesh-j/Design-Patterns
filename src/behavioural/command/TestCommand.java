package behavioural.command;

public class TestCommand {
	public static void main(String[] args) {
		
		WashingMachine wm = new WashingMachine();
		Command c= new Command(Temp.SIXTY, WashingMode.HEAVY, Spin.SPIN);
		wm.setCommand(c);
		wm.wash();
		
	}
}
