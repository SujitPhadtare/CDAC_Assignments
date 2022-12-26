package day7lab;

public class Employee_3 {
	private int id;
	private String name;
	private double basicSalary, hra, netSalary, grossSalary, pf, pt = 200;
	private double medical = 1000;

	public Employee_3(int id, String name, double basicSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public Employee_3() {
		this.id = 0;
		this.name = "null";
		this.basicSalary = 0.0;
	}

	private double calHRA() {
		hra = 0.5 * basicSalary;
		return hra;
	}

	private double calPF() {
		pf = 0.12 * basicSalary;
		return pf;
	}

	public double grossSalary() {
		grossSalary = basicSalary + calHRA() + medical;
		return grossSalary;
	}

	public double netSalary() {
		netSalary = grossSalary() - (pt + calPF());
		return netSalary;
	}

	public void display() {
		System.out.println("Employee name : " + name);
		System.out.println("Employee ID : " + id);
		System.out.println("Net salary : " + netSalary());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_3 emp = new Employee_3(229219, "Sujit", 100000);
		emp.display();

	}

}
