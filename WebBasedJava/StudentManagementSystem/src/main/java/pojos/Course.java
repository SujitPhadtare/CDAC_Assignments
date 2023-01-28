package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course extends BaseEntity {

//	i/p : all course i/ps (title , start date ,end date , fees ,capacity)
//	o/p : status message (success or failure)

	@Column(name = "title", unique = true, length = 100)
	private String courseTitle;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate endDate;
	private double fees;
	private Integer capacity;
	
	@OneToMany(mappedBy = "chosenCourse",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Admission> admissions=new ArrayList<>();

	public List<Admission> getAdmissions() {
		return admissions;
	}

	public void setAdmissions(List<Admission> admissions) {
		this.admissions = admissions;
	}

	public Course() {
		super();
	}

	public Course(String title, LocalDate startDate, LocalDate endDate, double fees, Integer capacity) {
		super();
		this.courseTitle = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.capacity = capacity;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Course id=" + getId() + "[title=" + courseTitle + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", fees=" + fees + ", capacity=" + capacity + "]";
	}

}
