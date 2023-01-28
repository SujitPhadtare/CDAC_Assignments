package pojos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends BaseEntity {

	@Column(name = "first_name", length = 20)
	private String firstName;
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Column(length = 30, unique = true)
	private String email;

	// student take many admissions
	// Student 1-->* admissions
	@OneToMany(mappedBy = "candidate", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Admission> admissions = new ArrayList<Admission>();

	@ManyToMany
	@JoinTable(name = "student_projects", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	private Set<Project> projects = new HashSet<Project>();

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student id=" + getId() + "[firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}

}
