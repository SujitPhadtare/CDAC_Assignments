package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.SessionFactory;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import pojos.Department;
import pojos.Employee;

public class AddEmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDao empDao = new EmployeeDaoImpl();
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// triggers class loading n static
			// init block
			System.out.println("hibernate up n running !!!!!! \n\n");
			System.out.println("Enter emp details : firstName, lastName, dept, salary, dob, isPermanent");
			// create transient emp
			Employee emp = new Employee(sc.next(), sc.next(), Department.valueOf(sc.next().toUpperCase()),
					sc.nextDouble(), LocalDate.parse(sc.next()), sc.nextBoolean());
			// invoke dao's method
			System.out.println(empDao.addEmpDetails(emp));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
