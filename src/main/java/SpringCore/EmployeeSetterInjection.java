package SpringCore;

public class EmployeeSetterInjection {

	private int empId;
	private String empName;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public void display() {
		System.out.println("Employee ID is :"  +empId);
		System.out.println("Employee Name is :"+empName);
		System.out.println(address);
		
	}
	

}

