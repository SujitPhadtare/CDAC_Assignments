package tester;

import static utils.HibernateUtils.getFactory;
import org.hibernate.*;
import org.hibernate.SessionFactory;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (SessionFactory sf = getFactory()) { //triggers class loading n static init block
			System.out.println("hibernate up n running !!!!!!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
