package pojo;

public class Result {

	private int result_id;
	private Exam_type exam_type;
	private Section section;
	private Standard standard;
	private Standard standard_division;
	private Student student;
	private Marks marks;
	private Marks average;
	private Marks parcentage;
	private Marks grade;
	private Marks status;
	
	
	public int getResult_id() {
		return result_id;
	}
	public void setResult_id(int result_id) {
		this.result_id = result_id;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public Marks getAverage() {
		return average;
	}
	public void setAverage(Marks average) {
		this.average = average;
	}
	public Marks getParcentage() {
		return parcentage;
	}
	public void setParcentage(Marks parcentage) {
		this.parcentage = parcentage;
	}
	public Marks getGrade() {
		return grade;
	}
	public void setGrade(Marks grade) {
		this.grade = grade;
	}
	public Marks getStatus() {
		return status;
	}
	public void setStatus(Marks status) {
		this.status = status;
	}
	
	
}
