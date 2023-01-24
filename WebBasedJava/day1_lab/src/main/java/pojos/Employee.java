package pojos;

import java.time.LocalDate;
import javax.persistence.*;

//Employee : id (auto_increment : PK) , first name ,last name ,
//department (enum : RND,FINANCE,MARKETING,HR,BILLING), salary, dob(LocalDate) ,isPermanent(boolean)
@Entity
@Table(name = "emps", uniqueConstraints = @UniqueConstraint(columnNames = { "first_name", "last_name" }))
public class Employee {
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // => auto_increment ids
	@Column(name = "emp_id")
	private Long empId;
	@Column(name = "first_name", length = 20)
	private String firstName;
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Enumerated(EnumType.STRING) // => column type is string, ll store enum constant name
	@Column(length = 20)
	private Department dept;
	private double salary;
	private LocalDate dob;
	@Column(name = "is_permanent")
	private boolean isPermanent;

	public Employee(String firstName, String lastName, Department dept, double salary, LocalDate dob,
			boolean isPermanent) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.salary = salary;
		this.dob = dob;
		this.isPermanent = isPermanent;
	}
	
	

	public Employee(Long empId, String firstName, String lastName, double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}



	public Employee() {
		super();
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
				+ ", salary=" + salary + ", dob=" + dob + ", isPermanent=" + isPermanent + "]";
	}

}
