package pojo;

public class Standard {

	private int Standard_id;
	private String Standard_name;
	private String Standard_division;
	private double Totalfees;
	private double Transportfees;
	
	private Section section;
	
	private Staff staff;

	
	
	public double getTransportfees() {
		return Transportfees;
	}

	public void setTransportfees(double transportfees) {
		Transportfees = transportfees;
	}

	public double getTotalfees() {
		return Totalfees;
	}

	public void setTotalfees(double totalfees) {
		Totalfees = totalfees;
	}

	public int getStandard_id() {
		return Standard_id;
	}

	public void setStandard_id(int standard_id) {
		Standard_id = standard_id;
	}

	public String getStandard_name() {
		return Standard_name;
	}

	public void setStandard_name(String standard_name) {
		Standard_name = standard_name;
	}

	public String getStandard_division() {
		return Standard_division;
	}

	public void setStandard_division(String standard_division) {
		Standard_division = standard_division;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	

}
