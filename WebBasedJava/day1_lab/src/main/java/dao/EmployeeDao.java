package dao;

import java.util.List;

import pojos.Employee;

public interface EmployeeDao {
	// add a method to save emp details
	String addEmpDetails(Employee newEmp);
	
	List<Employee> getAllEmployees();
	
	List<Employee> getEmpbySal(double sal);
	
	List<Employee> getPermanentEmps();
}
