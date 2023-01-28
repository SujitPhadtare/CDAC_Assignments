package pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "admissions", uniqueConstraints = { @UniqueConstraint(columnNames = { "course_id", "student_id" }) })
public class Admission extends BaseEntity {
	@Column(name = "application_date")
	private LocalDate applicationDate;
	@Column(name = "result_date")
	private LocalDate resultDate;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Status status;

	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course chosenCourse;
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student candidate;

	public Admission() {
		super();
	}

	public Admission(LocalDate applicationDate, LocalDate resultDate, Status status, Course chosenCourse,
			Student candidate) {
		super();
		this.applicationDate = applicationDate;
		this.resultDate = resultDate;
		this.status = status;
		this.chosenCourse = chosenCourse;
		this.candidate = candidate;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public LocalDate getResultDate() {
		return resultDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setResultDate(LocalDate resultDate) {
		this.resultDate = resultDate;
	}

	public Course getChosenCourse() {
		return chosenCourse;
	}

	public void setChosenCourse(Course choosenCourse) {
		this.chosenCourse = choosenCourse;
	}

	public Student getCandidate() {
		return candidate;
	}

	public void setCandidate(Student candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "Applicaton ID " + getId() + "Admission [applicationDate=" + applicationDate + ", resultDate="
				+ resultDate + ", status=" + status + "]";
	}
}