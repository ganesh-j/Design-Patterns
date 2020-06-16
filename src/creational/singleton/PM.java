package creational.singleton;

public class PM {
	public static final PM primeMinister =new PM();
	/*static {
		try {
			p= new PM();
		}catch(Exception  e) {
			
		}
	}*/
	private PM() {
		
	}
	public static PM getInstance() {
		return primeMinister;
	}
	
}
