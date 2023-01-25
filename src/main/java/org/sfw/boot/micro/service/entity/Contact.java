package org.sfw.boot.micro.service.entity;

public class Contact {
	private Long contID;
	private String email;
	private String contName;
	private Long userID;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long contID, String email, String contName, Long userID) {
		super();
		this.contID = contID;
		this.email = email;
		this.contName = contName;
		this.userID = userID;
	}

	public Long getContID() {
		return contID;
	}

	public void setContID(Long contID) {
		this.contID = contID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContName() {
		return contName;
	}

	public void setContName(String contName) {
		this.contName = contName;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

}
