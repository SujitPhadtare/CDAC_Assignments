package com.app.org;

public class Worker extends Emp {

	private int hoursWorked;
	private double hourlyRate;

	public Worker(String fname, String lname, int deptId, double basicSalary, int hoursWorked, double hourlyRate) {
		super(fname, lname, deptId, basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public double computeNetSalary() {
		return getBasicSalary() + (hoursWorked * hourlyRate);
	}
}
