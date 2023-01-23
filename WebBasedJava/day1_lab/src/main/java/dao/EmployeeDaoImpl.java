package dao;

import pojos.Employee;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String addEmpDetails(Employee newEmp) {
		// newEmp : TRANSIENT , only preasent in JAva heap
		String msg = "Emp add failed!!!";

		// 1. Get hibernate(hbn) session from session factory (SF)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a transaction
		Transaction tx = session.beginTransaction();
		try {
			// Session API : public serializable save
			Long empId = (Long) session.save(newEmp);
			// newEmp : PERSISTENT => enetity ref added to L1 cache
			tx.commit(); // hbn performs auto dirty checking --> trigers session.flush()
			// DML -- insert query will be fired --
			// session will be closed session.close() => L1 cache destroyed
			// rets DB cn to database connection pool(DBCP)
			// newEmp : DETACHED from L1 cache

			msg = "Added emp details, ID = " + newEmp.getEmpId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw same exc to the caller : so that the caller will know about the exc
			throw e;
		}
		return msg;
	}

}

/*
 * // 1. Get hibernate(hbn) session from session factory (SF) Session session =
 * getFactory().getCurrentSession(); // 2. Begin a transaction Transaction tx =
 * session.beginTransaction(); try {
 * 
 * 
 * tx.commit(); } catch (RuntimeException e) { if (tx != null) tx.rollback(); //
 * re throw same exc to the caller : so that the caller will know about the exc
 * throw e; }
 */