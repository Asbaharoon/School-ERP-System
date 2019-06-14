package pojo;

public class Book {

	private int book_id;
	private String book_name;
	private String book_author_name;
	private Section section;
	private Standard standard;
	private byte[] book_image;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author_name() {
		return book_author_name;
	}
	public void setBook_author_name(String book_author_name) {
		this.book_author_name = book_author_name;
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
	public byte[] getBook_image() {
		return book_image;
	}
	public void setBook_image(byte[] book_image) {
		this.book_image = book_image;
	}
	
	
	
	
}
