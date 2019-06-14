package pojo;

import java.util.List;

public class Staff_timetable {

	private int st_id;
	private List<Staff> staff;
	private Timetable_type timetable_type;
	private byte[] st_image;
	
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	public Timetable_type getTimetable_type() {
		return timetable_type;
	}
	public void setTimetable_type(Timetable_type timetable_type) {
		this.timetable_type = timetable_type;
	}
	public byte[] getSt_image() {
		return st_image;
	}
	public void setSt_image(byte[] st_image) {
		this.st_image = st_image;
	}
	
	
	
	
}
