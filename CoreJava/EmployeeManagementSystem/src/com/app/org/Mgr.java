package com.app.org;

public class Mgr extends Emp {

	private double perfBonus;

	public Mgr(String fname, String lname, int deptId, double basicSalary, double perfBonus) {
		super(fname, lname, deptId, basicSalary);
		this.perfBonus = perfBonus;
	}

	public double getPerfBonus() {
		return perfBonus;
	}

	@Override
	public double computeNetSalary() {
		return getBasicSalary() + perfBonus;
	}

}
