package pojo;

import java.util.List;

public class Salary {

	private int sal_id;
	private Staff_type staff_type;
	private List<Staff> staff;
	private Staff staff_salary;
	private Staff_attendance staff_attendance;
	private String date;
	private String payable_amount;
	private String status;
	
	
	public int getSal_id() {
		return sal_id;
	}
	public void setSal_id(int sal_id) {
		this.sal_id = sal_id;
	}
	public Staff_type getStaff_type() {
		return staff_type;
	}
	public void setStaff_type(Staff_type staff_type) {
		this.staff_type = staff_type;
	}
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	public Staff getStaff_salary() {
		return staff_salary;
	}
	public void setStaff_salary(Staff staff_salary) {
		this.staff_salary = staff_salary;
	}
	public Staff_attendance getStaff_attendance() {
		return staff_attendance;
	}
	public void setStaff_attendance(Staff_attendance staff_attendance) {
		this.staff_attendance = staff_attendance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPayable_amount() {
		return payable_amount;
	}
	public void setPayable_amount(String payable_amount) {
		this.payable_amount = payable_amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
