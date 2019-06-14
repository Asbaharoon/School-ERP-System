package pojo;

import java.util.List;

public class Staff_attendance {

	private int Staff_att_id; 
	private Staff_type staff_type;
	private String Staff_attendance;
	private String Staff_att_date;
	private List<Staff> staff;
	private double totalattendance;
	
	
	public double getTotalattendance() {
		return totalattendance;
	}
	public void setTotalattendance(double totalattendance) {
		this.totalattendance = totalattendance;
	}
	public int getStaff_att_id() {
		return Staff_att_id;
	}
	public void setStaff_att_id(int staff_att_id) {
		Staff_att_id = staff_att_id;
	}
	public Staff_type getStaff_type() {
		return staff_type;
	}
	public void setStaff_type(Staff_type staff_type) {
		this.staff_type = staff_type;
	}
	public String getStaff_attendance() {
		return Staff_attendance;
	}
	public void setStaff_attendance(String staff_attendance) {
		Staff_attendance = staff_attendance;
	}
	public String getStaff_att_date() {
		return Staff_att_date;
	}
	public void setStaff_att_date(String staff_att_date) {
		Staff_att_date = staff_att_date;
	}
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	
		
	
}
