package pojo;

import java.util.Date;
import java.util.List;

public class Event {

	private int event_id;
	private Event_type event_type;
	private String event_title;
	private Date from_date;
	private Date to_date;
	private String time;
	private String venue;
	private String event_handler;
	private double budget;
	private byte[] event_image;
	
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	
	public Event_type getEvent_type() {
		return event_type;
	}
	public void setEvent_type(Event_type event_type) {
		this.event_type = event_type;
	}
	public String getEvent_title() {
		return event_title;
	}
	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getEvent_handler() {
		return event_handler;
	}
	public void setEvent_handler(String event_handler) {
		this.event_handler = event_handler;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public byte[] getEvent_image() {
		return event_image;
	}
	public void setEvent_image(byte[] event_image) {
		this.event_image = event_image;
	}
	
	
	
}

