package pojo;

import java.util.List;

public class Timetable {

	private int time_id;
	private Timetable_type timetable_type;
	private Section section;
	private Standard standard;
	private Standard standard_division;
	private byte[] tt_image;
	
	public int getTime_id() {
		return time_id;
	}
	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}
	public Timetable_type getTimetable_type() {
		return timetable_type;
	}
	public void setTimetable_type(Timetable_type timetable_type) {
		this.timetable_type = timetable_type;
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
	public byte[] getTt_image() {
		return tt_image;
	}
	public void setTt_image(byte[] tt_image) {
		this.tt_image = tt_image;
	}
	
	
	
}
