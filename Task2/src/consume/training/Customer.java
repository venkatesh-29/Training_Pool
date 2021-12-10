package consume.training;

public class Customer{
	private String C_Name;//C represents Customer.
	private int C_Phone_number;
	private String C_Gender;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String c_Name, int c_Phone_number, String c_Gender) {
		super();
		C_Name = c_Name;
		C_Phone_number = c_Phone_number;
		C_Gender = c_Gender;
	}
	public String getC_Name() {
		return C_Name;
	}
	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}
	public int getC_Phone_number() {
		return C_Phone_number;
	}
	public void setC_Phone_number(int c_Phone_number) {
		C_Phone_number = c_Phone_number;
	}
	public String getC_Gender() {
		return C_Gender;
	}
	public void setC_Gender(String c_Gender) {
		C_Gender = c_Gender;
	}
	
	

}
