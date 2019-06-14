package pojo;

import java.util.List;

public class Marks {

	private int marks_id;
	private Exam_type exam_type;
	private List<Section> section;
	private List<Standard> standard;
	private List<Standard> standard_division;
	private List<Subject> subject1;
	private List<Subject> subject2;
	private List<Subject> subject3;
	private List<Subject> subject4;
	private List<Subject> subject5;
	private List<Subject> subject6;
	private String totalmarks;
	private double average;
	private double parcentage;
	private String grade;
	private String status;
	private List<Student> student;
	public int getMarks_id() {
		return marks_id;
	}
	public void setMarks_id(int marks_id) {
		this.marks_id = marks_id;
	}
	public Exam_type getExam_type() {
		return exam_type;
	}
	public void setExam_type(Exam_type exam_type) {
		this.exam_type = exam_type;
	}
	public List<Section> getSection() {
		return section;
	}
	public void setSection(List<Section> section) {
		this.section = section;
	}
	public List<Standard> getStandard() {
		return standard;
	}
	public void setStandard(List<Standard> standard) {
		this.standard = standard;
	}
	public List<Standard> getStandard_division() {
		return standard_division;
	}
	public void setStandard_division(List<Standard> standard_division) {
		this.standard_division = standard_division;
	}
	public List<Subject> getSubject1() {
		return subject1;
	}
	public void setSubject1(List<Subject> subject1) {
		this.subject1 = subject1;
	}
	public List<Subject> getSubject2() {
		return subject2;
	}
	public void setSubject2(List<Subject> subject2) {
		this.subject2 = subject2;
	}
	public List<Subject> getSubject3() {
		return subject3;
	}
	public void setSubject3(List<Subject> subject3) {
		this.subject3 = subject3;
	}
	public List<Subject> getSubject4() {
		return subject4;
	}
	public void setSubject4(List<Subject> subject4) {
		this.subject4 = subject4;
	}
	public List<Subject> getSubject5() {
		return subject5;
	}
	public void setSubject5(List<Subject> subject5) {
		this.subject5 = subject5;
	}
	public List<Subject> getSubject6() {
		return subject6;
	}
	public void setSubject6(List<Subject> subject6) {
		this.subject6 = subject6;
	}
	public String getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getParcentage() {
		return parcentage;
	}
	public void setParcentage(double parcentage) {
		this.parcentage = parcentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
		
	
	
}
