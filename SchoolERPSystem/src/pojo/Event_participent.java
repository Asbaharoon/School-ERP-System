package pojo;

import java.util.List;

public class Event_participent {

	private int event_par_id;
	private String student_name;
	private String father_name;
	private Event_type event_type;
	private Event event_title;
	private String event_role;
	
	public int getEvent_par_id() {
		return event_par_id;
	}
	public void setEvent_par_id(int event_par_id) {
		this.event_par_id = event_par_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	
	public Event_type getEvent_type() {
		return event_type;
	}
	public void setEvent_type(Event_type event_type) {
		this.event_type = event_type;
	}
	
	public Event getEvent_title() {
		return event_title;
	}
	public void setEvent_title(Event event_title) {
		this.event_title = event_title;
	}
	public String getEvent_role() {
		return event_role;
	}
	public void setEvent_role(String event_role) {
		this.event_role = event_role;
	}
	
	
	
}
