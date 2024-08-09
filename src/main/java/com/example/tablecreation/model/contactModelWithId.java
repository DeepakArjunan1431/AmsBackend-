package com.example.tablecreation.model;

public class contactModelWithId {
	
	private Long id;
	private String name;
	private String num;
	private String mailId;
	private String message;
	private String address;
	private String city;
	private String term;
	private String dob;
	private String endSubcription;
	private String dateOfJoining;
	private Boolean activeStatus;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEndSubcription() {
		return endSubcription;
	}
	public void setEndSubcription(String endSubcription) {
		this.endSubcription = endSubcription;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Boolean getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public contactModelWithId(Long id, String name, String num, String mailId, String message, String address,
			String city, String term, String dob, String endSubcription, String dateOfJoining, Boolean activeStatus) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
		this.mailId = mailId;
		this.message = message;
		this.address = address;
		this.city = city;
		this.term = term;
		this.dob = dob;
		this.endSubcription = endSubcription;
		this.dateOfJoining = dateOfJoining;
		this.activeStatus = activeStatus;
	}
	@Override
	public String toString() {
		return "contactModelWithId [id=" + id + ", name=" + name + ", num=" + num + ", mailId=" + mailId + ", message="
				+ message + ", address=" + address + ", city=" + city + ", term=" + term + ", dob=" + dob
				+ ", endSubcription=" + endSubcription + ", dateOfJoining=" + dateOfJoining + ", activeStatus="
				+ activeStatus + "]";
	}
	
	
	
	
}
