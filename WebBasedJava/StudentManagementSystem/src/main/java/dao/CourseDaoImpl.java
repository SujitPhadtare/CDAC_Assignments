package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Course;
import static utils.HibernateUtils.getFactory;

public class CourseDaoImpl implements CourseDao {

	@Override
	public String addNewCourse(Course course) {
		String mesg = "Cannot add new Course";

		Session session = getFactory().getCurrentSession();

		Transaction tx = session.beginTransaction();

		try {
			session.persist(course);
			tx.commit();
			mesg = "New course added";

		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

}
