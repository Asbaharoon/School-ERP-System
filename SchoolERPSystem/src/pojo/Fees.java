package pojo;

public class Fees {

	private int fee_id;
	private String date;
	private double amt_paid;
	private double amt_remaining;
	private double trans_paid;
	private double trans_remaining;
	private String status;
	private Student student;
	private Standard standard;
	private Section section;
	private Standard standard_div;
	
	
	public Standard getStandard_div() {
		return standard_div;
	}
	public void setStandard_div(Standard standard_div) {
		this.standard_div = standard_div;
	}
	public int getFee_id() {
		return fee_id;
	}
	public void setFee_id(int fee_id) {
		this.fee_id = fee_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmt_paid() {
		return amt_paid;
	}
	public void setAmt_paid(double amt_paid) {
		this.amt_paid = amt_paid;
	}
	public double getAmt_remaining() {
		return amt_remaining;
	}
	public void setAmt_remaining(double amt_remaining) {
		this.amt_remaining = amt_remaining;
	}
	public double getTrans_paid() {
		return trans_paid;
	}
	public void setTrans_paid(double trans_paid) {
		this.trans_paid = trans_paid;
	}
	public double getTrans_remaining() {
		return trans_remaining;
	}
	public void setTrans_remaining(double trans_remaining) {
		this.trans_remaining = trans_remaining;
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
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	
	
}
