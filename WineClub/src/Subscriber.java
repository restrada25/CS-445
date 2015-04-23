public class Subscriber {
    private String name, email, phone, twitter, facebook;
    private Address address;
    private MonthlySelectionType mst;
    private int ID;
    
    public Subscriber() {
    	this.name = "Jane Doe";
    	this.email = "jane.doe@example.com";
    	this.phone = "1234567890";
    	this.address = new Address();
    	this.mst = MonthlySelectionType.RW;
    	this.ID = IdGenerator.newID();
    }
    public Subscriber (String name, String email, String phone, Address address) {
    	this.name = name;
    	this.email = email;
    	this.phone = phone.replaceAll("[\\s\\-()]", ""); // drop all non-digit characters
    	this.address = address;
    	this.mst = MonthlySelectionType.RW;
    	this.ID = IdGenerator.newID();
    }
    public Subscriber (String name, String email, String phone, Address address, String fb, String tw) {
    	this.name = name;
    	this.email = email;
    	this.phone = phone.replaceAll("[\\s\\-()]", ""); // drop all non-digit characters
    	this.address = address;
    	this.twitter = tw;
    	this.facebook = fb;
    	this.mst = MonthlySelectionType.RW;
    	this.ID = IdGenerator.newID();
    }

    private boolean isMatchName(String kw) {
    	String regex = "(?i).*" + kw + ".*";
    	return this.name.matches(regex);
    }

    private boolean isMatchEmail(String kw) {
    	String regex = "(?i).*" + kw + ".*";
    	return this.email.matches(regex);
    }

    private boolean isMatchPhone(String kw) {
    	String s = kw.replaceAll("[\\s\\-()]", ""); // drop all non-digit characters from search string
    	String regex = "(?i).*" + s + ".*";
    	return this.phone.matches(regex);
    }
    public boolean isMatch(String kw) {
    	if (isMatchName(kw) || isMatchEmail(kw) || isMatchPhone(kw)) {
    		return true;
    	} else return false;
    }

    public int getID() {
    	return this.ID;
    }

    public void updateInfo(String name, String email, String phone, Address address) {
    	this.name = name;
    	this.email = email;
    	this.phone = phone;
    	this.address = address;
    }
    
    public MonthlySelectionType getPreference() {
    	return mst;
    }
    
    public void setPreference(MonthlySelectionType t) {
    	this.mst = t;
    }

}
