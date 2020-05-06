package bidFeature;

public class Users {
	private String name;
	private String email;
	private long phone;
	private String zipcode;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	private String address;
	private int maxbid;
	private String itemName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMaxbid() {
		return maxbid;
	}
	public void setMaxbid(int maxbid) {
		this.maxbid = maxbid;
	}
	
	public String toString() {
		return "Users[Name = " + name  + "Email = " + email + "phone " + phone+ " Address = " + address + "Maximum bid value " + maxbid + "Item Name = " + itemName+"]";
		
	}
	
}
