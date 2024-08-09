package com.example.tablecreation.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "number")
	private String num;

	@Column(name = "mail")
	private String mailId;
	
	@Column(name = "message")
	private String message;

	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "term")
	private String term;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "end_subcription")
	private String endSubcription;
	
	@Column(name = "date_of_joining")
	private String dateOfJoining;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "updated_on")	
	private Timestamp updatedOn;

	@Column(name = "active_status")
	private Boolean activeStatus;
	
	
	@Column(name = "is_deleted")
	private Boolean isDeleted;

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

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
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

	public contact() {
		super();
	}

	

	public contact(Long id, String name, String num, String mailId, String message, String address, String city,
			String term, String dob, String endSubcription, String dateOfJoining, Timestamp createdOn,
			Timestamp updatedOn, Boolean activeStatus, Boolean isDeleted) {
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
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.activeStatus = activeStatus;
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "contact [id=" + id + ", name=" + name + ", num=" + num + ", mailId=" + mailId + ", message=" + message
				+ ", address=" + address + ", city=" + city + ", term=" + term + ", dob=" + dob + ", endSubcription="
				+ endSubcription + ", dateOfJoining=" + dateOfJoining + ", createdOn=" + createdOn + ", updatedOn="
				+ updatedOn + ", activeStatus=" + activeStatus + ", isDeleted=" + isDeleted + "]";
	}

	
	
	
}
