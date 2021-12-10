package emp.training;

public class EmployeeService {
	public double calculateBonus(Employee Emp) {
	return 	(Emp.getE_Salary()*33/100)+Emp.getE_Salary(); 
	}
}
