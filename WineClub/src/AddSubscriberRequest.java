import java.util.Collection;

// Boundary class for a request to add a subscriber
public abstract class AddSubscriberRequest {
	String street, city, state, zip;
	String name, email, phone, twitter, facebook;
	
	public AddSubscriberRequest(String street, String c, String state, String z, String n, String e, String p, String tw, String fb) {
		this.street = street;
		this.city = c;
		this.state = state;
		this.zip = z;
		this.name = n;
		this.email = e;
		this.phone = p;
		this.twitter = tw;
		this.facebook = fb;
	}
	
	public abstract AddSubscriberResponse addAccount(Collection<Subscriber> subs);
}
