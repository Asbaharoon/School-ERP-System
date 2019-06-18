package pojo;

import java.util.List;

public class Leave {

	private int leave_id;
	private Staff Staff;
	private Staff_type staff_type;
	private String leave_title;
	private String from_date;
	private  String to_date;
	private String reason;
	private String status;
	
	public int getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}
	
	public Staff getStaff() {
		return Staff;
	}
	public void setStaff(Staff staff) {
		Staff = staff;
	}
	public Staff_type getStaff_type() {
		return staff_type;
	}
	public void setStaff_type(Staff_type staff_type) {
		this.staff_type = staff_type;
	}
	public String getLeave_title() {
		return leave_title;
	}
	public void setLeave_title(String leave_title) {
		this.leave_title = leave_title;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
