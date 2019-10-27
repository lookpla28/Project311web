package model;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	@Id
	private String patient_id;
	
	@Column(name="patient_name")
	private String patient_name;
	
	@Column(name="brithday")
	private Date brithday;
	
	@Column(name="address")
	private String address;
	
	@OneToMany(cascade = {CascadeType.ALL} , mappedBy = "pk.patient")
	private List<DoctorPatient> doc_pat = new Vector<>();
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String patient_id, String patient_name, Date brithday, String address) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.brithday = brithday;
		this.address = address;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<DoctorPatient> getDoc_pat() {
		return doc_pat;
	}
	public void setDoc_pat(List<DoctorPatient> doc_pat) {
		this.doc_pat = doc_pat;
	}
	
	
	

}
