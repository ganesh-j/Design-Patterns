package structural.proxy;

public class CEOProxy implements Listener {

	@Override
	public void listen() {
		System.out.println("Routing through proxy");
		CEO c = new CEO();
		c.listen();
		//ObjectOutputStream
		//DEserialize
		//ObjectInputStream
		

	}

}
