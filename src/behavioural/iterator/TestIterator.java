package behavioural.iterator;

public class TestIterator {

	public static void main(String[] args) {
		Container con = new NameStore();
		NameStoreIterator nsItr = con.getIterator();
		while(nsItr.hasNext()) {
			System.out.println(nsItr.next());
		}
		

	}

}
