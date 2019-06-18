package pojo;

import java.util.List;

public class Staff {

	private int Staff_id;
	private String Staff_name;
	private byte[] Staff_photo;
	private byte[] Staff_proof;
	private String Staff_class;
	private String Staff_subject;
	private String Staff_gender;
	private String Staff_dob;
	private String Staff_mob;
	private String Staff_email;
	private String Staff_pass;
	private String Staff_qulification;
	private String Staff_date;
	private String Add_line;
	private String Add_city;
	private String Add_state;
	private String Add_pincode;
	private double salary;
	
	private Staff_type stafftype;
		
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getStaff_id() {
		return Staff_id;
	}
	public void setStaff_id(int staff_id) {
		Staff_id = staff_id;
	}
	public String getStaff_name() {
		return Staff_name;
	}
	public void setStaff_name(String staff_name) {
		Staff_name = staff_name;
	}
	public byte[] getStaff_photo() {
		return Staff_photo;
	}
	public void setStaff_photo(byte[] staff_photo) {
		Staff_photo = staff_photo;
	}
	public byte[] getStaff_proof() {
		return Staff_proof;
	}
	public void setStaff_proof(byte[] staff_proof) {
		Staff_proof = staff_proof;
	}
	public String getStaff_class() {
		return Staff_class;
	}
	public void setStaff_class(String staff_class) {
		Staff_class = staff_class;
	}
	public String getStaff_subject() {
		return Staff_subject;
	}
	public void setStaff_subject(String staff_subject) {
		Staff_subject = staff_subject;
	}
	public String getStaff_gender() {
		return Staff_gender;
	}
	public void setStaff_gender(String staff_gender) {
		Staff_gender = staff_gender;
	}
	public String getStaff_dob() {
		return Staff_dob;
	}
	public void setStaff_dob(String staff_dob) {
		Staff_dob = staff_dob;
	}
	public String getStaff_mob() {
		return Staff_mob;
	}
	public void setStaff_mob(String staff_mob) {
		Staff_mob = staff_mob;
	}
	public String getStaff_email() {
		return Staff_email;
	}
	public void setStaff_email(String staff_email) {
		Staff_email = staff_email;
	}
	public String getStaff_pass() {
		return Staff_pass;
	}
	public void setStaff_pass(String staff_pass) {
		Staff_pass = staff_pass;
	}
	public String getStaff_qulification() {
		return Staff_qulification;
	}
	public void setStaff_qulification(String staff_qulification) {
		Staff_qulification = staff_qulification;
	}
	public String getStaff_date() {
		return Staff_date;
	}
	public void setStaff_date(String staff_date) {
		Staff_date = staff_date;
	}
	
	public String getAdd_line() {
		return Add_line;
	}
	public void setAdd_line(String add_line) {
		Add_line = add_line;
	}
	public String getAdd_city() {
		return Add_city;
	}
	public void setAdd_city(String add_city) {
		Add_city = add_city;
	}
	public String getAdd_state() {
		return Add_state;
	}
	public void setAdd_state(String add_state) {
		Add_state = add_state;
	}
	public String getAdd_pincode() {
		return Add_pincode;
	}
	public void setAdd_pincode(String add_pincode) {
		Add_pincode = add_pincode;
	}
	public Staff_type getStafftype() {
		return stafftype;
	}
	public void setStafftype(Staff_type stafftype) {
		this.stafftype = stafftype;
	}
	
	

}
