package pojo;

public class Subject {

	private int Subject_id;
	private String Subject_name;
	private Section section;
	private Standard standard;
	private Standard standard_division;
	private Staff_type staff_type;
	private Staff staff;
	
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
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	public Standard getStandard_division() {
		return standard_division;
	}
	public void setStandard_division(Standard standard_division) {
		this.standard_division = standard_division;
	}
	public Staff_type getStaff_type() {
		return staff_type;
	}
	public void setStaff_type(Staff_type staff_type) {
		this.staff_type = staff_type;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
	
	
	
}
