package structural.adapter;

public class Window {
	String name;
	WinListener wl;
	public Window(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void addWinListener(WinListener l) {
		this.wl = l;
	}

	public void windowclosing() {
		WindowEvent we =  new WindowEvent("Register");
		this.wl.windowClosing(we);
		
	}
	
	

	
	
}
