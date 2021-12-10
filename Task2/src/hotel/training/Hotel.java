package hotel.training;

public class Hotel {
    private String H_name;// H represents Hotel.
    private String H_Address;
    private int H_Contact;
    private String H_Order;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String h_name, String h_Address, int h_Contact, String h_Order) {
		super();
		H_name = h_name;
		H_Address = h_Address;
		H_Contact = h_Contact;
		H_Order = h_Order;
	}
	public String getH_name() {
		return H_name;
	}
	public void setH_name(String h_name) {
		H_name = h_name;
	}
	public String getH_Address() {
		return H_Address;
	}
	public void setH_Address(String h_Address) {
		H_Address = h_Address;
	}
	public int getH_Contact() {
		return H_Contact;
	}
	public void setH_Contact(int h_Contact) {
		H_Contact = h_Contact;
	}
	public String getH_Order() {
		return H_Order;
	}
	public void setH_Order(String h_Order) {
		H_Order = h_Order;
	}
	
}
