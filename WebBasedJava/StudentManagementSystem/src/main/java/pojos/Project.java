package pojos;

import java.time.LocalDate;

import javax.persistence.*;

@Entity(name = "projects")
public class Project extends BaseEntity {
	@Column(name="project_title")
	private String projectTitle;
	@Column(name="completion_date")
	private LocalDate completionDate;

	
	public Project() {
		super();
	}

	public Project(String projectTitle, LocalDate completionDate) {
		super();
		this.projectTitle = projectTitle;
		this.completionDate = completionDate;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public LocalDate getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}

	@Override
	public String toString() {
		return "Project [projectTitle=" + projectTitle + ", completionDate=" + completionDate + "]";
	}

}
