package com.cubic.ehr.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cubic.ehr.common.Gender;
import com.cubic.ehr.common.Specialization;
import com.cubic.ehr.common.Status;

@Entity
@Table(name = "PRESCRIBER")
public class PrescriberEntity {

	@Id
	@SequenceGenerator(name = "pSeq", sequenceName = "JPA_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "pSeq")
	@Column(name = "ID")
	private Long pk;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "PHONENUMBER")
	private String phoneNumber;
	@Column(name = "FAXNUMBER")
	private String faxNumber;
	@Column(name = "EMAILID")
	private String emailId;
	@Column(name = "DEANUMBER")
	private String deaNumber;
	@Column(name = "ACTIVE")
	@Enumerated(EnumType.STRING)
	private Status active;
	@Column(name = "SPECIALIZATION")
	@Enumerated(EnumType.STRING)
	private Specialization specialization;
//	@Column(name = "CREATEDDATE")
//	private String createdDate;
//	@Column(name = "MODIFIEDDATE")
//	private String modifiedDate;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "GENDER")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(name = "DESCRIPTION")
	private String description;

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDeaNumber() {
		return deaNumber;
	}

	public void setDeaNumber(String deaNumber) {
		this.deaNumber = deaNumber;
	}

	public Status getActive() {
		return active;
	}

	public void setActive(Status active) {
		this.active = active;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

//	public String getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(String createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public String getModifiedDate() {
//		return modifiedDate;
//	}
//
//	public void setModifiedDate(String modifiedDate) {
//		this.modifiedDate = modifiedDate;
//	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date date) {
		this.dob = date;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PrescriberEntity [pk=" + pk + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", faxNumber=" + faxNumber + ", emailId=" + emailId + ", deaNumber=" + deaNumber
				+ ", active=" + active + ", specialization=" + specialization + ", createdDate=" 
				+ ", modifiedDate="  + ", dob=" + dob + ", gender=" + gender + ", description="
				+ description + "]";
	}

}
