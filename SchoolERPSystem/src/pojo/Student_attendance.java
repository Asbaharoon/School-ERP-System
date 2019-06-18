package pojo;

import java.util.List;

public class Student_attendance {

	private int att_id; 
	private String stud_attendance;
	private String att_date;
	
	private Student student;
	
	private Section section;
	
	private Standard standard;
	
	
	public int getAtt_id() {
		return att_id;
	}
	public void setAtt_id(int att_id) {
		this.att_id = att_id;
	}
	public String getStud_attendance() {
		return stud_attendance;
	}
	public void setStud_attendance(String stud_attendance) {
		this.stud_attendance = stud_attendance;
	}
	public String getAtt_date() {
		return att_date;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setAtt_date(String att_date) {
		this.att_date = att_date;
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
	
	
}
