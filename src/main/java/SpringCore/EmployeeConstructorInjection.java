package SpringCore;

public class EmployeeConstructorInjection {

	private int empId;
	private String empName;
	private String empCity;
	public EmployeeConstructorInjection(int empId,String empName,String empCity) {
		this.empId=empId;
		this.empName=empName;
		this.empCity=empCity;
	}
	public void display() {
		System.out.println("Employee ID is :"  +empId);
		System.out.println("Employee Name is :"+empName);
		System.out.println("Employee City is :"+empCity);
	}
}
