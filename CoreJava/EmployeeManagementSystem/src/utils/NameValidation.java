package utils;

import com.app.org.Emp;

import customExceptions.DuplicateNameException;

public class NameValidation {
	// Validate first name
//	public static String validateFname(String fname,Emp[] empArr) {
//		Emp newEmp = new Emp(fname,null);
//		for(Emp e : empArr) {
//			if(e!=null)
//				if(e.equals(newEmp))
//					throw new DuplicateNameException("Employee with duplicate first name found");
//		}
//		return fname;
//	}
//
//	//Validate last name
//	public static String validateLname(String lname,Emp[] empArr) {
//		Emp newEmp = new Emp(null,lname);
//		for(Emp e : empArr) {
//			if(e!=null)
//				if(e.equals(newEmp))
//					throw new DuplicateNameException("Employee with duplicate last name found");
//		}
//		return lname;
//	}
//	

	// Validate Full(first & last) name of Employee
	public static boolean validateName(String fname, String lname, Emp[] empArr) throws DuplicateNameException {
		Emp newEmp = new Emp(fname, lname);
		for (Emp e : empArr) {
			if (e != null)
				if (e.equals(newEmp))
					throw new DuplicateNameException("Employee with duplicate name found");
//					return false;
		}
		return true;
	}

}