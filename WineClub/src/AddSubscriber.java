import java.util.Collection;

public class AddSubscriber extends AddSubscriberRequest {
	private Address a;
	private Subscriber s;

	public AddSubscriber(String street, String city, String state, String zip,
			String name, String email, String phone, String tw, String fb) {
		super(street, city, state, zip, name, email, phone, tw, fb);
	}
	
	
	@Override
	public AddSubscriberResponse addAccount(Collection<Subscriber> subs) {
		a = new Address(this.street, this.city, this.state, this.zip);
		s = new Subscriber (this.name, this.email, this.phone, a, this.facebook, this.twitter);
		
		if (addressInBannedState()) {
			return new AddSubscriberResponse(0, false, "Cannot ship to this state");
		}
		
		if (userHasAccount(subs, s)) {
			return new AddSubscriberResponse(0, false, "User already has an account");
		} else {
			subs.add(s);
			return new AddSubscriberResponse(s.getID(), true, "Congratulations");
		}
	}
	
	private boolean userHasAccount(Collection<Subscriber> subs, Subscriber s) {
		return false;
	}
	
	private boolean addressInBannedState() {
		return false;
	}
	
}
