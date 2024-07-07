package com.sanket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_info")
public class Student {
	
	@Id
	@Column(name = "Roll_No")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNumber;
	
	@Column(name = "Name")
	private String studentName;
	
	@Column(name = "Address")
	private String studentAddress;
	
	@Column(name = "Contact_Number")
	private long contactNumber;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + ", contactNumber=" + contactNumber + "]";
	}
}
