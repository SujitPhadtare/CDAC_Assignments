package com.app.org;

public class Emp {
	private int empId;
	private String fname;
	private String lname;
	private int deptId;
	private double basicSalary;
	private static int counter;

	static {
		counter = 101;
	}

	public Emp(String fname, String lname, int deptId, double basicSalary) {
		super();
		this.empId = counter;
		this.fname = fname;
		this.lname = lname;
		this.deptId = deptId;
		this.basicSalary = basicSalary;
		counter++;
	}

	public Emp(String fname,String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

//	public Emp(String lname) {
//		super();
//		this.lname = lname;
//	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "empid = " + empId + ", fname = " + fname + ", lname = " + lname + ", deptId = " + deptId
				+ ", basicSal= " + basicSalary;
	}

	@Override
	public boolean equals(Object anotherEmp) {
		if (anotherEmp instanceof Emp)
			return this.fname.equals(((Emp) anotherEmp).fname) && this.lname.equals(((Emp) anotherEmp).lname);
		// => If not Emp
		return false;
	}

	public double computeNetSalary() {
		return 0;
	}
	

}
