package creational.builder;

public class RideBuilder {

	public static Ride getMicroride() {
		Ride r= new Ride();
		r.hm.put("Distance", new Distance());
		r.hm.put("Waiting", new Waiting());
		r.hm.put("Mini Category", new Mini());
		r.hm.put("Rating", new Rating());
		return r;
	}
}
