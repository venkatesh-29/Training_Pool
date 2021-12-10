package emp.training;
public class Employee {
	private int E_Id;  // E represents Employee.
	private String E_Name;
	private int E_Phone;
	private double E_Salary;
	private String E_Email;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int e_Id, String e_Name, int e_Phone, double e_Salary, String e_Email) {
		super();
		E_Id = e_Id;
		E_Name = e_Name;
		E_Phone = e_Phone;
		E_Salary = e_Salary;
		E_Email = e_Email;
	}
	public int getE_Id() {
		return E_Id;
	}
	public void setE_Id(int e_Id) {
		E_Id = e_Id;
	}
	public String getE_Name() {
		return E_Name;
	}
	public void setE_Name(String e_Name) {
		E_Name = e_Name;
	}
	public int getE_Phone() {
		return E_Phone;
	}
	public void setE_Phone(int e_Phone) {
		E_Phone = e_Phone;
	}
	public double getE_Salary() {
		return E_Salary;
	}
	public void setE_Salary(double e_Salary) {
		E_Salary = e_Salary;
	}
	public String getE_Email() {
		return E_Email;
	}
	public void setE_Email(String e_Email) {
		E_Email = e_Email;
	}
}



