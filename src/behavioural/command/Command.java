package behavioural.command;

public class Command {
	Temp temp=null;
	WashingMode mode = null;
	Spin spin = null;
	public Command(Temp temp, WashingMode mode, Spin spin) {
		super();
		this.temp = temp;
		this.mode = mode;
		this.spin = spin;
	}
	
}
