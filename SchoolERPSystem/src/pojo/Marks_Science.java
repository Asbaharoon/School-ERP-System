package pojo;

public class Marks_Science 
{

	private int marks_sid;
	private Exam_type exam_type;
	private Section section;
	private Standard standard;
	private Standard standard_division;
	
	private String Physics;
	private String Chemistry;
	private String English;
	private String Maths;
	private String Computer;
	private String Biology;
	
	
	private double average;
	private double parcentage;
	private String grade;
	private String status;
	private Student student;
	
	
	
	public String getBiology() {
		return Biology;
	}
	public void setBiology(String biology) {
		Biology = biology;
	}
	
	
	public int getMarks_sid() {
		return marks_sid;
	}
	public void setMarks_sid(int marks_sid) {
		this.marks_sid = marks_sid;
	}
	public Exam_type getExam_type() {
		return exam_type;
	}
	public void setExam_type(Exam_type exam_type) {
		this.exam_type = exam_type;
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
	public String getPhysics() {
		return Physics;
	}
	public void setPhysics(String physics) {
		Physics = physics;
	}
	public String getChemistry() {
		return Chemistry;
	}
	public void setChemistry(String chemistry) {
		Chemistry = chemistry;
	}
	public String getEnglish() {
		return English;
	}
	public void setEnglish(String english) {
		English = english;
	}
	public String getMaths() {
		return Maths;
	}
	public void setMaths(String maths) {
		Maths = maths;
	}
	public String getComputer() {
		return Computer;
	}
	public void setComputer(String computer) {
		Computer = computer;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
