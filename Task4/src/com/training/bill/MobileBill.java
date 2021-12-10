package com.training.bill;

public class MobileBill {
	private String customerName;
	private long mobilenumber;
	private String planname ;
	private Address address;
	public MobileBill() {
		super();
	
	}
	/**
	 * @param customerName
	 * @param mobilenumber
	 * @param planname
	 */
	
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName
	 * @param mobilenumber
	 * @param planname
	 * @param address
	 */
	public MobileBill(String customerName, long mobilenumber, String planname, Address address) {
		super();
		this.customerName = customerName;
		this.mobilenumber = mobilenumber;
		this.planname = planname;
		this.address = address;
	}

	/**
	 * @return the mobilenumber
	 */
	public long getMobilenumber() {
		return mobilenumber;
	}

	/**
	 * @param mobilenumber the mobilenumber to set
	 */
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	/**
	 * @return the planname
	 */
	public String getPlanname() {
		return planname;
	}

	/**
	 * @param planname the planname to set
	 */
	public void setPlanname(String planname) {
		this.planname = planname;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


}
