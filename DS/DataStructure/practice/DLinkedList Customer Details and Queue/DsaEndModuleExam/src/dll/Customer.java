package dll;

public class Customer {
	private int id;
	private String name;
	private String city;
	private int pinCode;
	private int mobileNo;
	public Customer() {
		super();
	}
	public Customer(int id, String name, String city, int pinCode, int mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pinCode = pinCode;
		this.mobileNo = mobileNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", city=" + city + ", pinCode=" + pinCode + ", mobileNo="
				+ mobileNo + "]";
	}
	

}
