package pojo;

public class Subject {

	private int Subject_id;
	private String Subject_name;
	private Section section;
	private Staff staff;
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	private Standard standard;
	
	public int getSubject_id() {
		return Subject_id;
	}
	public void setSubject_id(int subject_id) {
		Subject_id = subject_id;
	}
	public String getSubject_name() {
		return Subject_name;
	}
	public void setSubject_name(String subject_name) {
		Subject_name = subject_name;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	
	
	
}
