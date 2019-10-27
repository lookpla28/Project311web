package model;

import java.util.List;
import java.util.Vector;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	private String doctor_id;
	
	@Column(name="doctor_name")
	private String doctor_name;
	
	@Column(name="tele")
	private String tele;
	
	@Column(name="address")
	private String address;
	
	@OneToMany(cascade = {CascadeType.ALL} , mappedBy = "pk.doctor")
	private List<DoctorPatient> doc_pat = new Vector<>();
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctor_id, String doctor_name, String tele, String address) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.tele = tele;
		this.address = address;
	}
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
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
