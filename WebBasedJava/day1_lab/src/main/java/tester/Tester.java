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

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDao empDao = new EmployeeDaoImpl();
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// triggers class loading n static
			// init block
			System.out.println("hibernate up n running !!!!!! \n\n");
			System.out.println("Options : 1. add new Employee 2. Display Employee by salary 100: EXIT");

			boolean exit = false;

			while (!exit) {

				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter emp details : firstName, lastName, dept, salary, dob, isPermanent");
						// create transient emp
						Employee emp = new Employee(sc.next(), sc.next(), Department.valueOf(sc.next().toUpperCase()),
								sc.nextDouble(), LocalDate.parse(sc.next()), sc.nextBoolean());
						// invoke dao's method
						System.out.println(empDao.addEmpDetails(emp));
						break;
					case 2:
						System.out.println("Enter salary amount :");
						double sal = sc.nextDouble();
						empDao.getEmpbySal(sal).forEach(x -> System.out.println(x));
						break;
					case 3:
						empDao.getAllEmployees().forEach(System.out::println);
						break;
					case 100:
						exit = true;
						break;
					default:
						System.out.println("Invalid choice!!!!!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program ended!!!!!");
	}
}
