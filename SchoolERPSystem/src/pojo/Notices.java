package pojo;

public class Notices {
	
	private int notice_id;
	private String title;
	private String message;
	private byte[] n_image;
	
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public byte[] getN_image() {
		return n_image;
	}
	public void setN_image(byte[] n_image) {
		this.n_image = n_image;
	}


}
