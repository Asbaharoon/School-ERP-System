package pojo;

import java.util.List;

public class Timetable {

	private int time_id;
	private Timetable_type timetable_type;
	private List<Section> section;
	private List<Standard> standard;
	private List<Standard> standard_division;
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
	public byte[] getTt_image() {
		return tt_image;
	}
	public void setTt_image(byte[] tt_image) {
		this.tt_image = tt_image;
	}
	
	
	
}
