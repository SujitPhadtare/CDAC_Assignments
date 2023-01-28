package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.SessionFactory;

import dao.*;
import pojos.Course;

public class Tester {

	public static void main(String[] args) {

		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			CourseDao courseDao = new CourseDaoImpl();
			// triggers class loading n static
			// init block
			System.out.println("hibernate up n running !!!!!! \n\n");

			boolean exit = false;

			while (!exit) {
				System.out.println("Options : 1. Add New Course 2.  3. 4.  5.  100: EXIT");
				System.out.println("Select one option");
				try {
					switch (sc.nextInt()) {
					case 1:
						// Add new course
						// (title , start date ,end date , fees ,capacity)
						System.out.println("Enter course details : (title , start date ,end date , fees ,capacity)");
						Course newCourse = new Course(sc.next(), LocalDate.parse(sc.next()), LocalDate.parse(sc.next()),
								sc.nextDouble(), sc.nextInt());
						courseDao.addNewCourse(newCourse);
						break;
					case 2:

						break;
					case 100:
						exit = true;
						break;
					default:
						System.out.println("Invalid choice!!!!!");
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program ended!!!!!");
	}
}
