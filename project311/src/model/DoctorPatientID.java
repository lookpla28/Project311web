package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Embeddable
public class DoctorPatientID implements Serializable {
	@ManyToOne(fetch=FetchType.LAZY)
	private Doctor doctor;
	
	@ManyToOne
	private Patient  patient ;

	public DoctorPatientID() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorPatientID(Doctor doctor, Patient patient) {
		super();
		this.doctor = doctor;
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	

}
