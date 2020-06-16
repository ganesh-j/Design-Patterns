package behavioural.iterator;

public class NameStore implements Container {

	String names[] = {"GK" ,"RK", "MK"};
	@Override
	public NameStoreIterator getIterator() {
		
		return new NameStoreIteratorImpl();
	}
	
	private class NameStoreIteratorImpl implements NameStoreIterator{
		int index = 0;
		@Override
		public boolean hasNext() {
			if(index<names.length)
				return true;
			return false;
		}

		@Override
		public String next() {
			if(hasNext()) {
				return names[index++];
			}
			return null;
		}
		
	}

}
