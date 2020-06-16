package structural.proxy;

import java.io.Serializable;

public class CEO implements Listener,Serializable {

	@Override
	public void listen() {
		System.out.println("CEO   listening");

	}

}
